package commonutility;

import java.util.HashMap;
import java.util.Map;

public class CommonPage {

	static Map <String, String> testDataMap = new HashMap<String, String>();
	//testDataMap = new Map<String, String>();
public static void loadXMLParameterToTestData(String key, String value) {
	
	testDataMap.put(key, value);
}

public static String  getTestData(String key) {
	
return testDataMap.get(key);
	}

}