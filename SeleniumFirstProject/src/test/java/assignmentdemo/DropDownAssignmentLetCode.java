package assignmentdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignmentLetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	1.Select the apple using visible text
		
	/*	ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement appleselect = driver.findElement(By.id("fruits"));
		Select select = new Select(appleselect);
		select.selectByVisibleText("Apple");
		
		WebElement selectedtext = driver.findElement(By.className("subtitle"));
	    System.out.println(selectedtext.getText());    */
	
   //2.Select your super hero's
       
	
/*	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/dropdowns");
	WebElement selecthero = driver.findElement(By.id("superheros"));
	Select select = new Select(selecthero);
	select.selectByIndex(2);	  */
	
		
	//	3. Select the last programming language and print all the options
/*	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/dropdowns");
	WebElement proglang = driver.findElement(By.id("lang"));
	Select select = new Select(proglang);
	select.selectByValue("sharp");

	List<WebElement> options = select.getOptions();
	for(WebElement option: options)
	{
	  System.out.println(option.getText()); 
	}                                                      */
	
	
	// 4.  Select India using value & print the selected value
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement country = driver.findElement(By.id("country"));
		Select select = new Select (country);
		select.selectByValue("India");
		WebElement indiaoption = select.getFirstSelectedOption();
	System.out.println(indiaoption.getText());	
	
	driver.quit();
		
	}

}
