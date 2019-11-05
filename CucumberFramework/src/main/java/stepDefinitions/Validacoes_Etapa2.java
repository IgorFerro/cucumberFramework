/**
 * 
 */
package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author Igor Ferro
 *
 */
public class Validacoes_Etapa2 extends DriverFactory {

	

		@Given("^User navigates to tilix website for validate second step$")
		public void user_navigates_to_tilix_website_for_validate_second_step() throws Throwable {
			fluxocnpjPage.user_navigates_to_tilix_website_pj();
		}

		@Given("^User enters a valid email for validate second step$")
		public void user_enters_a_valid_email_for_validate_second_step() throws Throwable {
			fluxocnpjPage.user_enters_a_valid_email_pj();
		}

		@When("^User clicks on the experimentar gratis button for validate second step$")
		public void user_clicks_on_the_experimentar_gratis_button_for_validate_second_step() throws Throwable {
		    fluxocnpjPage.user_clicks_on_the_experimentar_gratis_button_pj();
 
		}
	
	@Given("^o usuário informa um cnpj invalido$")
	public void o_usuário_informa_um_cnpj_invalido() throws Throwable {
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		getDriver().findElement(By.xpath("//*[@id='identifier']")).click();
		getDriver().findElement(By.xpath("//*[@id='identifier']")).sendKeys("33.333.333/3333-33");
	}

	@Then("^a mensagem CNPJ/CPF inválido e apresentada$")
	public void a_mensagem_CNPJ_CPF_inválido_e_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.cssSelector(".col-md-6:nth-child(1) .text-danger"));
		Assert.assertTrue(confirmaCodigo.isDisplayed());   
	}

	@Given("^o usuário um CNPJ válido na receita federal$")
	public void o_usuário_um_CNPJ_válido_na_receita_federal() throws Throwable {
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		getDriver().findElement(By.xpath("//*[@id='identifier']")).sendKeys("62.291.208/0001-64");
	}
	
	@And("^seleciona a UF da empresa$")
	public void seleciona_a_UF_da_empresa() throws Throwable {
		fluxocnpjPage.user_enters_a_valid_State_pj(); 
	}

	@And("^aciona o botão CONTINUAR CADASTRO$")
	public void aciona_o_botão_CONTINUAR_CADASTRO() throws Throwable {
	    fluxocnpjPage.user_clicks_on_the_continuar_cadastro_button_pj();

	}

	@Then("^a próxima etapa é apresentada$")
	public void a_próxima_etapa_é_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.xpath("//button[contains(.,'FINALIZAR CADASTRO')]"));
		Assert.assertTrue(confirmaCodigo.isDisplayed());   
		}
	
	@Given("^o usuário informa um cpf invalido$")
	public void o_usuário_informa_um_cpf_invalido() throws Throwable {
		getDriver().findElement(By.xpath("//*[@id='identifier']")).click();
		getDriver().findElement(By.xpath("//*[@id='identifier']")).sendKeys("00222211199");
	}
	
	@Given("^o usuário um cpf válido na receita federal$")
	public void o_usuário_um_cpf_válido_na_receita_federal() throws Throwable {
		getDriver().findElement(By.xpath("//*[@id='identifier']")).click();
		getDriver().findElement(By.xpath("//*[@id='identifier']")).sendKeys("508.017.912-00");
	}

	@Given("^o usuario seleciona a UF da empresa$")
	public void o_usuario_seleciona_a_UF_da_empresa() throws Throwable {
		fluxocnpjPage.user_enters_a_valid_State_pj(); 
	}

	@Then("^o campo data de nascimento é apresentado$")
	public void o_campo_data_de_nascimento_é_apresentado() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='birth_date']")).click();
		 getDriver().manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='birth_date']")).sendKeys("13/11/1983");
	}

	@Then("^o usuario aciona o botão CONTINUAR CADASTRO$")
	public void o_usuario_aciona_o_botão_CONTINUAR_CADASTRO() throws Throwable {
	    fluxocnpjPage.user_clicks_on_the_continuar_cadastro_button_pj();
  
	}

	@Then("^a proxima etapa é apresentada$")
	public void a_proxima_etapa_é_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.xpath("//button[contains(.,'FINALIZAR CADASTRO')]"));
		Assert.assertTrue(confirmaCodigo.isDisplayed());   
		}   
	

@Given("^o usuário informa um cnpj já cadastrado$")
public void o_usuário_informa_um_cnpj_já_cadastrado() throws Throwable {
	getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	getDriver().findElement(By.xpath("//*[@id='identifier']")).sendKeys("43.425.008/0001-02");
}

@Then("^a mensagem CNPJ/CPF ja cadastrado e apresentada$")
public void a_mensagem_CNPJ_CPF_ja_cadastrado_e_apresentada() throws Throwable {
	getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	WebElement confirmaCodigo = driver.findElement(By.cssSelector(" .alert"));
	Assert.assertTrue(confirmaCodigo.isDisplayed());   
}

@When("^o usuário aciona o botão CONTINUAR CADASTRO$")
public void o_usuário_aciona_o_botão_CONTINUAR_CADASTRO() throws Throwable {
	fluxocnpjPage.user_clicks_on_the_continuar_cadastro_button_pj();
}

@Then("^a mensagem Campo obrigatório é apresentada$")
public void a_mensagem_Campo_obrigatório_é_apresentada() throws Throwable {
	getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	WebElement confirmaCodigo = driver.findElement(By.cssSelector(".col-md-6:nth-child(2) .text-danger"));
	Assert.assertTrue(confirmaCodigo.isDisplayed());  
}
	
}
	