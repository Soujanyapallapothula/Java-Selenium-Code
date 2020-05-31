package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryhandleDrpdownEx {
	public static void doGetOptionsValue(WebDriver driver, String... value) {
		List<WebElement> optionsList=	driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		for(int i=0;i<optionsList.size();i++) {
			String text=optionsList.get(i).getText();
			
			for(int k=0;k<value.length;k++) {
			
				if(text.equals(value[k])) {
					optionsList.get(i).click();
					break;
				}}
			}}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		 doGetOptionsValue	(driver, "choice 3 1" , "choice 4", "choice 5");//not working for multiselect
		//	doGetOptionsValue(driver, "choice 3 3");working for only single select
			//doGetOptionsValue(driver, "choice 2");
			
		}
}
	

	

		

	
	




	

