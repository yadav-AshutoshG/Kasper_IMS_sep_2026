package inventory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Category {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		// open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	     driver.get("https://imsmymunc.com/");
		 /*
		  * Login 
		  */
	     
//	     driver.findElement(By.xpath("//a[@href='/all-login']")).click();
	     Thread.sleep(1000);
		
        //  my Category Class
		Thread.sleep(3000);
	}

}
