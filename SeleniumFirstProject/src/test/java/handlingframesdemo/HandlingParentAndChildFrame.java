package handlingframesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingParentAndChildFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		
		WebElement childframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(childframe);
		
		WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("harshadnikate@gmail.com");

        driver.switchTo().parentFrame();
        
        WebElement firstname = driver.findElement(By.name("fname"));
        firstname.sendKeys("roshan");
        
        WebElement lastname = driver.findElement(By.name("lname"));
        lastname.sendKeys("nikate");
        
        driver.switchTo().defaultContent();
        
        WebElement headtext = driver.findElement(By.xpath("//div[@class='container']/h1"));
      System.out.println(headtext.getText());  
        

	}

}
