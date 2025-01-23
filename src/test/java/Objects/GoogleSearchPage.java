package Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;
	public GoogleSearchPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By SearchBox = By.xpath("//textarea[@name=\"q\"]");
	By SearchBtn = By.xpath("(//input[@name=\"btnK\"])[1]");
	By facebooklink = By.xpath("//a//h3[text()='Facebook - log in or sign up']");
	
	public void Searchgoogle(String searchvalue) {
	try
	{
		
		driver.findElement(SearchBox).sendKeys(searchvalue);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(SearchBtn).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(facebooklink).click();
		
	}
	catch(Exception e)
	{
		System.out.println("Exceptions caught" + e.getMessage());
	}
}
	
	public void clickfacebook() {
		try 
		{
			driver.findElement(facebooklink).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println("Exceptions caught" + e.getMessage());
		}
	}
}