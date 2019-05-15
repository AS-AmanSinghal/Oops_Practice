import java.util.*;
import java.math.*;
class prog24
{
    public static void main(String args[])
    {
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            if((int)Math.pow((int)Math.sqrt(i*i*i),2)==(i*i*i))
                System.out.println(i*i*i);
        }
    }
}