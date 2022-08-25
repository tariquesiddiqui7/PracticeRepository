package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sushma {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Apps\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#signup-button input")).click();
		Thread.sleep(1000);
		List<WebElement> dayList=driver.findElements(By.xpath("//*[@id='day']//option"));
		
		for(WebElement day:dayList) {
			if(day.getText().equals("10"))
				day.click();
		}
		
		List<WebElement> monthList=driver.findElements(By.xpath("//*[@id='month']//option"));
		for(WebElement month:monthList) {
			if(month.getText().equalsIgnoreCase("Oct"))
				month.click();
		}
	
		List<WebElement> yearList=driver.findElements(By.xpath("//*[@id='year']//option"));
		for(WebElement year:yearList) {
			if(year.getText().equals("1996"))
				year.click();
		}
	}

}
