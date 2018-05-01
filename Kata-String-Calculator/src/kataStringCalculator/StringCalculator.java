package kataStringCalculator;

public class StringCalculator {

	private static String delimit = ",";
	
	public static int add(String string) {
		if (isEmpty(string))
			return 0;
		if (string.contains(delimit)) {
			return split(string);
		}
		else 
			return toInt(string);
	}
	
	private static boolean isEmpty(String string) {
		return string.isEmpty();
	}

	private static int toInt(String string) {
		return Integer.parseInt(string);
	}
	
	private static int split(String string) {
		String[] parts = string.split(delimit);
		return toInt(parts[0]) + toInt(parts[1]);
	}
	
	
}
