package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropDownWithoutSelect {

	public static void main(String[] args) {
		String date="Nov/19/1983";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		ElementUtil eul=new ElementUtil(driver);
		
		
		By monthoptions=By.xpath("select[@id='month']/option");
		By dayoptions=By.xpath("select[@id='day']/option");
		By yearoptions=By.xpath("select[@id='year']/option");
		
		
	eul.doGetDropdownValueWithoutSelect(monthoptions, date.split("/")[0]);
		eul.doGetDropdownValueWithoutSelect(dayoptions, date.split("/")[1] );
		eul.doGetDropdownValueWithoutSelect(yearoptions, date.split("/")[2]);
		
		
		
	}}	
		
		
	//	List<WebElement> monthList=driver.findElements(By.xpath("//select[@id='month']/option"));
	//	for(int i=0;i<monthList.size();i++) {
//	String text=		monthList.get(i).getText();
	//		if(text.equals("Nov")) {
	//			monthList.get(i).click();
	//			break;
				
			
			
		
		
		
			
		

	


