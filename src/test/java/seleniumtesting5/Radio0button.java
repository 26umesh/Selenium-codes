package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio0button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		for(int i=1;i<=2;i++)
		{
			Thread.sleep(2000);
			String s=driver.findElement(By.xpath("//*[@id='u_0_k']/span[" + i + "]/label")).getText();
			System.out.println(s);
		}
		
		

	}

	
}
