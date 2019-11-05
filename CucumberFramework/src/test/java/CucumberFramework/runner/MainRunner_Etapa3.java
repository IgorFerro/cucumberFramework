package CucumberFramework.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		//Localização das Features
		features = {"src/test/java/CucumberFramework/featureFiles/Validacoes_Etapa3.feature"},
		
		//localização dos Steps
		glue = {"stepDefinitions"},
		
		//altera output
		monochrome = true,
		
		//executa sem o sellenium caso true
		dryRun = false,
		
		tags = {},
		
		// Permite gera relatórios
		plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class MainRunner_Etapa3 {
}
