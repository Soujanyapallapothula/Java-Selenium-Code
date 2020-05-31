package SeleniumTrainingAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get( "https://www.freshworks.com//");
//		WebElement element=	driver.findElement(By.xpath("//div[text()='GET STARTED']"));
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement elementButton=	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='GET STARTED']")));
//		elementButton.click();
		ExplicitWaitEx ex=new ExplicitWaitEx();
		ex.checkPresenceOfElement(driver, 20, By.xpath("//div[text()='GET STARTED']")).click();

	}

}
