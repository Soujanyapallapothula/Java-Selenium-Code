package SeleniumTrainingAdvanced;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesCase1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #2")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();		
         Set<String> handles = driver.getWindowHandles();
           Iterator<String>  it=handles.iterator();
   String  ParentWindowID= it.next();
   String ChildWindowId1=it.next();
   String ChildWindowId2=it.next();
   System.out.println("parent windowid is" +ParentWindowID);
   System.out.println("child one windowid is" +ChildWindowId1);
   System.out.println("child two windowId  is" +ChildWindowId2);
   
   driver.switchTo().window(ChildWindowId2);
   System.out.println("child two windowurl  is" +driver.getCurrentUrl());
   System.out.println("child two windowtitle  is" +driver.getTitle());
   driver.close();
   
   driver.switchTo().window(ChildWindowId1);
   System.out.println("child one windowurl  is" +driver.getCurrentUrl());
   System.out.println("child one windowtitle  is" +driver.getTitle());
   driver.close();
   
   driver.switchTo().window(ParentWindowID);
   System.out.println("parent windowtitle  is" +driver.getTitle());
   
 }

}
