package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropDownOptions {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		
	Select select= new Select(driver.findElement(By.id("day")));// Select class to find all the dayOptions
List<WebElement> DayOptions=select.getOptions();
System.out.println(DayOptions.size());
for(int i=0;i<DayOptions.size();i++) {
	System.out.println(DayOptions.get(i).getText());
}
	
	Select selectMonth= new Select(driver.findElement(By.id("month"))); //Select class to find all the MonthOptions
List<WebElement> MonthOptions=selectMonth.getOptions();
System.out.println(MonthOptions.size());
for(int j=0;j<MonthOptions.size();j++) {
	System.out.println(MonthOptions.get(j).getText());
}
	
	Select selectYear= new Select(driver.findElement(By.id("year")));//Select class to find all the yearOptions
List<WebElement> YearOptions=selectYear.getOptions();
System.out.println( YearOptions.size());
for(int k=0;k< YearOptions.size();k++) {
	System.out.println( YearOptions.get(k).getText());	
	
}	}}
	

