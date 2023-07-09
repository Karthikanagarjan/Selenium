package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTestcase 
{
	/*Launch https://login.salesforce.com/
Enter username as hari.radhakrishnan@qeagle.com
3.  Enter password as Leaf@1234
4.  Click on Login.
*/
public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username"));
	WebElement eleUsername=driver.findElement(By.id("username"));
	eleUsername.sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	driver.findElement(By.id("Login")).click();	
	driver.close();
}
}
