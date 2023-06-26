package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotToMIssed {
	private WebDriver driver; 
	
	public NotToMIssed(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/list/e05a4644777244f8fc66b59b72dc7484?sectionName=Movies+Not+To+Be+Missed&sectionStyle=grid_vertical&pageDirection=1&finalId=c1be7ebaf34ec519b425b0e9d897f533']")
	private WebElement notToMissed; 
	
	public void notToMiss() {
		this.notToMissed.click(); 
	}
}
