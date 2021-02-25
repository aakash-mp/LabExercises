class csum
{
   // Scanner s= new Scanner(System.in);

    int n;
    void calculateDifference ()
    {
       int i,sum=0,temp,c=0,temp2;
       for(i=1;i<=n;i++)
       {
           sum=sum+(i*i);
           c=c+i;
       }
      temp=c*c;
       temp2=sum-temp;
       System.out.println(temp2);;
        
    }
}
public class ex6
{
	public static void main(String[] args) {
//Scanner s= new Scanner(System.in);

csum obj = new csum();
//obj.n=s.nextInt();
obj.n = 5;	
obj.calculateDifference();
	}
}
