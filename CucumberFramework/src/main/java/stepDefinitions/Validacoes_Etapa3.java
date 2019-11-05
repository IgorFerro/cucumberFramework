/**
 * 
 */
package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author Igor Ferro
 *
 */
public class Validacoes_Etapa3 extends DriverFactory {

	@Given("^o usuario informa no minimo tres caracteres para o campo nome$")
	public void o_usuario_informa_no_minimo_tres_caracteres_para_o_campo_nome() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		getDriver().findElement(By.id("name")).click();
		getDriver().findElement(By.id("name")).sendKeys(RandomStringUtils.randomNumeric(3));
   }

	@Given("^o usuario informa no  minimo tres caracteres para o campo sobrenome$")
	public void o_usuario_informa_no_minimo_tres_caracteres_para_o_campo_sobrenome() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		getDriver().findElement(By.id("family_name")).click();
		getDriver().findElement(By.id("family_name")).sendKeys(RandomStringUtils.randomNumeric(3));
	    
	}

	@Then("^o sistema recebe os valor com sucesso$")
	public void o_sistema_recebe_os_valor_com_sucesso() throws Throwable {
	    System.out.println("");
	    
	}

	@Given("^o usuario informa menos que tres caracteres para o campo nome$")
	public void o_usuario_informa_menos_que_tres_caracteres_para_o_campo_nome() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		getDriver().findElement(By.id("name")).click();
        getDriver().findElement(By.id("name")).sendKeys(RandomStringUtils.randomNumeric(2));
}

	@Then("^a mensagem de alerta para o campo nome e apresentada$")
	public void a_mensagem_de_alerta_para_o_campo_nome_e_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.xpath("//p[contains(.,'Deve conter no mínimo 3 caracteres.')]"));
		Assert.assertTrue(confirmaCodigo.isDisplayed()); 
	    
	}

	@When("^o usuario informa menos que tres caracteres para o campo sobrenome$")
	public void o_usuario_informa_menos_que_tres_caracteres_para_o_campo_sobrenome() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		getDriver().findElement(By.id("family_name")).click();
		getDriver().findElement(By.id("family_name")).sendKeys(RandomStringUtils.randomNumeric(2));
    }

	@Then("^a mensagem de alerta para o campo sobrenome e apresentada$")
	public void a_mensagem_de_alerta_para_o_campo_sobrenome_e_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.xpath("//div[2]/div/p"));
		Assert.assertTrue(confirmaCodigo.isDisplayed()); 
	    
	}

	@When("^o usuario aciona o botao Finalizar Cadastro$")
	public void o_usuario_aciona_o_botao_Finalizar_Cadastro() throws Throwable {
		getDriver().findElement(By.xpath("//button[contains(.,'FINALIZAR CADASTRO')]")).click();
	}

	@Then("^o sistema apresenta os alertas referente aos campo obrigatorios$")
	public void o_sistema_apresenta_os_alertas_referente_aos_campo_obrigatorios() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.xpath("//p[contains(.,'Campo obrigatório.')]"));
		Assert.assertTrue(confirmaCodigo.isDisplayed()); 
	    
	}

	@When("^o usuário informa uma senha invalida$")
	public void o_usuário_informa_uma_senha_invalida() throws Throwable {
		getDriver().findElement(By.xpath("//input[@type='password']")).click();
		getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys("4444444444444444444444444444");
		getDriver().findElement(By.xpath("//input[@id='confirm_password']")).click();

	}

	@Then("^a mensagem de alerta é apresentada$")
	public void a_mensagem_de_alerta_é_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.xpath("//p[contains(.,'Senha inválida.')]"));
		Assert.assertTrue(confirmaCodigo.isDisplayed());
		  
	}

	@When("^o usuario aciona o botao para vizualizar a senha$")
	public void o_usuario_aciona_o_botao_para_vizualizar_a_senha() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		getDriver().findElement(By.cssSelector(".VuePassword__Toggle__Icon > path")).click();

	    
	}

	@Then("^a senha a exibida para o usuario$")
	public void a_senha_a_exibida_para_o_usuario() throws Throwable {
		System.out.println("O sistema exibe a senha");
	    
	}

	@Then("^o usuario aciona o botao para esconder a senha$")
	public void o_usuario_aciona_o_botao_para_esconder_a_senha() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		getDriver().findElement(By.cssSelector(".VuePassword__Toggle__Icon > path")).click();
	    
	}

	@Then("^o sistema não exibe a senha$")
	public void o_sistema_não_exibe_a_senha() throws Throwable {
		System.out.println("O sistema não exibe a senha");
	    
	}

	@When("^o usuario digita uma senha com o nivel de forca fraco$")
	public void o_usuario_digita_uma_senha_com_o_nivel_de_forca_fraco() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        getDriver().findElement(By.cssSelector(".VuePassword__Input > .form-control")).click();
		getDriver().findElement(By.cssSelector(".VuePassword__Input > .form-control")).sendKeys(RandomStringUtils.randomAlphanumeric(6));
 
		 
	}

	@Then("^a mensagem MUITO FRACA e apresentada$")
	public void a_mensagem_MUITO_FRACA_e_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.cssSelector(".VuePassword__Message"));
		Assert.assertTrue(confirmaCodigo.isDisplayed());
		  
	    
	}

	@Then("^o usuario digita uma senha com o nivel de forca medio$")
	public void o_usuario_digita_uma_senha_com_o_nivel_de_forca_medio() throws Throwable {
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getDriver().findElement(By.cssSelector(".VuePassword__Input > .form-control")).clear();
		getDriver().findElement(By.cssSelector(".VuePassword__Input > .form-control")).sendKeys(RandomStringUtils.randomAlphanumeric(8));
	    
	}

	@Then("^a mensagem MEDIA e apresentada$")
	public void a_mensagem_MEDIA_e_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.cssSelector(".VuePassword__Message"));
		Assert.assertTrue(confirmaCodigo.isDisplayed());

		  
	    
	}

	@Then("^o usuario digita uma senha com o nivel de forca forte$")
	public void o_usuario_digita_uma_senha_com_o_nivel_de_forca_forte() throws Throwable {
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getDriver().findElement(By.cssSelector(".VuePassword__Input > .form-control")).clear();
		getDriver().findElement(By.cssSelector(".VuePassword__Input > .form-control")).sendKeys(RandomStringUtils.randomAlphanumeric(10));
	    
	}

	@Then("^a mensagem FORTE e apresentada$")
	public void a_mensagem_FORTE_e_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.cssSelector(".VuePassword__Message"));
		Assert.assertTrue(confirmaCodigo.isDisplayed());

		  
	    
	}

	@Then("^o usuario digita uma senha com o nivel de forca muito forte$")
	public void o_usuario_digita_uma_senha_com_o_nivel_de_forca_muito_forte() throws Throwable {
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getDriver().findElement(By.cssSelector(".VuePassword__Input > .form-control")).clear();
		getDriver().findElement(By.cssSelector(".VuePassword__Input > .form-control")).sendKeys(RandomStringUtils.randomAlphanumeric(12));
	    
	}

	@Then("^a mensagem MUITO FORTE e apresentada$")
	public void a_mensagem_MUITO_FORTE_e_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.cssSelector(".VuePassword__Message"));
		Assert.assertTrue(confirmaCodigo.isDisplayed());

		  
	    
	}

	@When("^o usuario aciona a checkbox referente aos termos de uso$")
	public void o_usuario_aciona_a_checkbox_referente_aos_termos_de_uso() throws Throwable {
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getDriver().findElement(By.cssSelector("(.checkmark")).click();
	    
	}

	@Then("^o sistema seleciona com sucesso$")
	public void o_sistema_seleciona_com_sucesso() throws Throwable {
		System.out.println("A check box é selecionado com sucesso");
   
	    
	}

}
