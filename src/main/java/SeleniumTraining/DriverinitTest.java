package SeleniumTraining;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class DriverinitTest {

	public static void main(String[] args) {
		Browserinit_util biu=new Browserinit_util ();
WebDriver driver=		biu.returnDriver("chrome");
		biu.launchUrl("http:www.crmpro.com");
//	String str=	biu.doGetTitle();
//	System.out.println(str);
	
//	biu.navigateTo("http:facebook.com");
	ElementUtil eul=new ElementUtil(driver);
	
	By emaildID=By.name("username");
	By password=By.name("password");
	By Loginbtn=By.cssSelector("#loginForm > div > div > input");
//	By heading=By.cssSelector("body > div.navbar.navbar-default.navbar-fixed-top.skrollable.skrollable-between > div > div.navbar-header > a > img");
//	By contactval=By.linkText("Customers");
	
	eul.doSendKeys(emaildID, "souji.palla");
	eul.doSendKeys(password, "Krish");
	eul.doClick(Loginbtn);
	
//String s=eul.doGetText(contactval);
//System.out.println(s);

By signuplink=By.linkText("Sign Up");
eul.getElement(signuplink);
 boolean b=eul.findIsDisplayed(signuplink);
 System.out.println(b);
 

 
 biu.launchUrl("http:www.crmpro.com");
 By Links=By.tagName("a");
 List<WebElement> linksList =eul.doGetelements(Links);
System.out.println( linksList.size());
 
	}}
