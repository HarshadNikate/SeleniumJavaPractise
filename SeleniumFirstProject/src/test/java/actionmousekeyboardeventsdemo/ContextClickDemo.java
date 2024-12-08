package actionmousekeyboardeventsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://tutorialsninja.com/demo/");
		
		Actions action = new Actions(cd);
		WebElement searchbox = cd.findElement(By.id("search"));
		
		action.contextClick(searchbox).perform();
		
	}

}
