package inventory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Add_All_Product {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	     driver.get("https://imsmymunc.com/");
		
	     
	     driver.findElement(By.xpath("//a[@href='/all-login']")).click();
	     Thread.sleep(1000);
	   
	     
//	     driver.findElement(By.xpath("//label[text()='Email']")).sendKeys("y.ashutoshg@gmail.com");
	     driver.findElement(By.xpath(
	    		    "//label[contains(normalize-space(),'Email')]/following-sibling::div//input"
	    		)).sendKeys("y.ashutoshg@gmail.com");
	     
//	     driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("Kasper@123");
	     driver.findElement(By.xpath(
	    		    "//label[contains(normalize-space(),'Password')]/following-sibling::div//input"
	    		)).sendKeys("Kasper@123");
	     
	     driver.findElement(By.xpath("//div[@class='form-login\']")).click();

//	     fjgldfjgjfdl;jg;ldfj;gh;dfjgh
	     
	     Thread.sleep(9000);
	     driver.close();
	     driver.quit();
	     
	}

}