package ProfileSuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerProfile {
	
	@BeforeMethod
	public void launchUrlCustomer()
	{
		System.out.println("launch the url of Customer");
		
	}
	
	@AfterMethod
	public void stopDriverCustomer()
	{
		System.out.println("stop the driver of an Customer");
		
	}
	
	@Test(groups={"smoke"})
	public void chkProfileCustomer()
	{
		
		System.out.println("chk profile of an customer");
	}
	
	@Test
	public void createProfileCustomer()
	{
		
		System.out.println("create profile of an Customer");
	}
	
	
	
	

	
	

}
