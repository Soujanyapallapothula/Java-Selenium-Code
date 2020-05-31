package testNgBasics;

import org.testng.annotations.Test;

public class InvocationConcept {
	
	@Test(invocationCount=5)
	public void gmailTest() {
		System.out.println("gmailTest");
	}

}
