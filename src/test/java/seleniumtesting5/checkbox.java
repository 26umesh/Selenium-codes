package seleniumtesting5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
			driver.get("http://demoqa.com/registration/");
			List<WebElement> w = 
			driver.findElements(By.xpath("//input[@type='checkbox']"));
			for(WebElement x:w){
			x.click();
			}


	}

}
