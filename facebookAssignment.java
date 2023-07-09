package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookAssignment 
{
public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kart");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("N");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543212");
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Kart@321*");

	
	WebElement drpdn=driver.findElement(By.xpath("//select[@name='birthday_day']"));
 Select seldrpdn=new Select(drpdn);
 seldrpdn.selectByValue("7");
 
	WebElement drpdn1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select seldrpdn1=new Select(drpdn1);
seldrpdn1.selectByVisibleText("Dec");

WebElement drpdn2=driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select seldrpd2=new Select(drpdn2);
seldrpd2.selectByValue("1987");

driver.findElement(By.xpath("//label[text()='Female']")).click();
driver.findElement(By.xpath("//button[@name='websubmit']")).click();
}
}


//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
 //        ( A normal click will do for this step) 