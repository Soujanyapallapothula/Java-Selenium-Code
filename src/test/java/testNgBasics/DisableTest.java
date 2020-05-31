package testNgBasics;

import org.testng.annotations.Test;

public class DisableTest {

	@Test
	public void loginTest() {
		System.out.println("loginTest");
	}
	@Test(enabled=false)
	public void homepageTest() {
		System.out.println("homepageTest");
	}
	@Test(enabled=false)
	public void searchPageTest(){
		System.out.println("searchPageTest");
	}

}
