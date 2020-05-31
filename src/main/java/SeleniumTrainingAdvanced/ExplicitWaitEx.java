package SeleniumTrainingAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://app.hubspot.com/login/");
//		WebDriverWait wait=new WebDriverWait(driver,10);
//	WebElement element=	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
//		element.sendKeys("naveenanimation30@gmail.com");
//		
//		driver.findElement(By.id("password")).sendKeys("Test@1234");
//		 wait=new WebDriverWait(driver,5);
//		WebElement elementLogin=	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBtn")));
//		elementLogin.click();
//		
		//driver.findElement(By.id("username")).sendKeys("naveenanimation30@gmail.com");
	
//	System.out.println(driver.getTitle());
		
	WebElement username=	checkPresenceOfElement(driver,10,By.id("username"));
	username.sendKeys("naveenanimation30@gmail.com");
	
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		
		checkPresenceOfElement(driver,5,By.id("loginBtn")).click();
		

	}
	public static WebElement checkPresenceOfElement(WebDriver driver,int timeunit, By locator) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement element=	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}

}
