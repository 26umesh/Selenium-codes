package seleniumtesting5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.google.co.in/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[normalize-space()='Gmail']"))
     .click();

     String s=driver.getTitle();
     System.out.println(s);
     
	}

}
