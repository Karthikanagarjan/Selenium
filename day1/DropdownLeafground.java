package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownLeafground {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml ");
		driver.manage().window().maximize();
		
		WebElement drpdn =driver.findElement(By.className("ui-selectonemenu"));
		Select sel=new Select(drpdn);
		sel.selectByVisibleText("Selenium");
		
		WebElement precountry = driver.findElement(By.className("ui-selectonemenu ui-widget ui-state-default ui-corner-all"));
		Select selprecountry=new Select(precountry);
		selprecountry.selectByValue("India");
		
		/*
		 * 1.https://www.leafground.com/input.xhtml
		 * 2.https://www.leafground.com/button.xhtml
		 * 3.https://www.leafground.com/select.xhtml
		 * 4.https://www.leafground.com/checkbox.xhtml
		 * 5.https://www.leafground.com/radio.xhtml
		 */
	}

}
