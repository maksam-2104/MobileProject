package com.cyient.testapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class WebAppTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "john");
		cap.setCapability("platformName", "Android");
		
		cap.setCapability("app", "C:\\Users\\ADITYA\\Desktop\\Automation\\java_workspace\\MobileProject\\src\\test\\resources\\AppiumFolder\\com.ssstudio.grammarhandbook_2020-09-07.apk");
		cap.setCapability("udid", "9aeea7e");
		cap.setCapability("platformVersion", "V1.0");
		 AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		   driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		   
		   //driver.findElementById("467cabc6-2ee3-4faf-b7e3-447f40781751").click();
   // System.out.println(driver.getTitle());
    //System.out.println(driver.getCurrentUrl());
		   Thread.sleep(5000);
    driver.quit();

	}

}
