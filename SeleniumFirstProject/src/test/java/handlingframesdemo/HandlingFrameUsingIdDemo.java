package handlingframesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameUsingIdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame(0);
		WebElement paratext = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
    	System.out.println(paratext.getText());	

	}

}
