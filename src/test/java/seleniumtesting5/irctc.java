package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class irctc {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.className("search-btn loginText ng-star-inserted")).click();
		Thread.sleep(1000);
		WebElement h=driver.findElement(By.xpath("//strong[contains(text(),'FORGOT ACCOUNT DETAILS?')]"));
		boolean j=h.isEnabled();
		if(j) {
			System.out.println("link is enabled");
		}
		
		else {
			System.out.println("link is abled");
		}
	}

}
