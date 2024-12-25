package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions handlingSSL = new ChromeOptions();
		handlingSSL.setAcceptInsecureCerts(true);
		ChromeDriver driver=new ChromeDriver(handlingSSL);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
             Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin12");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		WebElement d=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		
		//WebElement s=driver.findElement(By.xpath("//div[@class='orangehrm-login-form']//div[2]//div[1]//span[1]"));
		String h=d.getText();
	     if(h=="Invalid credentials") {
	    	 System.out.println("invalid credenti");
	    	 
	     }

	}

}
