package handlingbootstrapdropdownpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingBootstrapDropdownFieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
				
		
		WebElement selectprodtype = driver.findElement(By.xpath("//a[text()='Select Product Type']"));
		selectprodtype.click();
		WebElement account = driver.findElement(By.xpath("//li[text()='Accounts']"));
		account.click();
		
		WebElement selectproduct = driver.findElement(By.xpath("//a[text()='Select Product']"));
		selectproduct.click();
		WebElement salaryaccount = driver.findElement(By.xpath("//li[text()='Salary Accounts']"));
		salaryaccount.click();
		
		
		
	}

}
