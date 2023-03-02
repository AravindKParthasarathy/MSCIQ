package projectSpecification;

import org.testng.annotations.*;


import base.BaseClass;

public class ProjectSpecification extends BaseClass {
	@BeforeTest
	public void beforeTest()
	{
		startApp();
	}
	
	@AfterTest
	public void afterTest()
	{
		quitApp();
	}

}
