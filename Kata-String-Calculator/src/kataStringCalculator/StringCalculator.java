package kataStringCalculator;

public class StringCalculator {

	public static int add(String string) {
		if (isEmpty(string))
			return 0;
		else
			return toInt(string);
	}
	
	private static boolean isEmpty(String string) {
		return string.isEmpty();
	}

	private static int toInt(String string) {
		return Integer.parseInt(string);
	}
}
