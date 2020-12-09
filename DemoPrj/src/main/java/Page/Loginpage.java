package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver ;
	 @FindBy(name="userName")
		private WebElement username;
	 
	 
		@FindBy(name="password")
		private WebElement password;
		
	/*	 @FindBy(name="submit") 
			private WebElement Submitbutton; */
		
		 @FindBy(how = How.NAME, using = "submit") 
			private WebElement Submitbutton;
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver ;
		PageFactory.initElements(driver, this);		
	}

	public void set(String name,String pass)
	{
		 //WebElement username = driver.findElement(By.name("userName"));
		// WebElement password = driver.findElement(By.name("password"));
		// WebElement Submitbutton = driver.findElement(By.name("submit"));
		 username.sendKeys(name);
		 password.sendKeys(pass);
		 Submitbutton.click();
		 
	}

}
