package SeleniumTrainingAdvanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitTitle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get( "https://app.hubspot.com/login/");
		WebDriverWait wait=new WebDriverWait(driver,25);
		boolean b=	wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		System.out.println(b);

	}

}
