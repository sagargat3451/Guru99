package TestLayer;


import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPagetest11 extends BaseClass {
	
	@Test(priority = 1)
	public static void openABrowser()
	{
		BaseClass.initialization();
	}
	
	@Test(priority = 2)
	public static void validateContactInformation()
	{
		RegisterPage obj =new RegisterPage();
		obj.contactInformation("Anjali", "Patil", "9090900", "Anjali@gmail.com");
		
		
	}
	
	@Test(priority = 3)
	public static void validateMailingInformation()
	{
		RegisterPage obj =new RegisterPage();
		obj.mailingInformation("Pune", "Pune", "Pune", "Pune", "INDIA");
			
	}
	
	@Test(priority = 4)

	public static void validateUserInformation()
	{
		RegisterPage obj = new RegisterPage();
		obj.userInformation("Sagar", "Sagar123", "Sagar123");
		
				
	}
}
