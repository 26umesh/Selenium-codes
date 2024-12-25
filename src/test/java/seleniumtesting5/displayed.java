package seleniumtesting5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class displayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://artoftesting.com/samplesiteforselenium");
		/*WebElement ele=driver.findElement(By.id("fname"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(300);
		driver.quit();*/
      /*WebElement ele=driver.findElement(By.id("dblClkBtn"));
       Actions act=new Actions(driver);
       act.doubleClick(ele).perform();
       Thread.sleep(300);*/
WebElement ele=driver.findElement(By.id("idofButton"));
Actions act=new Actions(driver);
act.moveToElement(ele).perform();


	
	}}

	


