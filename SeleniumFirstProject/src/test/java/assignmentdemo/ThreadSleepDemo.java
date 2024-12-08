package assignmentdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleepDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("checkbox2")).click();
		
	}

}
