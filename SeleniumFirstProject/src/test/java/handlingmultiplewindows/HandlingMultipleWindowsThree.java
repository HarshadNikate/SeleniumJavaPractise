package handlingmultiplewindows;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindowsThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String omayowindow = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://selenium143.blogspot.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.blogger.com/about/");

	}

}
