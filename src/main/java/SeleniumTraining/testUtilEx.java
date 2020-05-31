package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.hubspot.util.ElementUtil;

public class testUtilEx {

	public static void main(String[] args) {
		Browserinit_util biu=new Browserinit_util ();
		WebDriver driver=		biu.returnDriver("chrome");
				biu.launchUrl("http://www.freshworks.com");
				 By Links=By.tagName("a");
				 ElementUtil eul=new ElementUtil(driver);
				 List<WebElement> linksList =eul.doGetelements(Links);
				System.out.println( linksList.size());
				for(int i=0;i<linksList.size();i++) {
					String s=linksList.get(i).getText();
					if(! s.isEmpty()) {
						System.out.println(i +" -->"  +s);	
					}
					
						}	}
}
