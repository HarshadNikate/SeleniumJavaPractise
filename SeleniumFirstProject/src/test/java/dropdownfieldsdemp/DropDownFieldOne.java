package dropdownfieldsdemp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFieldOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdownfieldElement = driver.findElement(By.id("drop1"));
		Select select= new Select(dropdownfieldElement);
		
		//select.selectByVisibleText("doc 4");
		select.selectByIndex(1);
		//select.selectByValue("mno");
		
		}

}
