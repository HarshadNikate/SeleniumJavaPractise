package handlingkeyboardeventspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		
		WebElement frameelement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameelement);
		Actions action = new Actions(driver);
		WebElement dragelement = driver.findElement(By.xpath("//div[contains(@class,'ui-icon ui-icon-gripsmall-diagonal-se')]"));
		action.dragAndDropBy(dragelement, 180, 75).perform();
		//div[@	='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']

	}

}
