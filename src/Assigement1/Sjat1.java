package Assigement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sjat1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		 
		WebDriver  driver;

		 System.setProperty("Webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver-win64.exe");
		 
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.saucedemo.com/v1/");
		 
		 Thread.sleep(3000);
		 
		 
		 
			driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
			
			System.out.println("Login Sucessfuly");
		
		    System.out .println("Verifying  Product Backpack......");
		    System.out .println("");
		    Thread.sleep(3000);
			
		    driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		    Thread.sleep(3000);
		    WebElement Bptitle=driver.findElement(By.xpath("//div[@class='inventory_details_name']"));
		    String Producttitle=Bptitle.getText();
		    if (Producttitle.equals("Sauce Labs Backpack")) {
	            System.out.println(" Backpack Title is verified ");
	        } else {
	            System.out.println("Backpack Title is not verified  ");
	        }
	        System.out .println("");
		    
		    WebElement currencyElement = driver.findElement(By.className("inventory_details_price"));
	        String currencyText = currencyElement.getText();
	        if (currencyText.contains("$")) {
	            System.out.println("Backpack Currency is verified ");
	        } else {
	            System.out.println("Backpack Currency is not verified  ");
	        }
	        System.out .println("");
	        Thread.sleep(3000);
	        
	        WebElement addToCartButton = driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']"));
	        if (addToCartButton.isDisplayed() && addToCartButton.isEnabled()) {
	            System.out.println("Backpack Add to Cart button is verified ");
	            driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
	        } else {
	            System.out.println("Backpack Add to Cart button not verified ");
	            
	        }
	        System.out .println("");
			Thread.sleep(3000); 
			
			WebElement removeButton = driver.findElement(By.xpath("//button[normalize-space()='REMOVE']"));
	        if (removeButton.isDisplayed() && removeButton.isEnabled()) {
	            System.out.println("Backpack Remove button is verified ");
	            driver.findElement(By.xpath("//button[normalize-space()='REMOVE']")).click();
	        } else {
	            System.out.println(" Backpack Remove button not verified ");
	           
	        }
	        
	        System.out .println("");
		    Thread.sleep(3000);
		    
		    driver.navigate().back();
		    System.out.println("******** Product Backpack is verified**********");
		    System.out .println("");
		    System.out .println("");
		    Thread.sleep(3000);
		    
		    //move to next product is Jacket 
		    System.out .println("Verifying Product Jacket.......");
		    System.out .println("");
		
		    Thread.sleep(3000);
		   
		    driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
		    Thread.sleep(3000);
		    WebElement Bptitle1=driver.findElement(By.xpath("//div[@class='inventory_details_name']"));
		    String Producttitle1=Bptitle1.getText();
		    if (Producttitle1.equals("Sauce Labs Fleece Jacket")) {
	            System.out.println(" Jacket Title is verified ");
	        } else {
	            System.out.println(" Jacket Title is not verified ");
	        }
	        System.out .println("");

		
	}

}
