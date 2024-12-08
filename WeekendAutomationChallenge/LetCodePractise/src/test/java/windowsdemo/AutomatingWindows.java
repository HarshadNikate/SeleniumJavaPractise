package windowsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		WebElement clickbtn=driver.findElement(By.id("home"));
		clickbtn.click();
		String homewindow =driver.getWindowHandle();
		
		driver.switchTo().window(homewindow);
		driver.getTitle();
		System.out.println(	driver.getTitle());

	}

}
