package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pradnya {

	public static void main(String[] args) throws InterruptedException {
		Pradnya obj = new Pradnya();
		obj.m1();
	}

	public void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Apps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();

		String WinId1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
		Thread.sleep(1000);
		Set<String> WinId2 = driver.getWindowHandles();
		int Id = WinId2.size();
		System.out.println(Id);
		if (Id == 1) {
			driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("ABC@gmail.com");
			// driver.findElement(By.id("login_email1")).sendKeys("ABC");
		} else {

			for (String WinId : WinId2) {
				if (!(WinId == WinId1)) {
					driver.switchTo().window(WinId);
					driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("ABC@gmail.com");
					// driver.findElement(By.id("login_email1")).sendKeys("ABC");

				}
			}
		}
	}
}
