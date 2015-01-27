import java.util.Scanner;

public class P6_SumTwoNumbers {

	public static void main(String[] args) {
		Scanner inputNumbers = new Scanner(System.in);
		int firstNumber = inputNumbers.nextInt();
		int secondNumber = inputNumbers.nextInt();
		System.out.println(firstNumber + secondNumber);
		inputNumbers.close();
	}
}
