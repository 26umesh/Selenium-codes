package seleniumtesting5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitwait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String h=driver.getTitle();
		System.out.println(h);
 List<WebElement> list=driver.findElements(By.tagName("a"));
 for(WebElement ele:list) {
	 String strlist=ele.getText();
	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	 System.out.println(strlist)
; }
 
	}

}
