package Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Page.Loginpage;
import Utility.ExcelData;

public class LoginTest extends Base {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  Loginpage l=new Loginpage(driver);
	  l.set(n ,s);
	  driver.get("http://demo.guru99.com/test/newtours/");
	  
  }
  @DataProvider
  public Object[][] dp() throws InvalidFormatException, IOException {
  Object[][] data= ExcelData.getDataFromSheet("F:\\Java Selenium docs\\DataProvider.xlsx");
  return data;
 
  }
}
