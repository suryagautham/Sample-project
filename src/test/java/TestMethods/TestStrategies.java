package TestMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;

import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestStrategies {

WebDriver driver;
GoogleSearchPage objectrepo;
FacebookPage objectrepo1;
	
   @BeforeTest
    public void beforetest() {
    
	   WebDriverManager.edgedriver().setup();
	   driver = new EdgeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
    }
   @Test(priority=0)
   public void test()
   {
	   GoogleSearchPage Google = new GoogleSearchPage(driver);
	   Google.Searchgoogle("facebook");
   }
   
   @Test(priority=1)
   public void FacebookAccessverify()
   {
	   objectrepo = new GoogleSearchPage(driver);
	   objectrepo.clickfacebook();
   }
   
  @Test(priority=2)
   public void facebookLogin() {
	   //FacebookPage fb = new FacebookPage(driver);
	  
	  objectrepo1 = new FacebookPage(driver);
	  objectrepo1.Enterusername();
	  objectrepo1.Enterpassword();
	  }
   @AfterTest
   public void aftertest()
   {
	   driver.quit();
   }
    	
	
	
	
	
	
	
	
	
	
}
