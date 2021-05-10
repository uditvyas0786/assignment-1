import java.util.Scanner;

public class Ques7
{

public static void main(String[] args) 
{
 
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter a Number :");
	
		int num1 = scan.nextInt();
for(int i=1;i<=10;i++)
	{
		System.out.println("multiplication :"+(i*num1));
	}
}
}