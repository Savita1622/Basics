package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login-username")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("login-passwor")).sendKeys("abc@123");
		driver.findElement(By.id("js-login-btn")).click();
		//System.out.println(driver.getTitle());

	}

}
