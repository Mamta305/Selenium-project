package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alist {
	private WebDriver driver; 
	
	public Alist(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/list/41071aebf06fd02b98ef05956a48f0dc?sectionName=A-listers+on+MX&sectionStyle=grid_vertical&pageDirection=1&finalId=b158cc19869b458246754df8725f15ad']")
	private WebElement alist; 
	
	public void AList() {
		this.alist.click(); 
	}
}
