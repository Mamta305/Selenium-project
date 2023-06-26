package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnPop {
	private WebDriver driver; 
	
	public OnPop(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/list/e87db2554147daaaba5fec59db82388c?sectionName=On+Popular+Demand&sectionStyle=grid_vertical&pageDirection=1&finalId=504e11c14655f9c3bcd0ec45c1aea5c1']")
	private WebElement onDemand; 
	
	public void onPopDmd() {
		this.onDemand.click(); 
	}
}
