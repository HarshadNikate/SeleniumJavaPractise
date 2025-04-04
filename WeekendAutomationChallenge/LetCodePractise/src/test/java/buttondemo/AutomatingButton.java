package buttondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		WebElement homebutton = driver.findElement(By.id("home"));
		homebutton.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
	WebElement findLB=driver.findElement(By.id("position"));
	Point coordinates = findLB.getLocation();
	System.out.println("x coordinate position of a button " +coordinates.x)	;
	System.out.println("y coordinate position of a button " +coordinates.y);
	
	//x and y coordinates can also be find using getRect();
	//getRect() can also be used to retreive x&y coordinates and size of the button
	
	
	Rectangle rectangle = findLB.getRect();
	 System.out.println("x coordinate position of a button "+rectangle.getX());
	 System.out.println("y coordinate position of a button "+rectangle.getY());

	
	
	WebElement color = driver.findElement(By.id("color"));
	color.getCssValue("background-color");
	System.out.println("Colour of button is" +color.getCssValue("background-color"));
	
	WebElement sizebutton = driver.findElement(By.id("property"));
	Rectangle rectangle2 = sizebutton.getRect();
	 int height = rectangle2.getHeight();
	 int width = rectangle2.getWidth();
	 System.out.println("Height and width of button is: "+height);
	 System.out.println("Height and width of button is: "+width);
	
	WebElement disablebtn = driver.findElement(By.xpath("//button[@title='Disabled button']"));
	disablebtn.isEnabled();
	
	if(	disablebtn.isEnabled())
	{
		System.out.println("Button is in enabled state");
	}
	else
	{
		System.out.println("Button is in disabled state");
	}
	driver.quit();
	
	
	
	}

}
