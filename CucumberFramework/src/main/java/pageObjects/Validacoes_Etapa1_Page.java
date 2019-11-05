/**
 * 
 */
package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Igor Ferro
 *
 */
public class Validacoes_Etapa1_Page extends BasePage {
	 
	public @FindBy(id = "email") WebElement textfield_email;
	 public @FindBy(xpath = "//button[contains(.,'EXPERIMENTE GRÁTIS')]") WebElement btn_experimente_gratis;

	public Validacoes_Etapa1_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	  public FluxoCnpj_Page o_usuário_informa_o_e_mail_ausente_de_arroba()throws Exception {
		  getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).click();
			getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).sendKeys(RandomStringUtils.randomNumeric(10)+"teste.com");
			return new FluxoCnpj_Page();

}
}