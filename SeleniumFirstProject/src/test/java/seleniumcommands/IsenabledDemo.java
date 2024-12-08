package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsenabledDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement enablebutton = driver.findElement(By.id("but2"));
		boolean button1 = enablebutton.isEnabled();
		
		if(button1) {
			
			System.out.println("button 1 is enabled ");
		}
		
		else {
			System.out.println("button 1 is disabled");
		}
		
		WebElement disablebutton = driver.findElement(By.id("but1"));
		boolean button2 = disablebutton.isEnabled();
		
        if(button2) {
			
			System.out.println("button 2 is enabled ");
		}
		
		else {
			System.out.println("button 2 is disabled");
		}
		
		
		
		
	}

}
