package testngpractise;

import org.testng.annotations.Test;

public class DependOnMethod 
{
	@Test()
	public void A()
	{
		System.out.println("A");
	}
	@Test(dependsOnMethods="A")
	public void a()
	{
		System.out.println("a");
	}
	@Test()
	public void m()
	{
		System.out.println("m");
	}
	@Test(dependsOnMethods="m")
	public void b()
	{
		System.out.println("b");
	}

}
