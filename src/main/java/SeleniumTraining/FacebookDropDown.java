package SeleniumTraining;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		Browserinit_util bul=new  Browserinit_util();
//	WebDriver driver=	bul.returnDriver("chrome");
		
//	String	date="Nov-19-1983 ";
			driver.get("http://www.facebook.com");
		Select select=new Select(driver.findElement(By.id("day")));
		select.selectByValue("5");
		
		By monthId=By.id("month");
		By yearId=By.id("year");
		
		ElementUtil elu=new ElementUtil(driver);
	elu.doSelectByVisibleText(monthId, "Nov");
		elu.doSelectByValue(yearId, "1983");
		
		
		
		

	}
	
	

}
