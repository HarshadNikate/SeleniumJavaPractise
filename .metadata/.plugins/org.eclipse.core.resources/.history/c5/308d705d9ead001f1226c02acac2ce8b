package takingScreenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
	    File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
	    File destfile = new File(System.getProperty("user.dir"+ "/src/test/java/takingScreenShotDemo"));
	    FileUtils.copyFile(srcfile,destfile);
	    System.out.println("Screenshot is captured");
	    driver.quit();
	    
	}

}
