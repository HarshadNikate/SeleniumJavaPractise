package fconcept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotationsDemo {

	@BeforeMethod
	public void setUp()
	{
		System.out.println("-----BeforeMethod-----");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("-----AfterMethod-----");
	}
	
	
	
	@Test(priority=3)
	public void testmethodOne()
	{
		System.out.println("testMethodOne");
	}
	
	@Test(priority=2)
	public void testmethodTwo()
	{
		System.out.println("testMethodTwo");
	}
	
	
	@Test(priority=1)
	public void testmethodThree()
	{
		System.out.println("testMethodThree");
	}
	
	
}
