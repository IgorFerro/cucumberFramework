package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CadastroCnpjSteps extends DriverFactory {
     
	public String data;
     
	@Given("^User navigates to tilix website pj$")
	public void user_navigates_to_tilix_website_pj() throws Throwable {
		fluxocnpjPage.user_navigates_to_tilix_website_pj();
	
	}

	@Given("^User enters a valid email pj$")
	public void user_enters_a_valid_email_pj() throws Throwable {
	    fluxocnpjPage.user_enters_a_valid_email_pj();
	}

	@When("^User clicks on the experimentar gratis button pj$")
	public void user_clicks_on_the_experimentar_gratis_button_pj() throws Throwable {
	    fluxocnpjPage.user_clicks_on_the_experimentar_gratis_button_pj();

	}

	@Then("^User should be taken to the successful to etapa pj (\\d+)$")
	public void user_should_be_taken_to_the_successful_to_etapa_pj(int arg1) throws Throwable {
		System.out.println("Deu certo");
	}

	@Then("^user enters a valid cnpj$")
	public void user_enters_a_valid_cnpj() throws Throwable {
	    fluxocnpjPage.user_enters_a_valid_cnpj();

	}

	@Then("^user enters a valid State pj$")
	public void user_enters_a_valid_State_pj() throws Throwable {
	    fluxocnpjPage.user_enters_a_valid_State_pj();

	}

	@When("^User clicks on the continuar cadastro button pj$")
	public void user_clicks_on_the_continuar_cadastro_button_pj() throws Throwable {
	    fluxocnpjPage.user_clicks_on_the_continuar_cadastro_button_pj();
	
	}
	@Then("^User enters  your first name$")
	public void user_enters_your_first_name() throws Throwable {
	    fluxocnpjPage.user_enters_your_first_name();

		
	}

	@Then("^User enters last name$")
	public void user_enters_last_name() throws Throwable {
	    fluxocnpjPage.user_enters_last_name();	
	}

	@Then("^User enters cellphone$")
	public void user_enters_cellphone() throws Throwable {
	    fluxocnpjPage.user_enters_cellphone();

		
	}

	@Then("^User enters telephone house$")
	public void user_enters_telephone_house() throws Throwable {
		fluxocnpjPage.user_enters_telephone_house();
}

	@Then("^User enters passowrd$")
	public void user_enters_passowrd() throws Throwable {
		fluxocnpjPage.user_enters_passowrd();

	}

	@Then("^User enters passowrd confirmation$")
	public void user_enters_passowrd_confirmation() throws Throwable {
		fluxocnpjPage.user_enters_passowrd_confirmation();	
	}

	@Then("^User clicks on terms of use check-box$")
	public void user_clicks_on_terms_of_use_check_box() throws Throwable {
		fluxocnpjPage.user_clicks_on_terms_of_use_check_box();	

	}
	
	@Then("^User clicks on finalizar cadastro button$")
	public void user_clicks_on_finalizar_cadastro_button() throws Throwable {
		fluxocnpjPage.user_clicks_on_finalizar_cadastro_button();	

	}
	@Then("^User should be taken to the successful to nex page$")
	public void user_should_be_taken_to_the_successful_to_nex_page() throws Throwable {
	   
		getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.xpath("//button[contains(.,'CONFIRMAR CÓDIGO')]"));
		Assert.assertTrue(confirmaCodigo.isDisplayed());
	}

	

}
