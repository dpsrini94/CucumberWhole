package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
	String text;
	@Given("Phonenumber is clicked")
	public void selectPhoneNum() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Given("phonenumber as {string}")
	public void phonenumber(String num) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(num);
	}
	
	@Given("Click FindLead")
	public void selectFindLead3() throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
	}
	
	@Given("find first Lead I'd value")
	public void valueId() {
		//WebElement idText = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td"));
		text = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td")).getText();
		//String leadid = idText.getText();
		System.out.println("The First I'd displayed is"+" "+text);
	}
	
	@Given("first lead in the result is clicked")
	public void deletetLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
		
	@When("Click the delete lead")
	public void clickDelete() {
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@Given("Click Find Lead1")
	public void selectFindLead1() {
		driver.findElement(By.linkText("Find Leads")).click();

	}
	
	@Given("Enter the LeadId in field leadid")
	public void enterleadId() {
		driver.findElement(By.name("id")).sendKeys(text);

	}
	
	@Given("Click find lead")
	public void selectFindLead2() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	
	@Given("Verify lead match found or not")
	public void verifyMatch() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

	}
	
	@Then ("Delete Lead is done")
	public void deleteDone() {
		System.out.println("Delete Lead operation is executed successfully");

	}
}
