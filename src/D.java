import java.util.*;
public class D
{
    static int method(int a,int b)
    {
        if(a==0||b==0)
            return 0;
        if(a==b)
            return a;
        if(a>b)
            return method(a-b,b);
        return method(a,b-a);
    }
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Result of "+ a +" and "+ b +" is "+method(a,b));
    }
}
