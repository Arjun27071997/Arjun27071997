package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryclass {

	WebDriver driver;
	public PageFactoryclass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);//1st remote driver param
	}
	
	public String pass="//*[text()='Password']//following-sibling::td[2]//input";
	
	
	@FindBy(xpath="//*[text()='Full Name']//following-sibling::td[2]//input")
	WebElement name;
	
	@FindBy(xpath="//*[text()='Password']//following-sibling::td[2]//input")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Retype password']//following-sibling::td[2]//input")
	WebElement rePassword;
	
	public WebElement getname() {
		return name;
	}
	
	public WebElement getpass() {
		return password;
	}
	
	public WebElement getrepass() {
		return rePassword;
	}

	
}
