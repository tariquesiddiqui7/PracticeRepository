package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Apps\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//browser level methods
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");//minimise mode
		driver.manage().window().maximize();//tab maximise
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		}

}
