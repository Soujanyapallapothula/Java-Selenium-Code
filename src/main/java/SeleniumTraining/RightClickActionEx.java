package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.hubspot.util.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickActionEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "http://swisnl.github.io/jQuery-contextMenu/demo.html");
	By rightclickId=	By.xpath("/html/body/div/section/div/div/div/p/span");
		ElementUtil eul=new ElementUtil(driver);
		eul.doRightClick(rightclickId);
		
//WebElement rightClick=		driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	//	Actions action=new Actions(driver);
	//	action.contextClick(rightClick).build().perform();
		
		

	}

}
