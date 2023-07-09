package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createAccount 
{
	public static void main(String[] args) 
	{
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		//   2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//  3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//   4. Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//   5. Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();
		
		//   6. Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		
		//   7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		//  8. Enter DEscriptiion as "Selenium Automation Tester"
		
		driver.findElement(By.xpath("//textarea[@class='inputBox'][1]")).sendKeys("Selenium Automation Tester");
		// 9. Enter LocalName Field Using Xpath Locator
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Localnamevalue");
		//   10. Enter SiteName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Sitenamevalue");

		//   11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("");

		//  12. Select Industry as ComputerSoftware
		WebElement industryname=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select selindustryname=new Select(industryname);
	selindustryname.selectByIndex(2);
		

		//  13. Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement ownerShip=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select selownerShip=new Select(ownerShip);
		selownerShip.selectByVisibleText("S-Corporation");
		
		
		//  14. Select Source as Employee using SelectByValue
		WebElement source=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select selsource=new Select(source);
		selsource.selectByValue("LEAD_EMPLOYEE");

		//   15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		WebElement marcamp=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select selmarcap=new Select(marcamp);
		selmarcap.selectByIndex(5);

		//   16. Select State/Province as Texas using SelectByValue 
		
		WebElement state=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select selstate=new Select(state);
		selstate.selectByValue("TX");
		//   17. Click on Create Account using Xpath Locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
	}

}
