package com.sysmatech.PageObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class RetryListener implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation, Class testclass,Constructor testConstructor , Method TestMethod) {
		annotation.setRetryAnalyzer(Retry.class);
	}
	

}
