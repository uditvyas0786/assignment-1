import java.util.Scanner;

class Ques20
{
	public static void main(String args[])
	{
		char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int rem,num;
		String sum="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Decimal no.");
        num=sc.nextInt();
        System.out.println("Hexadecimal number is : ");
        while(num != 0)
        {
	rem=num%16;
	sum= ch[rem] + sum;
               num= num/16;
        }   
       System.out.print(sum);   
    }