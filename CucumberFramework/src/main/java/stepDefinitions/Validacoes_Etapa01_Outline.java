/**
 * 
 */
package stepDefinitions;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author Igor Ferro Parreira
 *
 */
public class Validacoes_Etapa01_Outline extends DriverFactory {
  
	@Given("^o usuario acessa a \"([^\"]*)\"$")
	public void o_usuario_acessa_a(String url) throws Throwable {
		driver.get(url);  //https://qa-web.tilix.com.br/cadastro/etapa-1
	}

	@Given("^não informa \"([^\"]*)\"$")
	public void não_informa(String valor) throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        System.out.println(valor);
		driver.findElement(By.id("email")).sendKeys(valor);
	}

	@When("^o usuário aciona o botão EXPERIMENTAR GRATIS$")
	public void o_usuário_aciona_o_botão_EXPERIMENTAR_GRATIS() throws Throwable {
    getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    fluxocnpjPage.user_clicks_on_the_experimentar_gratis_button_pj();
    }

	@Then("^a mensagem de alerta e apresentada$")
	public void a_mensagem_de_alerta_e_apresentada() throws Throwable {
		getDriver().manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebElement confirmaCodigo = driver.findElement(By.cssSelector(".text-danger"));
		Assert.assertTrue(confirmaCodigo.isDisplayed());   
	}

}
