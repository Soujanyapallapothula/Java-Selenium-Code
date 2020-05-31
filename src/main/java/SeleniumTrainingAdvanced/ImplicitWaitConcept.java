package SeleniumTrainingAdvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "http://www.freshworks.com");
		//driver.findElement(By.xpath("//span[text()='Products']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// implicitlyWait is a global wait and will be applied to all the elements on the webpage;
		//implicitlyWait can be nullified and overridden depending on the requirements,
		driver.findElement(By.xpath("//a[text()=' View All Products']")).click();
	}

}
