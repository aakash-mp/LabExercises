import java.io.*;
class csum
{
    int n;
      boolean checkNumber()
    {
    
        if (n == 0)
            return false;
         
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
}
public class ex8
{
	public static void main(String[] args) {
csum obj = new csum();
obj.n =12345 ;	

 if (obj.checkNumber())
            System.out.println("Yes");
        else
            System.out.println("No");
	}
}
