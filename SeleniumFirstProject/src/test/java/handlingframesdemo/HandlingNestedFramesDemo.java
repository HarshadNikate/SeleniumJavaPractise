package handlingframesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		
		WebElement firstname = driver.findElement(By.name("fname"));
        firstname.sendKeys("Harry");
        
        WebElement lastname = driver.findElement(By.name("lname"));
        lastname.sendKeys("nikate");
        
        WebElement nestedframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(nestedframe);
		
		WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("harshadnikate@gmail.com");
        
	//	driver.quit();
	}

}
