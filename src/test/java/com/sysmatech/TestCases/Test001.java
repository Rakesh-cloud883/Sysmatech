package com.sysmatech.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 extends BaseClass {
	@Test() //retryAnalyzer = com.sysmatech.PageObject.Retry.class
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
}
