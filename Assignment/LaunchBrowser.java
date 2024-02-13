package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// step 1 - to launch browser
		
		//ChromeDriver driver = new ChromeDriver();
		
		EdgeDriver driver = new EdgeDriver();
		// step 2 -maximize screen
		
		driver.manage().window().maximize();
		
		// Step 3 - Load the   -> .get()
		driver.get("https://www.facebook.com/");
		
		
		
		
		
		
		

	}

}
