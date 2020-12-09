package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Base {
public 	WebDriver driver ;
 
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","F:\\Broswer Launch\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
	     
		 driver.get("http://demo.guru99.com/test/newtours/");
			driver.manage().window().maximize();
			
	  
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
