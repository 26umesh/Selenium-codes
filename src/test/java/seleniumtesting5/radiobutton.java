package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton {
	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(1000);
		WebElement radio=driver.findElement(By.xpath("//label[@class='custom-control-label']"));
		radio.click();
		boolean h=radio.isSelected();
		if(h) {
			System.out.println("button selected");
		}
		else {
			System.out.println("button is not selected");
		}
		
	}

}
