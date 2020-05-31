package SeleniumTrainingAdvanced;

import org.openqa.selenium.WebDriver;
import SeleniumTraining.ElementUtil;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitForUrlMatch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	//	driver.get( "https://freshworks.com");
		driver.get( "https://app.hubspot.com/login/");
//		WebDriverWait wait=new WebDriverWait(driver,10);
//boolean b=		wait.until(ExpectedConditions.urlMatches("login"));
//System.out.println(b);
ElementUtil eul=new ElementUtil(driver);
boolean b=eul.checkUrl("login", 20);
System.out.println(b);

	}

}
