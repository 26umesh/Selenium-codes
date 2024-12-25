package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmailerrormessage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("umesh.kachhawa5@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		String message=driver.findElement(By.xpath("//div[@class='Ekjuhf Jj6Lae']")).getText();
		System.out.println(message);
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("45214555");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		

	}

}
