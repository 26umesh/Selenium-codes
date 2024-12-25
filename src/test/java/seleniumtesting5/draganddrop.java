package seleniumtesting5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Actions builder=new Actions(driver);
		WebElement from=driver.findElement(By.id("column-a"));
		WebElement to=driver.findElement(By.id("column-b"));
		builder.dragAndDrop(from, to).perform();
		String textTo = to.getText();
		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: File is dropped to target as expected");
			}else {
			System.out.println("FAIL: File couldn't be dropped to target as expected");
			}
			driver.close();
			}

	}


