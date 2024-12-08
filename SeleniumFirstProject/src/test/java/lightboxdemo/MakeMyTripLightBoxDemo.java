package lightboxdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripLightBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.babybasket.com/");
		WebElement closebtn=driver.findElement(By.xpath("//button[@id='button3']"));
	    closebtn.click();
		
        
	    
	}

}
