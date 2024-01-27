package testNG_exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_WD_TestNG {
WebDriver driver;
@BeforeClass
public void startUp() {
driver = new FirefoxDriver() ;
}	
@AfterClass
public void tearDown() {
	driver.quit();
}
@Test
public void tc001() throws InterruptedException	{
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
	Reporter.log("application opened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Reporter.log("login completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("logout")).click();
	Reporter.log("logout completed");
	
	
}	
}


	
	


