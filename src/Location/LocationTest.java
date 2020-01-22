package Location;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LocationTest {
	
	
	public static Properties prop;
	
	public static WebDriver driver;
	
	static int i;
	
	@Parameters({"url"})
	@BeforeMethod
	public static void launchBrowser(String site) throws IOException
	{
		
		FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\data.properties");
		
		prop = new Properties();
		
		
	    prop.load(fls);
		
		
	if(prop.getProperty("browser").equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C://Program Files//chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			driver.get(site);
			
			i= 30;
			
		}
		
	}
	
	
	@Test(dataProvider="getData")
	public void enterUserName(String name)
	{
		
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(name);
	}
		
	
	
	@Test(dataProvider="getData1")
	public void enterPassword(String password)
	{
		
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object data[][] = new Object[2][1];
		
		data[0][0] = "arijit";
		
		data[1][0] = "anuradha";
		
		return data;
		
		
	}
	
	@DataProvider
	public Object[][] getData1()
	{
		
      Object data[][] = new Object[2][1];
		
		data[0][0] = "arijit13";
		
		data[1][0] = "anuradha133";
		
		return data;
	}
	
	
	
	
	
		
		
	    @AfterMethod
		public void stopDriver()
		{
			driver= null;
			
		}
		
		

	
	
	
	
	

}
