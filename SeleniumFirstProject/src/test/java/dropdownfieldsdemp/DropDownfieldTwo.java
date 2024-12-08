package dropdownfieldsdemp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownfieldTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiselectiondrpdwn = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiselectiondrpdwn);
		
		boolean a=select.isMultiple();
		System.out.println(a);
		
		
		driver.quit();
		
		
		
	}

}
