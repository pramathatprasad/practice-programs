package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Vbuspage;

public class Vbustest {
	
	WebDriver driver;
	@BeforeTest
	public void setup() throws Exception
	{
		driver.manage().window().maximize();
		driver= new EdgeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.vrlbus.in/#/");
		Thread.sleep(3000);
	}
	@Test
	public void home()
	{
		Vbuspage ob= new Vbuspage(driver);
		ob.setvalues("Bangalore", "Kochi", "08-04-2023");
		
	}
	
	
	
	

}
