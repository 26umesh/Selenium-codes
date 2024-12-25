package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hotellogin {
public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactin.com/HotelApp/index.php");
	driver.manage().window().maximize();
	WebElement x=driver.findElement(By.id("username"));
	x.sendKeys("vengatram");
	WebElement x1=driver.findElement(By.name("password"));
	x1.sendKeys("vengat@23445");
	WebElement x2=driver.findElement(By.id("login"));
	x2.click();
}
}
