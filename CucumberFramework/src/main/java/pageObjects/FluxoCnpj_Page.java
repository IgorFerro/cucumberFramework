package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FluxoCnpj_Page extends BasePage{
   public @FindBy(id = "email") WebElement textfield_email;
   public @FindBy(xpath = "//button[contains(.,'EXPERIMENTE GRÁTIS')]") WebElement btn_experimente_gratis;
   public @FindBy(xpath = "//input[@id='identifier']") WebElement textfield_cnpj;
   public @FindBy(xpath = "//select[@id='state']") WebElement combo_state;
   public @FindBy(xpath = "//button[contains(.,'CONTINUAR CADASTRO')]") WebElement btn_continuar_cadastro;
   public @FindBy(xpath = "//input[@id='name']") WebElement textfield_primeiro_nome;
   public @FindBy(xpath = "//input[@id='family_name']") WebElement textfield_ultimo_nome;
   public @FindBy(xpath = "//input[@id='phone_number']") WebElement textfield_numero_celular;
   public @FindBy(xpath = "//input[@id='landline_number']") WebElement textfield_numero_fixo;
   public @FindBy(xpath = "//input[@type='password']") WebElement textfield_senha;
   public @FindBy(xpath = "//input[@id='confirm_password']") WebElement textfield_confirmar_senha;
   public @FindBy(xpath = "//span") WebElement checkbox_termos;
   public @FindBy(xpath = "//button[@type='submit']") WebElement btn_finalizar_cadastro;
	public String data;


  public FluxoCnpj_Page() throws IOException {
		super();
		}
  
  public FluxoCnpj_Page user_navigates_to_tilix_website_pj()throws IOException {
		getDriver().get("https://qa-web.tilix.com.br/cadastro/etapa-1");
		return new FluxoCnpj_Page();
	}
  public FluxoCnpj_Page user_enters_a_valid_email_pj()throws Exception {
	  getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).click();
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(RandomStringUtils.randomNumeric(10)+"@teste.com");
		return new FluxoCnpj_Page();
	}
  public FluxoCnpj_Page user_clicks_on_the_experimentar_gratis_button_pj()throws Exception {
	    basePage.waitAndClickElement(btn_experimente_gratis);
	    return new FluxoCnpj_Page();
	}
  public FluxoCnpj_Page user_enters_a_valid_cnpj()throws Exception {
	  
	  //Thread.sleep(9000);
		getDriver().manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);

	  //driver.findElement(By.id("identifier")).click();
      //driver.findElement(By.id("identifier")).sendKeys("59.461.152/0001-34");
	 
		/*Lista de cnpj receita para teste
		 * 59.573.030/0001-30
		 * 61.155.248/0001-16
		 * 61.544.698/0001-09
		 * 33.311.713/0001-25
		 * 04.238.150/0001-99
		 * */
	  basePage.clickOnElementUsingCustomTimeout(textfield_cnpj, getDriver(), 60);
	  basePage.sendKeysToWebElement(textfield_cnpj, "61.532.644/0001-15"); 
	 
		return new FluxoCnpj_Page();
	}
  public FluxoCnpj_Page user_enters_a_valid_State_pj()throws Exception {
		getDriver().manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
		Select selectObject = new Select(driver.findElement(By.xpath("//select[@id='state']")));
		//Thread.sleep(6000);
		getDriver().manage().timeouts().pageLoadTimeout(180,TimeUnit.SECONDS);
		selectObject.selectByValue("GO");
		return new FluxoCnpj_Page();
	}
      public FluxoCnpj_Page user_clicks_on_the_continuar_cadastro_button_pj()throws Exception {
    	 /* getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
  		driver.findElement(By.xpath("//button[contains(.,'CONTINUAR CADASTRO')]")).click();
    	*/  
    	  basePage.clickOnElementUsingCustomTimeout(btn_continuar_cadastro, driver, 60);
          return new FluxoCnpj_Page();
  }
  
  public FluxoCnpj_Page user_enters_your_first_name()throws Exception {
	 /* getDriver().manage().timeouts().pageLoadTimeout(360,TimeUnit.SECONDS);
      driver.findElement(By.xpath("//input[@id='name']")).sendKeys(RandomStringUtils.randomAlphanumeric(10));*/
	  
	  basePage.sendKeysToWebElement(textfield_primeiro_nome, RandomStringUtils.randomAlphanumeric(10));
	  return new FluxoCnpj_Page();
  }
  
  public FluxoCnpj_Page user_enters_last_name()throws Exception {
	  /*getDriver().manage().timeouts().pageLoadTimeout(180,
				 TimeUnit.SECONDS);
				//Thread.sleep(9000);
				driver.findElement(By.xpath("//input[@id='family_name']")).sendKeys(RandomStringUtils.randomAlphanumeric(10));*/
	  
	  
	  basePage.sendKeysToWebElement(textfield_ultimo_nome, RandomStringUtils.randomAlphanumeric(10));
      return new FluxoCnpj_Page();
  }
  public FluxoCnpj_Page user_enters_cellphone()throws Exception {
	 /* getDriver().manage().timeouts().pageLoadTimeout(180,
				 TimeUnit.SECONDS);
				//Thread.sleep(9000);
				
				driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("6298"+RandomStringUtils.randomNumeric(8));*/
	  
	  basePage.sendKeysToWebElement(textfield_numero_celular, "6298"+RandomStringUtils.randomNumeric(8));

	  return new FluxoCnpj_Page();
  }
  public FluxoCnpj_Page user_enters_telephone_house()throws Exception {
	  
	 //Thread.sleep(9000);
	/* driver.findElement(By.xpath("//input[@id='landline_number']")).sendKeys("62"+ RandomStringUtils.randomNumeric(8));
	  */
	 // getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
	  basePage.clickOnElementUsingCustomTimeout(textfield_numero_fixo, getDriver(), 60);
	  basePage.sendKeysToWebElement(textfield_numero_fixo, "62"+ RandomStringUtils.randomNumeric(8));
      return new FluxoCnpj_Page();
  }
  public FluxoCnpj_Page user_enters_passowrd()throws Exception {
	  /*getDriver().manage().timeouts().pageLoadTimeout(180,
				 TimeUnit.SECONDS);
				//Thread.sleep(9000);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("62AF56T");*/
			    
	  basePage.sendKeysToWebElement(textfield_senha, RandomStringUtils.randomAlphanumeric(10));
	  data = driver.findElement(By.xpath("//input[@type='password']")).getAttribute("value");
      System.out.println(data);
      return new FluxoCnpj_Page();
  }
  public FluxoCnpj_Page user_enters_passowrd_confirmation()throws Exception {
	  /*getDriver().manage().timeouts().pageLoadTimeout(180,
				 TimeUnit.SECONDS);
				//Thread.sleep(9000);
				 driver.findElement(By.xpath("//input[@id='confirm_password']")).sendKeys(data);*/
	  
	  basePage.sendKeysToWebElement(textfield_confirmar_senha, data);
      return new FluxoCnpj_Page();
  }
  public FluxoCnpj_Page user_clicks_on_terms_of_use_check_box()throws Exception {
	  /*getDriver().manage().timeouts().pageLoadTimeout(180,
				 TimeUnit.SECONDS);
				//Thread.sleep(9000);
				driver.findElement(By.xpath("//span")).click();*/
	  
	  basePage.clickOnElementUsingCustomTimeout(checkbox_termos,getDriver(), 60);
	  return new FluxoCnpj_Page();
  }
  public FluxoCnpj_Page user_clicks_on_finalizar_cadastro_button()throws Exception {
	  /*getDriver().manage().timeouts().pageLoadTimeout(180,
				TimeUnit.SECONDS);
				//Thread.sleep(9000);
				driver.findElement(By.xpath("//button[@type='submit']")).click(); */
	  basePage.clickOnElementUsingCustomTimeout(btn_finalizar_cadastro,getDriver(), 60);

	  return new FluxoCnpj_Page();
  }
  public FluxoCnpj_Page user_should_be_taken_to_the_successful_to_nex_page()throws Exception {
	  
	  return new FluxoCnpj_Page();

 }
  }
