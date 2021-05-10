import java.util.Scanner;

public class Ques6
{

public static void main(String[] args) 
{
 
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter a First Number :");
	
		int num1 = scan.nextInt();
	
		System.out.println("Enter a Second Number :");
	
		int num2 = scan.nextInt();
	
		System.out.println("addition of these two number : "+(num1+num2));
		System.out.println("Substraction of these two number : "+(num1-num2));
		System.out.println("Multiplication of these two number : "+(num1*num2));
		System.out.println("Division of these two number : "+(num1/num2));
		System.out.println("Reminder of these two number : "+(num1%num2));
	}
}