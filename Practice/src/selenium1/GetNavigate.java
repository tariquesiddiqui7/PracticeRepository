package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNavigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Testing Apps\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		
		
		driver.navigate().to("https://demo.automationtesting.in/Datepicker.html");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
	}

}
