package ProfileSuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmployeeProfile {
	
	@BeforeMethod
	public void launchUrlEmployee()
	{
		System.out.println("launch the url of employee");
		
	}
	
	@AfterMethod
	public void stopDriverEmployee()
	{
		System.out.println("stop the driver of an employee");
		
	}
	
	@Test(groups={"smoke"})
	public void chkProfileEmployee()
	{
		
		System.out.println("chk profile of an employee");
	}
	
	@Test
	public void createProfileEmployee()
	{
		
		System.out.println("create profile of an employee");
	}
	
	
	
	

}
