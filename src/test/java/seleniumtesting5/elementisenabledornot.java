package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementisenabledornot {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");
		Thread.sleep(1000);
		WebElement d=driver.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(1000);
		d.click();
		Thread.sleep(1000);
	  WebElement h=driver.findElement(By.xpath("//h3[contains(text(),'Java | Oracle')]"));
	  Thread.sleep(1000);
	  h.click();
		
	}

	
	}


