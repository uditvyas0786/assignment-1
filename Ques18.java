Simport java.util.*;
class Ques18
{
 public static void main (String args[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter first Binary Number:");
  String a=sc.next();
  System.out.print("Enter second Binary Number:");
  String b=sc.next();
  
  int num1=Integer.parseInt(a, 2);
  int num2=Integer.parseInt(b, 2);
  int mul=num1*num2;
  System.out.println("num1 ="+Integer.toBinaryString(num1));
  System.out.println("num2 ="+Integer.toBinaryString(num2));
  System.out.println("Multiplication of 2 Binary Number ="+Integer.toBinaryString(mul));
 }
}