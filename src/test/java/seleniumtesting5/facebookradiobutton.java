package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookradiobutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qa-practice.com/elements/checkbox/single_checkbox");
		WebElement radio1=driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean isdisplayed=radio1.isDisplayed();
		if(isdisplayed) {
			System.out.println("button is disaplyed");
		}
		else {
			System.out.println("button is not displayed");
		}
		boolean isenabled=radio1.isEnabled();
		if(isenabled)
		{
			System.out.println("button is enabled");
		}
		else {
			System.out.println("button is disabled");
		}
		
		boolean isselected=radio1.isSelected();
		if(isselected) {
			System.out.println("button is selecte");
		}
		else {
			System.out.println("button is not selected");
		}
		radio1.click();
		Thread.sleep(1000);
		boolean isselecte=radio1.isSelected();
		if(isselecte) {
			System.out.println("button is selecte");
		}
		driver.close();
	}
	

	
	}


