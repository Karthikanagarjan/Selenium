package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitlepage
{

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id(null)).sendKeys();
		
	}
	/*
	 * 1. Load url "https://acme-test.uipath.com/login" 2. Enter email as
	 * "kumar.testleaf@gmail.com" 3. Enter Password as "leaf@12" 4. Click login
	 * button 5. Get the title of the page and print 6. Click on Log Out 7. Close
	 * the browser (use -driver.close())
	 */
}
