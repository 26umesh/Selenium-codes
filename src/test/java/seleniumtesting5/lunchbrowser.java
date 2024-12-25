package seleniumtesting5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lunchbrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String s=driver.getTitle();
		System.out.println(s);
		if(s.equals("Ingenious TechHub")) {
			System.out.println("Title is verified");
		}
		Thread.sleep(1000); 
		String g=driver.getCurrentUrl(); 
		System.out.println(g);
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().maximize();
		driver.close();
		

	}

}
