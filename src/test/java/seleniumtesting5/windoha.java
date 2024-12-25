package seleniumtesting5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windoha {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']")).click();
		Thread.sleep(4000);
		Set<String> windo=driver.getWindowHandles();
		System.out.println(windo);
		Iterator<String> itr=windo.iterator();
		String parent=itr.next();
	
		String child=itr.next();
		System.out.println(child);
		
		
		driver.switchTo().window(child);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Rvc");   
		//driver.switchTo().window(parent);
		
		
		
		
		
		
	}

}
