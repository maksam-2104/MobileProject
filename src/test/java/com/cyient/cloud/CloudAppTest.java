package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CloudAppTest {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	    
	      DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "mayankkaushik_u3K2UN");
	      caps.setCapability("browserstack.key", "EqLeM23W6rpyxqYpjDVs");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://2e2f04237a64ba206038da431cd0e57b04589c59");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "First Java Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	        
	      // String visibleText = "Traversing";
	        //driver.findElementByAndroidUIAutomator
	        //("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
		
	        driver.findElement(By.id("com.ssstudio.grammarhandbook:id/frame_01")).click();
	        
	        driver.findElement(By.id("com.ssstudio.grammarhandbook:id/btGrammar")).click();
	        Thread.sleep(3000);	      /* Write your Custom code here */
	        
	        
	      // Invoke driver.quit() after the test is done to indicate that the test is completed.
	      driver.quit();
	    
	    }
	      
	  }


