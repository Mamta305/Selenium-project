package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Blockbust {
	private WebDriver driver; 
	
	public Blockbust(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/list/3fcef01871ef43da07bf35fe8a948e77?sectionName=Blockbuster+Movies&sectionStyle=grid_vertical&pageDirection=1&finalId=23378099fe9b7da4595c0549da9820e3']")
	private WebElement block; 
	public void BlockBuster() {
		Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Blockbuster Movies']")),"Blockbuster Movies");
		this.block.click();
		
	}
	
	
}
