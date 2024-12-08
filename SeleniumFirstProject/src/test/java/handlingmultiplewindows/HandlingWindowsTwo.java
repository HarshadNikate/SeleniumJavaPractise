package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsTwo {

	public static void main(String[] args) {
		// this program is assignment of handling more than two window using logic of gettitle in code of handlingWindowOne.java
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String omayowindow = driver.getWindowHandle();
		
		WebElement popupwindow=driver.findElement(By.linkText("Open a popup window"));
		popupwindow.click();
		
		
		
		Set<String> windowids = driver.getWindowHandles();
		for(String window : windowids)
		{
			driver.switchTo().window(window);
			String ExpectedTitle = "New Window";
			String ActualTitle = driver.getTitle();
			
			String popupwindow1 = null;
			
			if(ActualTitle.equals(ExpectedTitle))
			{
				String popw = popupwindow1;
				
				break;
			}
			
		}
		
		WebElement popuptext=driver.findElement(By.xpath("//h3"));
		popuptext.getText();
		System.out.println(popuptext.getText());
		driver.close();
		
		driver.switchTo().window(omayowindow);
		WebElement blogger = driver.findElement(By.linkText("Blogger"));
        blogger.click();
        
         Set<String> windows3 = driver.getWindowHandles();
         
         for(String w : windows3)
         {
        	 driver.switchTo().window(w);
        	 String expectedtext = "Blogger.com - Create a unique and beautiful blog easily.";
        	 String actualtext = driver.getTitle();
        	 String bloggerwindow= null;
        	 
        	 if(actualtext.equals(expectedtext))
        	 {
        		
				String w1= bloggerwindow;
        		 break;
        	 }
        	 
        	 
         }
         
         WebElement singin = driver.findElement(By.xpath("//a[@class='sign-in ga-header-sign-in']"));
         singin.click();
         
        // WebElement next = driver.findElement(By.className("VfPpkd-vQzf8d"));
         //next.click();
         
         
         driver.switchTo().window(omayowindow);
        WebElement textarea = driver.findElement(By.id("ta1"));
        textarea.sendKeys("hello harry here");
	}

}
