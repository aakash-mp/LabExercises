class csum
{
    int num,flag=0,currentDigit;
    void checkNumber()
    {
        currentDigit = num % 10;
       num = num/10;
       while(num>0)
       {
           if(currentDigit <= num % 10)
           {
               flag = 1;
               break;
           }
           currentDigit = num % 10;
           num = num/10;
       }
       if(flag==1)
       {
       System.out.println("not an increasing no.");
       }
       else if(flag==0)
       {
        System.out.println(" increasing no.");
       }

        
    }
}
public class ex7
{
	public static void main(String[] args) {
csum obj = new csum();
obj.num =12345 ;	
obj.checkNumber();
	}
}
