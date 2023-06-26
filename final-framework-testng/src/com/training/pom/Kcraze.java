package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kcraze {
	private WebDriver driver; 
	
	public Kcraze(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/list/3790b019a75cc4f149b29cc5a6cf8565?sectionName=K-Craze+Hits&sectionStyle=grid_vertical&pageDirection=1&finalId=4883c9154323c04c61f9457b432cac51']")
	private WebElement kCraze; 
	
	public void kCrazeHits () {
		this.kCraze.click(); 
	}
}
