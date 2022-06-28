package ProperySetup;

import java.io.FileInputStream;
import java.util.Properties;

public class PropReader {

	private static PropReader instance = null;
	Properties prop = null;

	private PropReader() throws Exception {
		
		prop = new Properties();

		String FilePath = System.getProperty("user.dir").concat("/src/main/resources/ProjectProperties.properties");

		prop.load(new FileInputStream(FilePath));

	}

	public static PropReader getInstance() throws Exception {

		if (instance == null) {

			return new PropReader();
		}

		return instance;
	}
	
	public String getProperty( String PropKey) {
		return prop.getProperty(PropKey);
	}

}
