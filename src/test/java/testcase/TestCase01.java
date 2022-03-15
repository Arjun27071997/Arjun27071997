package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import coreUtils.Coreutils;
import pageobject.PageFactoryclass;
import pageobject.PageObjectfile;

public class TestCase01 {

	WebDriver driver;

	@Test
	public void getLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		PageObjectfile pf=new PageObjectfile(driver);
		PageFactoryclass pc=new PageFactoryclass(driver);

		Coreutils coreutil=new Coreutils(driver);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	
		coreutil.sendkeys(pf.getUser(),"abcd");

		coreutil.sendkeys(pf.getPass(),"1234");

		coreutil.buttonClick(pf.login());

		coreutil.buttonClick(pf.registerLink());
		Thread.sleep(2000);

		coreutil.sendkeys(pc.getname(),"acbd1234");

		coreutil.sendkeys(pc.getpass(),"abcd34");
		coreutil.sendkeys(pc.getrepass(),"acbd34");
		
		System.out.println(pc.pass);

		driver.close();

	}



}
