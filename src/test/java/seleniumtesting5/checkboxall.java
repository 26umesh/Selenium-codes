package seleniumtesting5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxall {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
       for(WebElement ele:checkbox) {
    	   System.out.println(ele);
    	   ele.click();
       }
	}

}
