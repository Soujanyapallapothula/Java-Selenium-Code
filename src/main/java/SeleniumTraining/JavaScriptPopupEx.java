package SeleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopupEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	//	driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[3]/button")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(5000);
//	alert.accept();
	//alert.dismiss();
alert.sendKeys("sou");
Thread.sleep(5000);
alert.accept();
	}

}
