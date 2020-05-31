package SeleniumTrainingAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeDepotEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "http://www.homedepot.com");
List<WebElement> headerlinksList=driver.findElements(By.xpath("//a[@class='TaskLinks__link']"));
int j=headerlinksList.size();
System.out.println(j);
for(int i=0;i<j;i++) {
	String text=headerlinksList. get(i).getText();
	System.out.println(text);
	if(text.equals("Gift Cards" )) {
		headerlinksList. get(i).click();
		break;
	}
			
}

	}

}
