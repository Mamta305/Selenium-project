package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DramaSouth {
	private WebDriver driver; 
	
	public DramaSouth(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/list/e6b11783d0b170030f4f54b94a4bd084?sectionName=Drama+From+The+South&sectionStyle=grid_vertical&pageDirection=1&finalId=471d0a44b96aa7359e1f7acccc559766']")
	private WebElement dramaSouth; 
	
	public void dramaFromSouth() {
		this.dramaSouth.click(); 
		String str=this.dramaSouth.getText();
		System.out.println(str);
		Assert.assertEquals(str,"Drama From The South");
	}
}
