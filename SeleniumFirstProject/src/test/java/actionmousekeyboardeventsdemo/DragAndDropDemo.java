package actionmousekeyboardeventsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement oslobox = driver.findElement(By.id("box1"));
		
		Actions action = new Actions(driver);
		WebElement norwaybox = driver.findElement(By.id("box101"));
		
		action.dragAndDrop(oslobox, norwaybox).perform();
		
	}

}
