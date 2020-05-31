package SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserinit_util {
	
	WebDriver driver;
	public WebDriver returnDriver(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			break;
			
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
				 break;
		default:
			System.out.println(browser + " browser not available");
			
			break;
		}
		return driver;
		
		}
	
	
	public void launchUrl(String url) {
		 driver.get(url);
		}
	
	public void navigateTo(String url) {
		driver.get(url);
	}
	
	public String doGetTitle() {
	return	 driver.getTitle();
	}
	
}
	


