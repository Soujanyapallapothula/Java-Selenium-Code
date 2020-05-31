package SeleniumTraining;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptionGenericCodeCheck {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		By dayId=By.id("day");
		By monthId=By.id("month");
		By yearId=By.id("year");
		ElementUtil eul=new ElementUtil(driver);
ArrayList<String> DayOptionsList=		eul.doGetDropDownOptions(dayId);
System.out.println(DayOptionsList.size());
System.out.println(DayOptionsList);

System.out.println("Month DropDownList= "  +eul.doGetDropDownOptions(monthId));

System.out.println("year DropDownList= " +eul.doGetDropDownOptions(yearId));
	}

}
