package inputdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		
		WebElement fullname = driver.findElement(By.id("fullName"));
		fullname.sendKeys("Harshad Nikate");
		
		WebElement appendfield=driver.findElement(By.id("join"));
		appendfield.sendKeys(" Tester");
		appendfield.sendKeys(Keys.TAB);
		
		 WebElement gettext=driver.findElement(By.id("getMe"));
		 gettext.getAttribute("value");
		 System.out.println(gettext.getAttribute("value"));
		 
		 
		 WebElement cleartxt = driver.findElement(By.id("clearMe"));
		 cleartxt.clear();
		 
		 WebElement read = driver.findElement(By.id("noEdit"));
		 boolean state=read.isEnabled();
		 
		 if(state)
		 {
			 System.out.println("It is enabled");
		 }
		 else
		 {
			 System.out.println("It is disabled");
		 }
		 
		 WebElement readonly = driver.findElement(By.id("dontwrite"));
		 String readabletext=readonly.getAttribute("value");
		 
		 if(readabletext.equals("This text is readonly"))
		 {
			 System.out.println("It is readonly text");
		 }
		 else
		 {
			 System.out.println("It is not readonly text");
		 }
		
		
		

	}

}
