package seleniumtesting5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicittime {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("//https:www.google.com/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		String search="ingenious techhub";
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(search,Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.close();
	}

	}


