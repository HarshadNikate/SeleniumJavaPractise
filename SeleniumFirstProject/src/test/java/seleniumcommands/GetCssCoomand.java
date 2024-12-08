package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssCoomand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement getcss =driver.findElement(By.linkText("Page One"));
		String color =getcss.getCssValue("color");
		System.out.println(color);
		driver.quit();
	}

}
