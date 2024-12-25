package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginwebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("vengat16");
		driver.findElement(By.id("password")).sendKeys("Karthick");
		String s1=driver.findElement(By.id("username")).getAttribute("value");
		String s2=driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(s1);
		System.out.println(s2);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


