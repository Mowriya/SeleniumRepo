package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginToWebpage {
	
	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver = new ChromeDriver();
		
		EdgeDriver driver = new EdgeDriver();

		
		driver.manage().window().maximize();
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("DemoSalesManager");
		user.clear();
		user.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		

		//contains - partial value
		if(title.contains("TestLeaf Automation")) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login is not successful");
		}
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//driver.findElement(By.partialLinkText("CRM/")).click();
		

		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Mowriya");
		
		
		
		//driver.findElement(By.linkText("Leads")).click();
		
		//driver.findElement(By.linkText("Create Lead")).click();
		
		
		// return for findElement -> webelement
		
	
		
//WebElement data = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		WebElement data = driver.findElement(By.name("industryEnumId"));
	
	// select class
	// step 1
	Select opt = new Select(data);
	
	//step 2
	//opt.selectByIndex(1);
	
	//step 3
	opt.selectByVisibleText("Computer Software"); // use this mostly
	
	
	WebElement User = driver.findElement(By.name("ownershipEnumId"));
	
	Select src = new Select (User);
	
	
	src.selectByVisibleText("S-Corporation");
	
	WebElement Emp = driver.findElement(By.id("dataSourceId"));
	
	Select plo = new Select (Emp);
	
	plo.selectByValue("LEAD_EMPLOYEE");
	

	
	WebElement mar = driver.findElement(By.id("marketingCampaignId"));
	
	Select sck = new Select (mar);
	
	sck.selectByIndex(6);
	
	WebElement sch = driver.findElement (By.id("generalStateProvinceGeoId"));
	
	Select mns = new Select(sch);
	
	mns.selectByValue("TX");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	
	
	
	
	
		
		//Thread.sleep(3000);
		//driver.close();
		
		

}}
