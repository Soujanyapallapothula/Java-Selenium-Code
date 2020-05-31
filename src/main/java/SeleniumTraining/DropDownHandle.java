package SeleniumTraining;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		By dropdown=By.id("dropdown");
		ElementUtil eul=new ElementUtil(driver);
	//	eul.doSelectByVisibleText(dropdown, "Option 1");
	//	eul.doSelectByIndex(dropdown, 1);
		eul.doSelectByValue(dropdown, "2");

	}

}
