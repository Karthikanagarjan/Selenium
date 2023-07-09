package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


// Create Lead Assignment

public class dropdownExcer 
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.linkText("Leads")).click();	
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
	
WebElement ddsource = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select sel=new Select(ddsource);
sel.selectByVisibleText("Employee");

WebElement mcamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select selmcamp=new Select(mcamp);
selmcamp.selectByValue("Pay Per Click Advertising");

WebElement oship = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select seloship=new Select(oship);
seloship.selectByIndex(5);

WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select selcountry=new Select(country);
selcountry.selectByVisibleText("India");

driver.findElement(By.name("submitButton")).click();


	
	
	
	}
}
