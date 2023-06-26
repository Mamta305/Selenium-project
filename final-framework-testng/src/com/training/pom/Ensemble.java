package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ensemble {
	private WebDriver driver; 
	
	public Ensemble(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/list/f729e4e683ea9a4e23e8d205195c227e?sectionName=Ensemble+Movies&sectionStyle=grid_vertical&pageDirection=1&finalId=fb1e6d76eef3d0a2adecb8505c87355d']")
	private WebElement ensembleMovies; 
	
	public void ensmble() {
		this.ensembleMovies.click(); 
	}
}
