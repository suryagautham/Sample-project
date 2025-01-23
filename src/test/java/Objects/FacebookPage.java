package Objects;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	
	WebDriver driver;
	
	public FacebookPage(WebDriver driver){
		this.driver = driver;
	}
	
	By Username = By.xpath("//input[@id=\"email\"]");
	By Password = By.xpath("//input[@type=\"password\"]");
	By Login = By.xpath("//button[@name=\"login\"]");
	
	public void Enterusername() {
		driver.findElement(Username).clear();
		driver.findElement(Username).sendKeys("suryaananth24@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void Enterpassword() {
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys("March24@1990");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(Login).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		assertEquals(title,"Facebook");
	}
}
