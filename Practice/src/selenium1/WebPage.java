package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Apps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		//locator of that webelement
		//locator types : id, name, className, xpath
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		WebElement login=driver.findElement(By.className("button"));
		login.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Lisa']//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Lisa']//parent::td//following-sibling::td//a[text()='Andrews']//ancestor::table//a[text()='Lisa']//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
	}
}
