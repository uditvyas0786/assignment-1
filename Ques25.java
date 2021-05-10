public class QuesS25
{  
   public static int octalToDecimal(int onum)
   {    
	
	int num = 0;    
	
	int p = 0;      
	while(true){    
	   if(onum == 0){    
		break;    
	   } else {    
		int temp = onum%10;    
		num += temp*Math.pow(8, p);    
		onum = onum/10;    
		p++;    
	   }    
	}    
	return num;    
   }    
   public static void main(String args[]){        
	System.out.println("Decimal equivalent of octal Number: "+octalToDecimal(10));       
   }
}