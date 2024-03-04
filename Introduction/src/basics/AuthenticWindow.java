package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticWindow 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println(driver.findElement(By.cssSelector("p")).getText());

	}

}
