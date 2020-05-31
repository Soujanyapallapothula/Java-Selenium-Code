package SeleniumTraining;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://jqueryui.com/resources/demos/droppable/default.html");
		By sourceEle=By.id("draggable");
		By targetEle=By.id("droppable");
		ElementUtil eul=new ElementUtil(driver);
	//eul.doDragAndDrop(sourceEle, targetEle);
		eul.DragAndDropByClick(sourceEle, targetEle);
		

	}

}
