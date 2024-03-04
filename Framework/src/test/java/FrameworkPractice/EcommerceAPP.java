package FrameworkPractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class EcommerceAPP {

	public static void main(String[] args) 
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.findElement(By.id("userEmail")).sendKeys("savita16savita@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Savita@16");
		driver.findElement(By.id("login")).click();
		List<WebElement> products =driver.findElements(By.cssSelector(".card-img-top"));
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals("IPHONE 13 PRO")).findFirst().orElse(null);
		prod.findElement(By.cssSelector("app-dashboard.ng-star-inserted:nth-child(2) div.container div.row div.col-lg-4.col-md-6.col-sm-10.offset-md-0.offset-sm-1.mb-3.ng-star-inserted:nth-child(3) div.card div.card-body > button.btn.w-10.rounded:nth-child(4)")).click();
		
		
		
		
	}

}
