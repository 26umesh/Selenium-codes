package seleniumtesting5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowmbootstrap {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]")).click();
	List<WebElement>list=driver.findElements(By.xpath("//div[@id='view-origin-station']/preceding"));
	System.out.println(list.size());
	}
	

}
