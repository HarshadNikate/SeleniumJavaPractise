package dropdownfieldsdemp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFieldThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiselectiondrpdwn = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiselectiondrpdwn);
		
		
		List<WebElement>options = select.getOptions();
		for(WebElement option: options)
		{
			String text = option.getText();
			System.out.println(text);
		}
		
		driver.quit();
		
		
		
	}

}
