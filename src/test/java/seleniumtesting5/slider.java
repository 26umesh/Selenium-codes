package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		Actions act=new Actions(driver);
		WebElement slider=driver.findElement(By.xpath("//input[@type='range']")); 
		act.moveToElement(slider,50,0).perform();
		slider.click();
		System.out.println("move slider in horizontal way");
		
		

	}

}
