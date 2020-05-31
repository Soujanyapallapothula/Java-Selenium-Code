package testNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;




public class annotationEx extends BaseTest {
	 
	@Test(priority=1)
	public void getTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("A fresh approach to customer engagement", title);
	}
	
	@Test(priority=0)//can give same priority for 2 test cases ,they will get executed in alphabetical order
	public void checkLinkDisplayedTest() {
	boolean b=	driver.findElement(By.xpath("//a[@class='logo logo-fworks']")).isDisplayed();
	System.out.println(b);
	}
	
	
	@Test(priority=0)//priority can also be negative
	public void productAvailTest() {
		driver.findElement(By.xpath("(//span[@class='nav-label'])[1]")).click();
	}
	}

