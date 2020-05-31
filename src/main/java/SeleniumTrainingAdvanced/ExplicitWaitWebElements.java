package SeleniumTrainingAdvanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitWebElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get( "https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	//	By clickforJSalert=By.xpath("//button[text()='Click for JS Alert']");
//		WebDriverWait wait=new WebDriverWait(driver,10);
//	Alert alert=	wait.until(ExpectedConditions.alertIsPresent());
//		alert.accept();
		checkAlertToBePresent(driver,10).accept();
		

	}
	
	public static Alert checkAlertToBePresent(WebDriver driver,int timeout) {
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		Alert alert=	wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}

}
