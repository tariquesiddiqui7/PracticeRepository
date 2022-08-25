package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Apps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String window1 = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!window.equals(window1)) {
				driver.switchTo().window(window);
				driver.findElement(By.xpath("//a[text()='Book a Free Demo']")).click();
				driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Tarique");
				driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Siddiqui");
			}
		}
		driver.switchTo().window(window1);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

}
