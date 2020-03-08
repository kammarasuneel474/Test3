package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coursecatalog1POM {

	private WebDriver driver; 
	
	public Coursecatalog1POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Course catalog")
	private WebElement coursecatalog; 
	
	@FindBy(name="search_term")
	private WebElement searchbox;
	
	@FindBy(className="input-group-btn")
	private WebElement submitbutton;
	
	@FindBy(className="btn btn-success btn-sm")
	private WebElement subscribe;
	
	@FindBy(className="title")
	private WebElement projectname;
	
	@FindBy(className="btn btn-lg btn-success btn-block")
	private WebElement coursehome;
	
		
	public void clickcoursecatalog() {
		this.coursecatalog.click(); 
	}
	
	public void searchbox(String text) {
		this.searchbox.clear(); 
		this.searchbox.sendKeys(text); 
	}
	
	public void submitbutton() {
		this.submitbutton.click(); 
	}
	
	public void subscribe() {
		this.subscribe.click(); 
	}
	
	public void projectname() {
		this.projectname.click(); 
	}

	public void coursehome() {
		this.coursehome.click(); 
	}
	
	}
