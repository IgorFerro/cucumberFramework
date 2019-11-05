/**
 * 
 */
package utils;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author Igor Ferro Responsável por ler o config file
 */
public class ReadConfigFile {
	protected InputStream input = null;
	protected Properties prop = null;

	public ReadConfigFile() {

		try {
			ReadConfigFile.class.getClassLoader().getResourceAsStream(Constant.CONFING_PROPERTIES_DIRECTORY);
			prop = new Properties();
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
     //Checar qual o tipo de browser é
	public String getBrowser() {
		if (prop.getProperty("browser") == null)
			return "";
		return prop.getProperty("browser");
	}

}
