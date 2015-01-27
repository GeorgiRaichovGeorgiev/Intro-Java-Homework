
public class P10_ChangeOfValues {

	public static void main(String[] args) {
		int firstNum = 5;
		int secondNum = 10;
		secondNum -= firstNum;
		firstNum += secondNum;
		System.out.println("First number: " + firstNum + " (transformed)" + "\nSecond number: " + secondNum + " (transformed)");
	}

}
