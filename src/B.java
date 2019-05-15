import java.util.*;
public class B
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int val=sc.nextInt();
        System.out.println(method(val));
    }
    static long method(int n)
    {
        long f=1;
        while(n>0)
        {
            f=f*n;
            n--;
        }
        return f;
    }
}
