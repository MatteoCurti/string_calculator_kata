package kataStringCalculator;

public class StringCalculator {

	public static int add(String string) {
		if (string.isEmpty())
			return 0;
		else
			return Integer.parseInt(string);
	}
	
}
