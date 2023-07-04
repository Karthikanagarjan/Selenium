package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteLead {
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N1");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sangee1");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("R&D1");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("A research and development needs.");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("krthika901@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Delete")).click();
		
	}

}
