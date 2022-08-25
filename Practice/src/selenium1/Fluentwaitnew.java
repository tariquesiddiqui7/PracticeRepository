package selenium1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwaitnew {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Apps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")).click();
		//WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Siddiqui");
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		WebElement element=(WebElement) wait.until(new Function<WebDriver, WebElement>() 
		{
			public WebElement apply(WebDriver driver) 
			{
				return driver.findElement(By.xpath("//input[@name='firstname']"));
			}
			});
			element.sendKeys("Tarique");
	}
}
