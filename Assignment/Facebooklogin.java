package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {

	public static void main(String[] args) {
		EdgeOptions op = new EdgeOptions();
        op.addArguments("--guest");
        EdgeDriver driver = new EdgeDriver(op);
//EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/?wtsid=rdr_010dXhhtyyE9gBumJ&_rdr");
		
		
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		//driver.findElement(By.id("email")).sendKeys("mowriyarajendran2004@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Mowriyacodes@123");
		//driver.findElement(By.name("login")).click();
		
		
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Mowriya");
		
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Rajendran");
		//input[@name = 'reg_email__']
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("mowriyacodes@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("mowriyacodes@gmail.com");
		
		//select[contains(@name,birthday_day)][1]
		
		driver.findElement(By.xpath("//select[contains(@name,birthday_day)][1]")).sendKeys("7");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Rajmow");
		
		
		
		WebElement  user = driver.findElement(By.name("birthday_day"));
		
		Select mnc = new Select(user);
		
		mnc.selectByValue("4");
		
WebElement  def = driver.findElement(By.name("birthday_month"));
		
		Select slc= new Select(def);
		
		slc.selectByValue("5");
		
WebElement  mom = driver.findElement(By.name("birthday_year"));
		
		Select dad= new Select(mom);
		
		dad.selectByValue("2024");
		
		//driver.findElement(By.partialLinkText("Female")).click();
		
		
	}

}
