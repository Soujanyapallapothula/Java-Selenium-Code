package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDeselection {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//*[@id=\'justAnInputBox1\']")).click();
		List<WebElement> optionsvalueList=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		for(int i=0;i<optionsvalueList.size();i++) {
			String text=optionsvalueList.get(i).getText();
			if(text.equals("choice 2")){
				optionsvalueList.get(i).click();

	}
			
			
		}
	}
}


