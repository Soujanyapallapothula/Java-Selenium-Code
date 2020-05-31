package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
	System.out.println(	driver.switchTo().frame(0).getTitle());
String s=	driver.findElement(By.name("main")).getText();
System.out.println(s);
driver.switchTo().defaultContent();//to get back from frame to normal page(browser--page--iframe or frame)

	}

}
