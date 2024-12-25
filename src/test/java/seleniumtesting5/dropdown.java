package seleniumtesting5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
		Select ele=new Select(month);
		Thread.sleep(1000);
		List<WebElement> getfirstoption=ele.getOptions();
		for(int i=0;i<getfirstoption.size();i++) {
			String str=getfirstoption.get(i).getText();
			Thread.sleep(1000);
			System.out.println(str);
		}
		
		
	}

}
