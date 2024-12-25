package seleniumtesting5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='u_0_g']")).click();
		boolean logo=driver.findElement(By.xpath("//*[@id='u_0_g']")).isSelected();
        if(logo==true)
        {
        	System.out.println("is selected");
        
        }else {
        	System.out.println("is not selected");
        }
	}

}
