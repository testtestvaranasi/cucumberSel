package CucumberReport;

import java.awt.Robot;
import java.awt.event.InputEvent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumberReport {

	WebDriver driver = null; 
	Actions act;
	
	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable {
		driver = new ChromeDriver();	
		act = new Actions(driver);
		driver.manage().window().maximize();		
		driver.get("https://qa3dexp.nventco.com/3dpassport/login?service=https%3A%2F%2Fqa3dexp.nventco.com%2F3dspace%2Fcommon%2FemxNavigator.jsp");
	}

	@When("^I enter valid (.*),(.*) fields$")
	public void I_enter_valid_E_Plm_fields(String usernamevalues, String passwordvalues) throws Throwable {
		Thread.sleep(5000);
		String username = usernamevalues.replace("'", "");
		String password = passwordvalues.replace("'", "");
		driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//div[@class='commands']")).click();
		
		Thread.sleep(50000);
		 driver.findElement(By.xpath("//div[@class='add topbar-menu-item topbar-cmd fonticon fonticon-plus']")).click();
		 
		 /* new Actions(driver)
	        .moveToElement(
	                    driver.findElement(By
	                        .xpath("/html/body/div[24]/div[1]/div[1]/ul/li[5]/div[1]/span")))
	        .build().perform();    */
	     Thread.sleep(500); 
	        
	     Robot roboteng = new Robot();	     
	     roboteng.mouseMove(1700,365);
	     Thread.sleep(500);
	     
	     
	     Robot robotpart = new Robot();	     	
	     robotpart.mouseMove(1635,415);
	     Thread.sleep(500);
	     
	     
	     Robot robotcreatepart = new Robot();	
	     robotcreatepart.mouseMove(1500,415);
	   //Clicks Left mouse button
	     robotcreatepart.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
	     robotcreatepart.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	     System.out.println("Browse button clicked");
	     
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
	     /////////////////////////
	     
	     Thread.sleep(5000); 
		 WebElement Element = driver.findElement(By.xpath("/html/body/div[23]/iframe")); // To identify a frame i.e Frame1 we need to identify it by using either Id or Name properties.  
         // Here 'Element' variable holds Complete information about the frame such as Frame displayed / Exists ,Frame coordinates , etc.  
         driver.switchTo().frame(Element) ;    
	     
         Thread.sleep(5000);  
         
         Thread.sleep(5000);  
		 driver.findElement(By.name("TypeActualDisplay")).sendKeys("Battery and Accessory Part");
	     Thread.sleep(5000); 
	     Robot robotcreatepartorg = new Robot();	     
	     
	     robotcreatepartorg.mouseMove(1580,340);
	     
	     robotcreatepartorg.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
	     robotcreatepartorg.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	     System.out.println("Browse button clicked"); 
	     
	     Thread.sleep(10000); 
	     
	     
	     Select partFamily = new Select(driver.findElement(By.xpath("//*[@id=\"PartFamilyId\"]")));
	     partFamily.selectByVisibleText("Batteries");	    
	     
		 driver.findElement(By.id("VPMProductName1")).sendKeys("Test Data sel"); 
		
		 Thread.sleep(500);  
			//driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/a/button")).click(); 
		 driver.findElement(By.xpath("//*[contains(@class, \"btn-primary\")]")).click();
	}

	@Given("^I have already accessed to create part page$")
	public void I_have_already_accessed_to_create_part_page() throws Throwable {
		
	}

	@When("^I enter valid '<type>','<partfamily>' values$")
	public void I_enter_valid_type_partfamily_fields() throws Throwable {
		
	}

	@When("^I clicked on Save button$")
	public void I_clicked_on_Save_button() throws Throwable {
		
	}

	@Then("^I created a part successfully$")
	public void I_created_a_part_successfully() throws Throwable {
	   
	}

	@Given("^I close a browser$")
	public void I_close_a_browser() throws Throwable {
	  // driver.close();
	}


	

	
}
