package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectfile {
	
	WebDriver driver;
	public PageObjectfile(WebDriver driver) {
		this.driver=driver;
	}

	
By username=By.id("login1");
By pass=By.name("passwd");
By go=By.name("proceed");

By register=By.partialLinkText("Create a new account");


public WebElement getUser() {
	return driver.findElement(username);
}

public WebElement getPass() {
	return driver.findElement(pass);
}

public WebElement login() {
	return driver.findElement(go);
}

public WebElement registerLink() {
	return driver.findElement(register);
}


}
