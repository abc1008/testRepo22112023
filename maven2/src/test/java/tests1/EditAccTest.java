package tests1;

import org.testng.annotations.Test;

public class EditAccTest extends BaseTest{
	
	
	@Test(priority = 1)
	public void performEditAccTest() throws InterruptedException
	{
		editAccPage.editAccount();
		System.out.println("performEditAccTest completed.");
	}
	
	
	
	
}
