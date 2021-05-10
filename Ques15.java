import java.util.Scanner;

class Ques15
{
		public static void main(String[] args){
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter First number :");
			int num1 = scan.nextInt();
			System.out.println("Enter Second number :");
			int num2 = scan.nextInt();
			System.out.println("number before swapping :"+num1+" "+num2);
			int temp;
			temp=num1;
			num1=num2;
			num2=temp;
			System.out.println("numbers after swapping :"+num1+" "+num2);
	}
	
}