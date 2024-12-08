package fconcept;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionDemo {

	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("----BeforeTest-----");
	}
	
	@AfterTest
	public void AfterTestMethod()
	{
		System.out.println("----AfterTest-----");
	}
	
	
	@Test
	public void SampleTestOne()
	{
		String expectedName = "Harry";
		String actualName = "Haarry";
		int a= 5;
		int b= 5;
		int c= 10;
		
		//Assert.assertEquals(expectedName, actualName);
		Assert.assertEquals(a, b);
	}
	
	@Test
	public void SampleTestTwo()
	{
		int a= 5;
		int b= 4;
		int c =6;
		
		String name1= "harry";
		String name2= "harry";
		String name3= "nikate";
		
		//Assert.assertTrue(a>b);
		//Assert.assertTrue(a>c,"+a is not greater than +c");
		Assert.assertTrue(name1.equals(name2));
	}
	
	@Test
	public void SampleTestThree()
	{
		int a =6;
		int b= 7;
		String name2= "harry";
		String name3= "nikate";
		
		//Assert.assertFalse(a>b);
		Assert.assertFalse(name2.equals(name3));
	
	}
	
	
	
	
}
