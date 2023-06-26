package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Everg {
	private WebDriver driver; 
	
	public Everg(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/list/45df01f428f069cb0c6863c200ae34b5?sectionName=Evergreen+Movies&sectionStyle=grid_vertical&pageDirection=1&finalId=fff56b8f86fc76cd08aef4a01a8f516e']")
	private WebElement evergreen; 
	public void EverGreen() {
		this.evergreen.click();
		
	}
	
	
}
