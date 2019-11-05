/**
 * 
 */
package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

/**
 * @author Igor Ferro
 *Responsável por extender diverFactory
 */
public class MasterHooks extends DriverFactory {

	@Before
	public void setup(){
		driver = getDriver();
	}
	
	@After
	public void tearDown() throws InterruptedException{
		if(driver !=null){
			driver.manage().deleteAllCookies();
			Thread.sleep(5000);
			driver.close();
			driver = null;
		}
		
	}
}
