package dropdownfieldsdemp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFieldFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiselectiondrpdwn = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiselectiondrpdwn);
		
		select.selectByIndex(0);
	//	select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
		
		List<WebElement> selectedoptions = select.getAllSelectedOptions();
		
	     int ab = selectedoptions.size();
	     System.out.println(ab);
		
	     
	     
	    /* for(int i = 0;i<ab;i++)
	     {
	    	 WebElement option = selectedoptions.get(i);
	    	 option.getText();
	    	 System.out.println(option.getText());
	     }*/
	     
		
		for(WebElement option:selectedoptions)
		{
			String text = option.getText();
		    System.out.println(text);
		}
		
		
		//WebElement a = select.getFirstSelectedOption();
      //System.out.println(a.getText()); 
	}

}
