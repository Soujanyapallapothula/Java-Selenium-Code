package SeleniumTrainingAdvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "http://www.crmpro.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println(	driver.getTitle());//implicitlyWait wont work for non webElements like gettitle,gettext.
	}

}
