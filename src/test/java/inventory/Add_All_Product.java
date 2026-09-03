package inventory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_All_Product {

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

	     
	     
//all  product
	     
	     
	     
//	     
//	     By inventoryMenu = By.xpath("//span[normalize-space()='Inventory']");
//
//	     By allProducts = By.xpath(
//	         "//a[@href='/product' and normalize-space()='All Products']"
//	     );
//
//	     public InventoryPage(WebDriver driver) {
//	         this.driver = driver;
//	     }
//
//	     public void clickInventory() {
//	         driver.findElement(inventoryMenu).click();
//	     }
//
//	     public void clickAllProducts() {
//	         driver.findElement(allProducts).click();
//	     
	     
	     /*
	         * Inventory → All Products
	         */

	     
	     
	     
	     
	     
	        // Click Inventory
	        driver.findElement(By.xpath(
	                "//span[normalize-space()='Inventory']"
	        )).click();

	        // Click All Products
	        driver.findElement(By.xpath(
	                "//a[@href='/product' and normalize-space()='All Products']"
	        )).click();

//	     Add Product 
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	     // Click All Products
//	        wait.until(ExpectedConditions.elementToBeClickable(
//	                By.xpath("//a[@href='/product' and normalize-space()='All Products']")
//	        )).click();
//
//
//	        // Wait for Add Products
//	        By addProducts = By.xpath("//div[contains(@class,'Add-Button')]");
//
//	        wait.until(ExpectedConditions.elementToBeClickable(addProducts)).click();
//	    
//	     
	        driver.findElement(By.xpath("//div[text()='Add Products']")).click();
	        
	        
	        
	        
	     
	     
	     
	     /*
	      * Logout
	      */
	     
	     
	     
//	     Close Browser
	     Thread.sleep(9000);
	     driver.close();
	     driver.quit();
	     
	}

}