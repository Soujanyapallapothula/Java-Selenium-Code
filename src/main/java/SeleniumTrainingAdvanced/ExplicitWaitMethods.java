package SeleniumTrainingAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get( "https://app.hubspot.com/login/");
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement username=	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		username.sendKeys("naveenanimation30@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
//	By.id("loginBtn");
//		 wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn"))).click();//
		
	WebElement element	= checkElementToBeClickable(driver,By.id("loginBtn"),10);
	element.click();

	}
	public static WebElement checkElementToBeClickable(WebDriver driver,By locator,int timeout) {
	
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement element=		 wait.until(ExpectedConditions.elementToBeClickable(locator));
			return element;
	}

}
