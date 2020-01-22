package LoginSuite;

import org.testng.annotations.Test;

public class EmployeeLogin {
	
	
   @Test
	public void Employee_LoginVallid_Details()
	{
		
		
		System.out.println("Employee loggged in with valid details");
		
	}
	
   @Test
	public void Employee_Login_Invallid_Details()
	{
		
		System.out.println("Employee loggged in with In valid details");
		
		
	}
   
   
   @Test
  	public void Mobile_Employee_LoginVallid_Details()
  	{
  		
  		
  		System.out.println("Mobile Employee loggged in with valid details");
  		
  	}
  	
     @Test
  	public void Mobile_Employee_Login_Invallid_Details()
  	{
  		
  		System.out.println("Mobile Employee loggged in with In valid details");
  		
  		
  	}
	

}
