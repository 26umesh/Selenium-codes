package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		WebElement checkbox=driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg']']"));
		checkbox.click();
		boolean h=checkbox.isSelected();
		if(h)
		{
			System.out.println("checkbox is selected new");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}

	}

}
