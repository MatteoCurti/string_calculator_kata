package kataStringCalculator;


public class StringCalculator {

	private static String delimit = ",|\n";
	
	public static int add(String string) {
		if (isEmpty(string))
			return 0;
		if (string.startsWith("//")) {
			String[] parts = string.split("\n");
			delimit = parts[0].substring(2);
			System.out.println(delimit);
			return split(parts[1]);
		}			
		else 
			return split(string);
	}
	
	private static boolean isEmpty(String string) {
		return string.isEmpty();
	}

	private static int toInt(String string) {
		return Integer.parseInt(string);
	}
	
	private static int split(String string) {
		String[] parts = string.split(delimit);
		int sum = 0;
		for (int index = 0 ; index < parts.length ; index++)
			sum += toInt(parts[index]);
		return sum;
	}
		
}
