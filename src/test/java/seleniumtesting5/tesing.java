package seleniumtesting5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tesing {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				//enter the url
				driver.get("https://www.google.com/");
				//To get the title of current web page
				String title = driver.getTitle();
				System.out.println("Title: "+title);
				//To get the url of current web page
				String url = driver.getCurrentUrl();
				System.out.println("URL: "+url);

	}

}