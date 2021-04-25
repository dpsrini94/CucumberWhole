package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@Given("click leads in the homepage on top")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@Given ("Click Create Lead")
	public void createleadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
			}
	
	@Given ("Enter the company name as {string}")
	public void cName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	
	@Given ("Enter the first name as {string}")
	public void fName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		
	}
	@Given("Enter teh second name as {string}")
	public void sName(String sname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(sname);
	}
	@When ("CreateLead is clicked and submitted")
	public void clicksubmit() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then ("Create Lead is created")
	public void verifyCLead() {
		System.out.println("The new lead is created");
	}
	

	}

