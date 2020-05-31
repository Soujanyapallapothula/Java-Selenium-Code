package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSpiceJetEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://book.spicejet.com/");
		WebElement login=driver.findElement(By.id("Login"));
		WebElement SpiceclubMem=driver.findElement(By.xpath("//*[@id=\'menu-list-login\']/li[1]/a"));
		WebElement MemLogin=driver.findElement(By.xpath("//*[@id=\'menu-list-login\']/li[1]/ul/li[2]/a"));
	//	Thread.sleep(5000);
		Actions action=new Actions(driver);
	action.moveToElement(login).build().perform();
	action.moveToElement(SpiceclubMem).build().perform();
	action.moveToElement(MemLogin).click().build().perform();
	}}
