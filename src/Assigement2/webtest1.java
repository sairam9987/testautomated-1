package Assigement2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class webtest1 {

	WebDriver  driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		// Setting up Chrome driver

		System.setProperty("Webdriver.chrome.driver","C:\\SeleniumWebDriver\\chromedriver-win64.exe");

		driver=new ChromeDriver();

		driver.manage().window().maximize();
		// Open Sauce Labs homepage
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(3000);
		
	}

	@Test (priority = 1)
	public void loginpage1() throws InterruptedException {


		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();

		System.out.println("Login Sucessfuly");
        Thread.sleep(3000);
	}

	@Test (priority = 2)
	public void navabout() throws InterruptedException {
		// opening about menu
		driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click(); 
		Thread.sleep(2000);
		WebElement about = driver.findElement(By.linkText("About"));
		if (about.isDisplayed() &&about.isEnabled()) {
			driver.findElement(By.linkText("About")).click();

			System.out.println("About page open succusfuly  "); 
			Thread.sleep(3000);
			
			

		}
		else {
			System.out.println("About page not open succusfuly ");

		}

		driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
		Thread.sleep(3000);
	}

	@Test (priority = 3)
	public void productmenu () throws InterruptedException {
		//navigate to product menu
		driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")).click();

	   Thread.sleep(3000);

	}

	@Test (priority = 4)
	public void paltform_for_test1 () throws InterruptedException {
		//navigate first option in productmenu platforn for test

		WebElement platform = driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Platform for Test']"));
		if (platform.isDisplayed() &&platform.isEnabled()) {
			driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Platform for Test']")).click();

			System.out.println("platform for Test menu open succusfully  ");            
			Thread.sleep(3000);

		}
		else {
			System.out.println("platform for Test menu  not open succusfully ");

		}	
		

	}
	
	
	@Test (priority = 5)
	public void paltform_for_tes_sub () throws InterruptedException {
		//navigate product dropdown 

		
			   driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")).click();

			   Thread.sleep(3000);

	}
	
	@Test (priority = 6)
	public void paltform_for_sub1() {
		//navigate first option in productmenu platforn for test

		WebElement sub2 = driver.findElement(By.xpath("//a[@href='/products/cross-browser-testing']//div[@class='MuiBox-root css-d416pa']"));
		if (sub2.isDisplayed() &&sub2.isEnabled()) {
			driver.findElement(By.xpath("//a[@href='/products/cross-browser-testing']//div[@class='MuiBox-root css-d416pa']")).click();

			System.out.println("platform for Test sub2 menu open succusfully  ");            


		}
		else {
			System.out.println("platform for Test sun2  not open succusfully ");

		}	
		

	}
	
	@Test (priority = 7)
	public void paltform_for_test_subst1() throws InterruptedException {
		//navigate product dropdown 

		
		   driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")).click();

		   Thread.sleep(3000);
	}
	
	@Test (priority = 8)
	public void paltform_for_testsub33() throws InterruptedException {
		//navigate first option in productmenu platforn for test

		WebElement sub3 = driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Sauce Mobile']"));
		if (sub3.isDisplayed() &&sub3.isEnabled()) {
			driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Sauce Mobile']")).click();

			System.out.println("platform for Test sub3 menu open succusfully  ");            
			Thread.sleep(3000);

		}
		else {
			System.out.println("platform for Test sub3 menu  not open succusfully ");

		}	
		

	}
	
	
	
	@Test (priority = 9)
	public void paltform_for_test_subst2() throws InterruptedException {
		//navigate product dropdown 

		
		   driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")).click();

		   Thread.sleep(3000);
	}
	
	@Test (priority = 10)
	public void paltform_for_testsub4() {
		//navigate first option in productmenu platforn for test

		WebElement sub4 = driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Sauce Low-Code']"));
		if (sub4.isDisplayed() &&sub4.isEnabled()) {
			driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Sauce Low-Code']")).click();

			System.out.println("platform for Test sub4 menu open succusfully  ");            


		}
		else {
			System.out.println("platform for Test sub4 menu  not open succusfully ");

		}	
		

	}@Test (priority = 11)
	public void paltform_for_test_subst5() throws InterruptedException {
		//navigate product dropdown 

		
		   driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")).click();

		   Thread.sleep(3000);
	}
	
	@Test (priority = 12)
	public void paltform_for_testsub34() {
		//navigate first option in productmenu platforn for test

		WebElement sub5 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/a[1]/div[1]"));
		if (sub5.isDisplayed() &&sub5.isEnabled()) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/a[1]/div[1]")).click();

			System.out.println("platform for Test sub5 menu open succusfully  ");            


		}
		else {
			System.out.println("platform for Test sub5 menu  not open succusfully ");

		}	
		

	}@Test (priority = 13)
	public void paltform_for_test_subst6() throws InterruptedException {
		//navigate product dropdown 

		
		   driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")).click();

		   Thread.sleep(3000);
	}
	
	@Test (priority = 14)
	public void paltform_for_testsub7() {
		//navigate first option in productmenu platforn for test

		WebElement sub6 = driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Sauce Orchestrate']"));
		if (sub6.isDisplayed() &&sub6.isEnabled()) {
			driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Sauce Orchestrate']")).click();

			System.out.println("platform for Test sub6 menu open succusfully  ");            


		}
		else {
			System.out.println("platform for Test sub6 menu  not open succusfully ");

		}	
		

	}@Test (priority = 15)
	public void paltform_for_test_subst7() throws InterruptedException {
		//navigate product dropdown 

		
		   driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")).click();

		   Thread.sleep(3000);
	}
	
	@Test (priority = 16)
	public void paltform_for_testsub8() {
		//navigate first option in productmenu platforn for test

		WebElement sub7 = driver.findElement(By.xpath("//a[@href='/products/api-testing']//div[@class='MuiBox-root css-d416pa']"));
		if (sub7.isDisplayed() &&sub7.isEnabled()) {
			driver.findElement(By.xpath("//a[@href='/products/api-testing']//div[@class='MuiBox-root css-d416pa']")).click();

			System.out.println("platform for Test sub7 menu open succusfully  ");            


		}
		else {
			System.out.println("platform for Test sub7 menu  not open succusfully ");

		}	
		

	}@Test (priority = 17)
	public void paltform_for_test_subst9() throws InterruptedException {
		//navigate product dropdown 

		
		   driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")).click();

		   Thread.sleep(3000);
	}
	
	@Test (priority = 18)
	public void paltform_for_testsub9() {
		//navigate first option in productmenu platforn for test

		WebElement sub8 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/a[1]/div[1]"));
		if (sub8.isDisplayed() &&sub8.isEnabled()) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/a[1]/div[1]")).click();

			System.out.println("platform for Test sub8 menu open succusfully  ");            


		}
		else {
			System.out.println("platform for Test sub8 menu  not open succusfully ");

		}	
		

	}@Test (priority = 19)
	public void paltform_for_test_subst10() throws InterruptedException {
		//navigate product dropdown 

		
		   driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")).click();

		   Thread.sleep(3000);
	}
	
	@Test (priority = 20)
	public void paltform_for_testsub10() {
		//navigate first option in productmenu platforn for test

		WebElement sub9 = driver.findElement(By.xpath("//span[normalize-space()='Insights']"));
		if (sub9.isDisplayed() &&sub9.isEnabled()) {
			driver.findElement(By.xpath("//span[normalize-space()='Insights']")).click();

			System.out.println("platform for Test sub9 menu open succusfully  ");            


		}
		else {
			System.out.println("platform for Test sub9 menu  not open succusfully ");

		}	
		

	}@Test (priority = 21)
	public void paltform_for_test_subsft() throws InterruptedException {
		//navigate product dropdown 

		
		   driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'][normalize-space()='Products']")).click();

		   Thread.sleep(3000);
	}
	
	@Test (priority = 22)
	public void paltform_for_testsub11() {
		//navigate first option in productmenu platforn for test

		WebElement sub10 = driver.findElement(By.xpath("//a[@href='/products/sauce-performance']//div[@class='MuiBox-root css-d416pa']//div[@class='MuiBox-root css-0']//div[@class='MuiStack-root css-1xhj18k']//div[@class='MuiBox-root css-111wug5']//span//img[@alt='location']"));
		if (sub10.isDisplayed() &&sub10.isEnabled()) {
			driver.findElement(By.xpath("//a[@href='/products/sauce-performance']//div[@class='MuiBox-root css-d416pa']//div[@class='MuiBox-root css-0']//div[@class='MuiStack-root css-1xhj18k']//div[@class='MuiBox-root css-111wug5']//span//img[@alt='location']")).click();

			System.out.println("platform for Test sub10 menu open succusfully  ");            


		}
		else {
			System.out.println("platform for Test sub10 menu  not open succusfully ");

		}	
		
          driver.quit();
	}    
	


/*
	@Test (groups={"smoke"})
	public void solution1() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub1 = driver.findElement(By.xpath("//span[normalize-space()='Enterprise']"));
		if (srsub1.isDisplayed() &&srsub1.isEnabled()) {
			driver.findElement(By.xpath("//span[normalize-space()='Enterprise']")).click();

			System.out.println("Solution sub1 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub1 menu  not open succusfully ");

		}	
		

	}
	
	
	

	@Test (groups={"smoke"})
	public void solution2() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub2 = driver.findElement(By.xpath("//a[@href='/developers']//div[@class='MuiBox-root css-d416pa']"));
		if (srsub2.isDisplayed() &&srsub2.isEnabled()) {
			driver.findElement(By.xpath("//a[@href='/developers']//div[@class='MuiBox-root css-d416pa']")).click();

			System.out.println("Solution sub2 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub2 menu  not open succusfully ");

		}	
		

	}
	

	@Test (groups={"smoke"})
	public void solution3() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub3 = driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/a[1]/div[1]"));
		if (srsub3.isDisplayed() &&srsub3.isEnabled()) {
			driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/a[1]/div[1]")).click();

			System.out.println("Solution sub3 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub3 menu  not open succusfully ");

		}	
		

	}
	

	@Test (groups={"smoke"})
	public void solution4() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub4 = driver.findElement(By.xpath("//div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']//div[2]//div[2]//div[1]//div[1]//div[2]//div[2]//div[2]//div[1]//a[1]//div[1]//div[1]//div[1]//div[2]"));
		if (srsub4.isDisplayed() &&srsub4.isEnabled()) {
			driver.findElement(By.xpath("//div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']//div[2]//div[2]//div[1]//div[1]//div[2]//div[2]//div[2]//div[1]//a[1]//div[1]//div[1]//div[1]//div[2]")).click();

			System.out.println("Solution sub4 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub4 menu  not open succusfully ");

		}	
		

	}
	

	@Test (groups={"smoke"})
	public void solution5() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub5 = driver.findElement(By.xpath("//span[normalize-space()='Crash & error reporting']"));
		if (srsub5.isDisplayed() &&srsub5.isEnabled()) {
			driver.findElement(By.xpath("//span[normalize-space()='Crash & error reporting']")).click();

			System.out.println("Solution sub5 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub5 menu  not open succusfully ");

		}	
		

	}
	
	
	
	

	@Test (groups={"smoke"})
	public void solution6() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub6 = driver.findElement(By.xpath("//span[normalize-space()='Debugging']"));
		if (srsub6.isDisplayed() &&srsub6.isEnabled()) {
			driver.findElement(By.xpath("//span[normalize-space()='Debugging']")).click();

			System.out.println("Solution sub6 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub6 menu  not open succusfully ");

		}	
		

	}
	
	

	@Test (groups={"smoke"})
	public void solution7() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub7 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[5]/a[1]/div[1]"));
		if (srsub7.isDisplayed() &&srsub7.isEnabled()) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[5]/a[1]/div[1]")).click();

			System.out.println("Solution sub7 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub7 menu  not open succusfully ");

		}	
		

	}
	
	@Test (groups={"smoke"})
	public void solution8() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub8 = driver.findElement(By.xpath("//span[normalize-space()='Mobile beta testing']"));
		if (srsub8.isDisplayed() &&srsub8.isEnabled()) {
			driver.findElement(By.xpath("//span[normalize-space()='Mobile beta testing']")).click();

			System.out.println("Solution sub8 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub8 menu  not open succusfully ");

		}	
		

	}
	
	@Test (groups={"smoke"})
	public void solution9() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub9 = driver.findElement(By.xpath("//a[@href='/solutions/scalable-test-automation']//div[@class='MuiBox-root css-d416pa']"));
		if (srsub9.isDisplayed() &&srsub9.isEnabled()) {
			driver.findElement(By.xpath("//a[@href='/solutions/scalable-test-automation']//div[@class='MuiBox-root css-d416pa']")).click();

			System.out.println("Solution sub9 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub9 menu  not open succusfully ");

		}	
		

	}
	
	@Test (groups={"smoke"})
	public void solution10() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub10 = driver.findElement(By.xpath("//span[normalize-space()='Test analytics']"));
		if (srsub10.isDisplayed() &&srsub10.isEnabled()) {
			driver.findElement(By.xpath("//span[normalize-space()='Test analytics']")).click();

			System.out.println("Solution sub10 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub10 menu  not open succusfully ");

		}	
		

	}
	
	@Test (groups={"smoke"})
	public void solution11() throws InterruptedException {
		//navigate first option in productmenu platforn for test
		driver.findElement(By.xpath("//body/div[@id='__next']/header[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation4 MuiAppBar-root MuiAppBar-colorPrimary MuiAppBar-positionFixed mui-fixed css-1g82i9p']/div[@class='MuiContainer-root MuiContainer-maxWidthXl MuiContainer-disableGutters css-1orecca']/div[@class='MuiToolbar-root MuiToolbar-regular css-oxdlem']/div[@class='MuiStack-root css-19diydd']/div[@class='PrivateHiddenCss-root PrivateHiddenCss-mdDown css-9sga2b']/div[@class='MuiStack-root css-e3zn88']/div[2]/div[1]/div[2]/span[1]/img[1]")).click();
		Thread.sleep(3000);

		WebElement srsub11 = driver.findElement(By.xpath("//a[@href='/products/test-orchestration']//div[@class='MuiBox-root css-d416pa']//div[@class='MuiBox-root css-0']//div[@class='MuiStack-root css-1xhj18k']//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Test orchestration']"));
		if (srsub11.isDisplayed() &&srsub11.isEnabled()) {
			driver.findElement(By.xpath("//a[@href='/products/test-orchestration']//div[@class='MuiBox-root css-d416pa']//div[@class='MuiBox-root css-0']//div[@class='MuiStack-root css-1xhj18k']//div[@class='MuiBox-root css-0']//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx'][normalize-space()='Test orchestration']")).click();

			System.out.println("Solution sub11 menu open succusfully  ");            


		}
		else {
			System.out.println("Solution sub11 menu  not open succusfully ");

		}	
		
		driver.quit();

	}
	
	*/
	

}

