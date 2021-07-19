package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class definition {
	
	//io.cucumber.junit.UndefinedStepException: The step "Login Page" is undefined. You can implement it using the snippet(s) below:
		WebDriver driver;
		@Given("Login Page")
		public void login_page() 
		{
		    // Write code here that turns the phrase above into concrete actions
		   
		    
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\LintoThomas\\Desktop\\Linto Archive W10\\Automation\\chromedriver.exe");
			  //create a new instance of chrome driver
			  driver = new ChromeDriver();
			  
			 //need to be in Login Page
			  driver.get("https://opensource-demo.orangehrmlive.com/");
			  
		}


		//Some other steps were also undefined:

		@When("Enter a Valid user name {string}")
		public void enter_a_valid_user_name(String name) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("txtUsername")).sendKeys(name);
		}
		@When("Enter a Valid password {string}")
		public void enter_a_valid_password(String pwd) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		}
		@When("Click on submit button")
		public void click_on_submit_button() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("btnLogin")).click();
		}
		@Then("Login is Successful and see user name as {string}")
		public void login_is_successful_and_see_user_name_as(String LoginName) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			String Actual = driver.findElement(By.id("welcome")).getText();
		    String Expected = LoginName;
		       Assert.assertEquals(Expected, Actual);
		       //i will logout
		       driver.findElement(By.id("welcome")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
		       System.out.println("I am Succesfull logout");
		       Thread.sleep(3000);
		       
		       driver.quit(); 
		}




}
