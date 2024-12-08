package alertdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertPresentExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement jsalertbtn=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		//jsalertbtn.click();
		try {
			
		Alert alert=driver.switchTo().alert();
		String msgtext=alert.getText();
		System.out.println(msgtext);
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("No alert is present");
		} 
		
		

		
	}

}
