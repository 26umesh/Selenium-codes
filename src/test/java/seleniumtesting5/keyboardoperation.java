package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardoperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		WebElement fullname=driver.findElement(By.id("userName"));
		fullname.sendKeys("umesh kachhawa");
		
WebElement gmail=driver.findElement(By.id("userEmail"));
gmail.sendKeys("abc.xyz56@gmail.com");
WebElement currentaddress=driver.findElement(By.id("currentAddress"));

currentaddress.sendKeys("43 school lane gali indore");
currentaddress.sendKeys(Keys.COMMAND,"a");
//currentaddress.sendKeys("A");
currentaddress.sendKeys(Keys.COMMAND,"c");
//currentaddress.sendKeys("C");
currentaddress.sendKeys(Keys.TAB);
WebElement permanentaddress=driver.findElement(By.id("permanentAddress"));
Thread.sleep(2000);
permanentaddress.sendKeys(Keys.COMMAND,"v");
//permanentaddress.sendKeys("V");
//assertEquals(currentaddress.getAttribute("value"),permanentaddress.getAttribute("value"));



	}

	private static void assertEquals(String attribute, String attribute2) {
		// TODO Auto-generated method stub
		
	}

}
