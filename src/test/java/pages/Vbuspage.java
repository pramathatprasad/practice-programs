package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Vbuspage {

	WebDriver driver;
	
	By source= By.xpath("//*[@id=\"FromCity\"]");
	By destination= By.xpath("//*[@id=\"ToCity\"]");
	By departure= By.xpath("//*[@id=\"txtFromDate\"]");
	By search= By.xpath("/html/body/form/div[3]/div[2]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	
	public Vbuspage(WebDriver driver2)
	{
		this.driver= driver2;
	}
	public void setvalues(String from, String to, String date)
	{
		driver.findElement(source).sendKeys(from,Keys.ENTER);
		driver.findElement(destination).sendKeys(to,Keys.ENTER);
		driver.findElement(departure).clear();
		driver.findElement(departure).sendKeys(date);
		driver.findElement(search).click();
	}
}
	
	
	
	

