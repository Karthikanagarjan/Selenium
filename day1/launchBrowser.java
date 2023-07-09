package week2.day1;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class launchBrowser 
{
public static void main(String[] args)
{
	SafariDriver driver =new SafariDriver();
	driver.get("https://www.facebook.com/login");
	driver.manage().window().maximize();
	}
}
