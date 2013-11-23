package views.formdata;

import java.util.HashMap;
import java.util.Map;

public class TelephoneTypes {

	private static String[] types = { "Home", "work", "Mobile" };

	public static Map<String, Boolean> getTypes() {

		Map<String, Boolean> typeMap = new HashMap<>();
		for (String type : types) {
			typeMap.put(type, false);
		}
		return typeMap;

	}

	public static Map<String, Boolean> getTypes(String telType) {

		Map<String, Boolean> typeMap = getTypes();
		
		 
		if (isType(telType)) {
			typeMap.put(telType, true);
		} 
		return typeMap;

	}

	public static boolean isType(String telType) {

		return TelephoneTypes.getTypes().keySet().contains(telType);
	}
}
