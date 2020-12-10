package com.specreader.automation.apmp;

import org.testng.TestNG;

import com.specreader.automation.app.App;
import com.specreader.automation.mep.Mep;
import com.specreader.automation.mip.Mip;

public class Run {
	static TestNG testng;
	public static void main(String[] args) {
		testng=new TestNG();
		testng.setTestClasses(new Class[] {Apmp.class,Mep.class,Mip.class,App.class});
		testng.run();

	}

}
