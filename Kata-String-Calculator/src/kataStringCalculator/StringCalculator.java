package kataStringCalculator;


public class StringCalculator {

	private static String delimit;
	
	public static int add(String string) {
		delimit = ",|\n";
		if (isEmpty(string))
			return 0;
		else
			return parse(string);
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
		for (int index = 0 ; index < parts.length ; index++) {
			System.out.println(toInt(parts[index]));
			if (toInt(parts[index]) < 1000) 
				sum += toInt(parts[index]);
		}	
		System.out.println(sum);
		return sum;
	}
	
	private static int parse(String string) {
		if (string.startsWith("//")) {
			String[] parts = string.split("\n");
			delimit = parts[0].substring(2);
			return split(parts[1]);
		}			
		else 
			return split(string);
	}
		
}
