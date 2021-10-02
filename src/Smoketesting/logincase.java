package Smoketesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import UI_action.ui_actions;

public class logincase {

	public static void main(String[] args) throws IOException {
		ui_actions act = new ui_actions();
		System.setProperty("WebDriver.safari.driver", "safaridriver");
		WebDriver driver= new SafariDriver();
		
		act.open_url(driver);
		act.login(driver);
		act.logout(driver);
		
		
//		driver.get("https://atrio.2u-demo.com/login");;
//		System.out.println("UI title "+driver.getTitle());
//		driver.manage().window().maximize();
//		driver.findElement(By.id("username")).sendKeys("jacksonfive"); 
//		driver.findElement(By.id("login-submit")).click();
//		driver.findElement(By.id("password")).sendKeys("FMoKy6c!");
//		driver.findElement(By.id("login-submit")).click();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/button/div/img")).click();
//		driver.findElement(By.xpath("/html/body/reach-portal/div[3]/div/div/div/ul/li[4]/a")).click();
		
		
		

	}

}
