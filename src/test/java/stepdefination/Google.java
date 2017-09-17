package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.pages.GooglePage;
import com.google.utility.Config;
import com.google.utility.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Google {
	private WebDriver driver;
	
	GooglePage googlePage=new GooglePage();
	
	@Given("^On Google translate page$")
	public void on_Google_translate_page() throws Throwable {
		System.out.println("Navigating to Google Translate page");
		driver=Driver.getDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Config.getProperty("url"));
//		driver.get(Config.getProperty("url"));
//		Assert.assertTrue(driver.getTitle().equals("Google Translate"));

		
		
		
	}

	@When("^I choose source language$")
	public void i_choose_source_language() throws Throwable {
		System.out.println("Selecting from Turkish");
		googlePage.translationFromLanIcon.click();
		
		
		String langFrom=Config.getProperty("fromLanguage");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='"+ langFrom +"']")));
		element.click();
		//driver.findElement(By.xpath("//div[.='"+ langFrom +"']")).click();;
		
	}

	@When("^I choose target language$")
	public void i_choose_target_language() throws Throwable {
		System.out.println("Selecting Zulu language from list");
		googlePage.translationLanIcon.click();
		
		String lan=Config.getProperty("toLanguage");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement element2=wait.until(ExpectedConditions.
		visibilityOfElementLocated(By.xpath("//div[.='"+ lan +"']")));
		element2.click();
		//driver.findElement(By.xpath("//div[.='"+ lan +"']")).click();
	}

	@When("^I type a word into source field$")
	public void i_type_a_word_into_source_field() throws Throwable {
		googlePage.sourceLangField.sendKeys("okul");
		
		
	}

	@When("^I click on translate$")
	public void i_click_on_translate() throws Throwable {
	googlePage.translatebtn.click();
		
		
	}

	@Then("^Translation is displayed$")
	public void translation_is_displayed() throws Throwable {
	
		
		
	}

}
