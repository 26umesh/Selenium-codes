package seleniumtesting5;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class naukarimultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String parentwindow=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set<String>set=driver.getWindowHandles();
		System.out.println(set);
	Iterator<String> itr=set.iterator();
	while(itr.hasNext()) {
		Thread.sleep(5000);
		String child=itr.next();
		Thread.sleep(5000);
		if(!(parentwindow.equals(child))) {
			System.out.println(driver.switchTo().window(child).getTitle());
		}
	}
		
		driver.close();
		

	}

}
