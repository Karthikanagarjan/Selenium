package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class duplicateLead {
	public static void main(String[] args) {
		
		// *1. Launch URL "http://leaftaps.com/opentaps/control/login"
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		 
		//	2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//  3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//  4. Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//  6. Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		
		//  7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//  8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika");
		
		//  9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		
		//  10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sangee");
		
		//  11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("R&D");
		
		//  12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("A research and development (R&D) engineer creates new, and refines existing, products and technologies through a process of researching, designing, experimenting and testing. Their typical duties include: creating and developing new products to meet consumer needs.");
		
	//	  13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("krthika@gmail.com");
		 
		//14. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		
	//	 15. Get the Title of Resulting Page using driver.getTitle()
		String title=driver.getTitle();
		System.out.println(title);
		 
		   //  16. Click on Duplicate button
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		
        //  17. Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testduplicate");
	
	//   18.Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sangeetha");
		   	
       
		//   	19.Click on Create Lead Button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		   	
       //   20. Get the Title of Resulting Page using driver.getTitle()
          String title1=driver.getTitle();
		System.out.println(title1);
		
	}

}
