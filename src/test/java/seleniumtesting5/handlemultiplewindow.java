package seleniumtesting5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlemultiplewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demoqa.com/browser-windows");
		 driver.findElement(By.id("windowButton")).click();
		 String mainwindow=driver.getWindowHandle();
		 Set<String>allwindohandles=driver.getWindowHandles();
		 Iterator<String> itr=allwindohandles.iterator();
		 while(itr.hasNext()) {
			 String chid=itr.next();
			 if(!mainwindow.equalsIgnoreCase(chid)) {
				 
				 WebElement text = driver.findElement(By.id("sampleHeading"));
				 System.out.println(text.getText());
				// driver.switchTo().window(mainwindow);
			 }
		 }
		 driver.quit();
		
	}

}
