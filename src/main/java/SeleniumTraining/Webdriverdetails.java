package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdetails {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Giya Krish\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get("http://www.amazon.com");
	    String s=driver.getTitle();
	    System.out.println(s);
	    if(s.contains("Amazon")) {
	    	System.out.println("correct title");
	    }
	    else {
	    	System.out.println("Incorrect title");
	    }
	        
		
		
		
	}

}
