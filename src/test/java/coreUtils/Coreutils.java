package coreUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Coreutils {
	
	WebDriver driver;
	public Coreutils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void sendkeys(WebElement element,String value) {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public void buttonClick(WebElement element) {
		element.click();
	}
}
