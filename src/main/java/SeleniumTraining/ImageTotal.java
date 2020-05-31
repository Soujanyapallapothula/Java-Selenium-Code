package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageTotal {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http:www.amazon.com");
List<WebElement> ImageList=driver.findElements(By.tagName("img"));
System.out.println( "Total Images " +ImageList.size());

for(int i=0;i<ImageList.size();i++) {
	System.out.println(i+ ")" +ImageList.get(i).getAttribute("src"));
}
}
}
