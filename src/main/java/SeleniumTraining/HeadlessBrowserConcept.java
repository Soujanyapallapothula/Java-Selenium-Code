package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	//	ChromeOptions co=new ChromeOptions();//for headless mode we need to create object of chromeoptions and addArguments as(--headless)
	//	co.addArguments("--Headless");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:www.amazon.com");
	List<WebElement> LinkList=	driver.findElements(By.tagName("a"));
	System.out.println(LinkList.size());
	
	for(int i=0;i<LinkList.size();i++) {
		String text=LinkList.get(i).getText() ;
		if(! text.isEmpty()) {
			System.out.println(i+"-->"+ text.trim());
			
		System.out.println(	LinkList.get(i).getAttribute("href")) ;
		}
		
	}

	}

}
