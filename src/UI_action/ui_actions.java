package UI_action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ui_actions {
	
 //	@FindBy (id="username")
//	public static WebElement user_name;
//	
//	@FindBy (id="login-submit")
//	public static WebElement login_submit;
//	
//	@FindBy (id="password")
//	public static WebElement password;
	
	static By user_name = By.id("username");
	static By login_submit = By.id("login-submit");
	static By password = By.id("password");
	static By profile = By.xpath("//button[@aria-label='Profile Menu']//img");
	static By sign_out = By.xpath("//a[@href='/logout']");
	
	static String cur_path = System.getProperty("user.dir");
	public static void main(String[] args ) throws IOException {
		
	}
	
	public static String prop(String val) throws IOException
	{
		FileInputStream fis = new FileInputStream(cur_path+"/src//Property_files//cred.properties");
		Properties po = new Properties();
		po.load(fis);
		return po.getProperty(val);
		 
	}
	public static void open_url(WebDriver driver) throws IOException
	{
		driver.get(prop("url"));
		driver.manage().window().maximize();
	}
	public static void login(WebDriver driver )
	{
		try {
			driver.findElement(user_name).sendKeys(prop("username"));
			driver.findElement(login_submit).click();
			driver.findElement(password).sendKeys(prop("password"));
			driver.findElement(login_submit).click();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	public static void logout(WebDriver driver)
	{try {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(profile).click();
		//div[@role='dialog']/ul/li[4]/a
		driver.findElement(sign_out).click();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}

}
