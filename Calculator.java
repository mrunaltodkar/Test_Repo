public class Calculator{
	public static void main(String [] args){
		System.out.println("Hello World!!!");
		System.out.println("calculator java program");
	}
	public static void addition(int number1, int number2){
		System.out.println("Addition = " + (number1 + number2));
	}
	public static void division(int number1, int number2){
	   if(number2 == 0)
		System.out.println("Division should not be 0");
	   else
		System.out.println("Division = " + (number1 / number2));
	}
}