package handlingframesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameWithNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		driver.switchTo().frame("classFrame");
		
		WebElement descriptionlink = driver.findElement(By.xpath("//a[text()='Description']"));
		descriptionlink.click();
		

	}

}
