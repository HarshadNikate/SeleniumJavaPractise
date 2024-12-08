package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement chkbox1 =driver.findElement(By.id("checkbox1"));
		boolean orange =chkbox1.isSelected();
		
		if(orange)
		{
			System.out.println("Orange checkbox is selected");
		}
		else
		{
			System.out.println("Blue checkbox is unselected");
		}
		
		WebElement chkbox2 =driver.findElement(By.id("checkbox2"));
		boolean blue =chkbox2.isSelected();
		
		if(blue)
		{
			System.out.println("blue checkbox is selected");
		}
		else
		{
			System.out.println("Blue checkbox is unselected");
		}
		
		driver.close();
		
		
		
		
		
	}

}
