package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dob {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
		Select d=new Select(day);
		d.selectByIndex(10);
		
		WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
		Select h=new Select(month);
		h.selectByValue("12");
		
		WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
		Select k=new Select(year);
		k.selectByVisibleText("2004");
	}

}
