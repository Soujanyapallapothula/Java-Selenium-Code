package SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUpHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://@admin:admin@the-internet.herokuapp.com/basic_auth");// for authentication popup we provide username and password in the url itself
		//by colon seperated.

	}

}
