package testNgBasics;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnTestNg {
	
	@Test
	public void loginTest() {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("loginTest");
	}
	@Test(dependsOnMethods="loginTest")
	public void homepageTest() {
		System.out.println("homepageTest");
	}
	@Test(dependsOnMethods="loginTest")
	public void searchPageTest(){
		System.out.println("searchPageTest");
	}

}
