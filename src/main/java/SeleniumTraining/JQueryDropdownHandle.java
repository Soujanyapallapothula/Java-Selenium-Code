package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropdownHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//*[@id=\'justAnotherInputBox\']")).click();
		
	/*List<WebElement> optionsList = driver.findElements(By.className("comboTreeItemTitle"));
	for(int i=0;i<optionsList.size();i++) {
		String text=optionsList.get(i).getText();
		if(text.equals("choice 3")) {
			optionsList.get(i).click();*/
		
		JqueryhandleDrpdownEx jhd=new JqueryhandleDrpdownEx();
		jhd.doGetOptionslueValue(driver, "choice 2 2");
		}
	}


