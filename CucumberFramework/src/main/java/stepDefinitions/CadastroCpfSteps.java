package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CadastroCpfSteps extends DriverFactory {
    
	
	@Given("^User navigates to tilix website$")
	public void user_navigates_to_tilix_website() throws Throwable {
		getDriver().get("https://qa-web.tilix.com.br/cadastro/etapa-1");
	}

	@Given("^User enters a valid email$")
	public void user_enters_a_valid_email() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		getDriver().findElement(By.id("email")).click();
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		getDriver().findElement(By.id("email")).sendKeys(RandomStringUtils.randomNumeric(10)+"@teste.com");

	   
	}

	@When("^User clicks on the experimentar gratis button$")
	public void user_clicks_on_the_experimentar_gratis_button() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		getDriver().findElement(By.xpath("//button[contains(.,'EXPERIMENTE GRÁTIS')]")).click();
	}

	@Then("^User should be taken to the successful to etapa (\\d+)$")
	public void user_should_be_taken_to_the_successful_to_etapa(int arg1) throws Throwable {
	   System.out.println("Deu certo");
	}
	
	@Then("^user enters a valid CPF$")
	public void user_enters_a_valid_CPF() throws Throwable {
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  // Thread.sleep(9000);
		getDriver().findElement(By.xpath("//*[@id='identifier']")).sendKeys("34147390200");
	}

	@Then("^user enters a valid State$")
	public void user_enters_a_valid_State() throws Throwable {
		
		getDriver().manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
		Select selectObject = new Select(driver.findElement(By.xpath("//select[@id='state']")));
		getDriver().manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
		selectObject.selectByValue("GO");
		System.out.println("Deu certo");
	}
    
	@Then("^user enters a valid birthday$")
	public void user_enters_a_valid_birthday() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getDriver().manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='birth_date']")).click();
		 getDriver().manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='birth_date']")).sendKeys("26/11/1971");
	}
	@When("^User clicks on the continuar cadastro button$")
	public void user_clicks_on_the_continuar_cadastro_button() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		getDriver().findElement(By.xpath("//button[contains(.,'CONTINUAR CADASTRO')]")).click(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
