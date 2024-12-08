package fconcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClassAnotationsDemo {

	@BeforeClass
	public void setUp()
	{
		System.out.println("-----BeforeClass-----");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("-----AfterClass-----");
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
