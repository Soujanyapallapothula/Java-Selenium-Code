package SeleniumTrainingAdvanced;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #2")).click();
         Set<String>	handles	=driver.getWindowHandles();
            Iterator<String> it = handles.iterator();
  String ParentWindowId= it.next();
  System.out.println(   "Parentwindowid is " +ParentWindowId);
  String ChildWindowId=it.next();
  System.out.println("ChildwindowId is " +ChildWindowId);
  driver.switchTo().window(ChildWindowId);
  String ChildWindowTitle=driver.getTitle();
  System.out.println(" ChildWindowTitle is " +ChildWindowTitle );
  System.out.println("ChildwindowUrl is " +driver.getCurrentUrl());
  driver.close();
  driver.switchTo().window(ParentWindowId);
  System.out.println(" ParentWindowTitle is " +driver.getTitle());
  
  
         


	}

}
