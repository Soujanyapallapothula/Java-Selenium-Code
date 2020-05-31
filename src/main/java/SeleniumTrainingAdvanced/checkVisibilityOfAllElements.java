package SeleniumTrainingAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.hubspot.util.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkVisibilityOfAllElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get( "https://freshworks.com");
By  footerLinkList	 	=By.xpath("//ul[@class='footer-nav']/li");
//		WebDriverWait wait=new WebDriverWait(driver,25);
//List<WebElement> footerLinkLists=			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerLinkList));
List<WebElement> footerLinkLists=checkVisibilityOfAllElements(driver,footerLinkList,20);

System.out.println(footerLinkLists.size());
	}
	
	public static List<WebElement> checkVisibilityOfAllElements(WebDriver driver,By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		List<WebElement> LinkList=			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        return LinkList;
	}

}
