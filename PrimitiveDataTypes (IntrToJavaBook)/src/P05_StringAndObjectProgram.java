
public class P05_StringAndObjectProgram {

	public static void main(String[] args) {
		String firstPart = "Hello";
		String secondPart = "World";
		Object concatenation = firstPart + secondPart;
		System.out.println(concatenation);
		String declaration = (String)concatenation;
	}

}
