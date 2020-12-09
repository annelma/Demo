package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpage {
	WebDriver driver ;
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
	@FindBy(name="phone")
	private WebElement phone;
 
	@FindBy(name="userName")
	private WebElement email;
 
	@FindBy(name="address1")
	private WebElement address1;
	
	@FindBy(name="city")
	private WebElement City;
	
	@FindBy(name="state")
	private WebElement State;
	
	@FindBy(name="postalCode")
	private WebElement PostalCode;
	
	@FindBy(name="country")
	private WebElement Country;
 
	@FindBy(name="email")
	private WebElement Email2;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="confirmPassword")
	private WebElement Cpassword;
	
	
 
	@FindBy(name="submit")
    private WebElement Submitbtn;
	
	
	public Registerpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver ;
		PageFactory.initElements(driver, this);	
	}
	public void set(String name1,String name2,String ph,String Uname,String address,String cityV,String stateV,String postalCodeV,String pass)
	{
		
		
	//	 WebElement firstname=driver.findElement(By.name("firstName"));
		 firstname.sendKeys(name1);
	//	 WebElement lastname=driver.findElement(By.name("lastName"));
		 lastname.sendKeys(name2);
	//	 WebElement phone=driver.findElement(By.name("phone"));
		 phone.sendKeys(ph);
	//	 WebElement email=driver.findElement(By.id("userName"));
		 email.sendKeys(Uname);
	//	 WebElement address1=driver.findElement(By.name("address1"));
		 address1.sendKeys(address);
	//	 WebElement City=driver.findElement(By.name("city"));
		 City.sendKeys(cityV);
	//	 WebElement State=driver.findElement(By.name("state"));
		 State.sendKeys(stateV);
	//	 WebElement PostalCode=driver.findElement(By.name("postalCode"));
		 PostalCode.sendKeys(postalCodeV);
	//	 WebElement Country=driver.findElement(By.name("country"));
		 Select s=new Select(Country);
		 s.selectByValue("INDIA");
	//	 WebElement Email2=driver.findElement(By.name("email"));
		 Email2.sendKeys(Uname);
	//	 WebElement password=driver.findElement(By.name("password"));
		 password.sendKeys(pass);
	//	 WebElement Cpassword=driver.findElement(By.name("confirmPassword"));
		 Cpassword.sendKeys(pass);
	//	 WebElement Submitbtn=driver.findElement(By.name("submit"));
		 Submitbtn.click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
