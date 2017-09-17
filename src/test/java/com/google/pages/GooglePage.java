package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.utility.Driver;

public class GooglePage {

	private WebDriver driver;
	
	public GooglePage(){
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(id="source")
	public WebElement sourceLangField;
	
	
	@FindBy(id="gt-res-dir-ctr")
	public WebElement targetLangField;
	
	
	@FindBy(xpath="//div[.='English']")
	public WebElement english;
	
	@FindBy(xpath="//div[@id='gt-tl-gms']")
	public WebElement translationLanIcon;
	
	@FindBy(xpath="//div[@id='gt-sl-gms']")
	public WebElement translationFromLanIcon;
	
	@FindBy(id="gt-submit")
	public WebElement translatebtn;
	
	
}
