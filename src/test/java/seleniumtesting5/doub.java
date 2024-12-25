package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.doubleClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
		sendKeys(Keys.ENTER).build().perform();
		

	}

	private static Actions sendKeys(Keys enter) {
		// TODO Auto-generated method stub
		return null;
	}

}
