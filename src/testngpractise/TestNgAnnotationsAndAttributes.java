package testngpractise;

import org.testng.annotations.Test;

public class TestNgAnnotationsAndAttributes 
{
	@Test(priority=1,invocationCount=0)
	public void A()
	{
		System.out.println("A");
	}
	@Test(priority=3,enabled=false)
	public void a()
	{
		System.out.println("a");
	}
	@Test(priority=2)
	public void m()
	{
		System.out.println("m");
	}
}
