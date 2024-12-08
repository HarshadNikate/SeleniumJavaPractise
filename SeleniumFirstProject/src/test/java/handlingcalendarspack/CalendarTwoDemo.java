package handlingcalendarspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarTwoDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		
		String ExpectedMonth = "July";
		String ExpectedYear = "2025";
		
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement calendar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form-field-travel_comp_date")));
		calendar.click();
		
		WebElement NextMonthButton = driver.findElement(By.className("flatpickr-next-month"));
		NextMonthButton.click();
		WebElement ActualMonthElement = driver.findElement(By.className("cur-month"));
		String ActualMonth = ActualMonthElement.getText().trim();
		System.out.println(ActualMonth);

	//	WebElement ActualyearElement = driver.findElement(By.className("numInput cur-year"));
	//	String ActualYear = ActualyearElement.getText().trim();
		// System.out.println(ActualYear);
		//driver.findElement(By.id("form-field-travel_comp_date")).click();
	//	driver.findElement(By.className("flatpickr-next-month")).click();
		
	/*	while(!(ExpectedMonth.equals(ActualMonth)&&ExpectedYear.equals(Actualyear)))
		{
			WebElement NextMonthButton = driver.findElement(By.className("flatpickr-next-month"));
			NextMonthButton.click();
			ActualMonth = driver.findElement(By.xpath("//span[@class='cur-month']"));
			Actualyear = driver.findElement(By.xpath("//input[@class='numInput cur-year']"));
System.out.println(ActualMonth.getText());
System.out.println(Actualyear.getText());

		}*/
		
	}

}
