package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Editlead extends BaseClass{

	@Given ("Click Find Lead")
	public void fLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Given ("Click Phone number")
	public void clickPhoneNum() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Given ("phonenumber as {string}")
	public void PhoneNum(String phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	}
	
	@Given ("Click find Lead")
	public void clickFindLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@Given ("Get the first Lead I'd value")
	public void valOfFirstLead() {
		WebElement idText = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td"));
		String leadid = idText.getText();
		System.out.println("The First I'd displayed is"+leadid);
	}
	
	@Given ("click the first lead in the result")
	public void selectFirstLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@When ("click edit")
	public void Edit() {
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Given ("companyName {string}")
	public void clickComName(String comName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(comName);
	}
	
	@Given ("click update")
		public void clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
				}
	
	@Then ("Edited lead is displayed")
		public void checkdisplayed() {
			System.out.println("The lead is edited");
}
}