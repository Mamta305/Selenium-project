package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Watch {
	private WebDriver driver; 
	
	public Watch(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/list/04235b6123f8ac456a2b805ee766a5fd?sectionName=Movies+Worth+Watching&sectionStyle=grid_vertical&pageDirection=1&finalId=2b8b6e44c646ebc2be7a1f6e4d3fcafc']")
	private WebElement worth; 
	public void worthWatch() {
		Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='On Popular Demand']")),"On Popular Demand");
		this.worth.click();
		
	}
	
	
}
