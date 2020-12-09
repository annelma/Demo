package Test;

import org.testng.annotations.Test;

import Page.Loginpage;
import Page.Registerpage;
import Utility.ExcelData;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class RegisterTest extends Base {
  @Test(dataProvider = "dp")
  public void f(String fname,String lname,String ph,String Uname,String address,String cityV,String stateV,String postalCodeV,String p) {
	  Registerpage r=new Registerpage(driver);
	  WebElement link = driver.findElement(By.partialLinkText("REGI"));
		link.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  r.set(fname,lname,ph,Uname,address,cityV,stateV,postalCodeV,p);
	  
	  
  }
  @DataProvider
  public Object[][] dp() throws InvalidFormatException, IOException {
  Object[][] data= ExcelData.getDataFromSheet("F:\\Java Selenium docs\\Register.xlsx");
  return data;
 
  }
}