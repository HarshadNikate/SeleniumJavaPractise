package handlingcalendarspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarOneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Excpectedmonth = "October";
		String Excpectedyear = "2024";
		String ExpectedDate = "2";

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		WebElement actualMonthElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		String actualMonth = actualMonthElement.getText();
	
		
		WebElement acutalYearElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		String acutalYear = acutalYearElement.getText();
	
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		while(!(actualMonth.equals(Excpectedmonth)&&acutalYear.equals(Excpectedyear)))
		{
			WebElement nextbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a/span[text()='Next']")));
			nextbutton.click();	
		    actualMonthElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		    actualMonth =actualMonthElement.getText();
		     acutalYearElement = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
			acutalYear = acutalYearElement.getText();
		
		}
		
	   String datexpath = "//a[@class='ui-state-default'][text()='"+ExpectedDate+"']";
	   WebElement date = driver.findElement(By.xpath(datexpath));
	   date.click();
	   WebElement showdate = driver.findElement(By.id("datepicker"));
	   System.out.println(showdate.getText());   
	}

}
