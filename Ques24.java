import java.util.Scanner; 
import java.lang.Math;
class Ques24
{
  public static void main(String[] args){
   int index=0;
   int i=2,decimal_num = 0;
   int reminder=0;
   int j=0,z=0;
   int arr[] = new int[20];
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter number");
      
   int num = scan.nextInt();
     
     while(num>0)
     {
      reminder = (int) (num%10);
      num /=10;
      decimal_num= decimal_num+(int) (reminder*(Math.pow(i,j++)));
     
     }
    
     System.out.println("Decimal number is "+decimal_num);
     while(decimal_num>0)
     {
      arr[z] = decimal_num%8;
      decimal_num /= 8;
      z++;
     }
     for(int k=z-1;z>=0;z--)
     System.out.print(arr[z]);
	
 }
	
}