class csum
{
   // Scanner s= new Scanner(System.in);

    int n;
    void calculateSum ()
    {
       int i,sum=0;
       for(i=1;i<=n;i++)
       {
           if(i%3==0 || i%5==0)
           {
               sum=sum+i;
           }
       }
       System.out.println(sum);;
        
    }
}
public class ex5
{
	public static void main(String[] args) {


csum obj = new csum();
//obj.n=s.nextInt();
obj.n = 10;	
obj.calculateSum();
	}
}
