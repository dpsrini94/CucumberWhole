package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	
	@Given("Enter username as DemoSalesManager")
	public void uname() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
		
	@Given("Enter password as crmsfa")
	public void pwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	@When("Login button is clicked")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Home page is displayed")
	public void hTitle() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
	}
	
	@When("crmsfa link is clicked")
	public void crmsfaLink() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Then("Main page is diplayed")
	public void mTitle()  {
	
		String title = driver.getTitle();
		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println(title);	
		}
		
	}
}
