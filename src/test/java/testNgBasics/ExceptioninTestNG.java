package testNgBasics;

import org.testng.annotations.Test;

public class ExceptioninTestNG {
	
	@Test(expectedExceptions=Exception.class)
	public void loginTesst() {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("Hello");//though the test gets passed the syso wont be executed
	}
	
	
	

}
