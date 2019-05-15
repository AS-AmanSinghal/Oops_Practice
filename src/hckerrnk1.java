import java.util.*;
public class hckerrnk1
{
    public static void main(String args[])
    {
        String a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextLine();
        b=s.nextLine();
        int sum=a.length()+b.length();
        if(a.compareTo(a)>=0)
            System.out.println("Yes");
        else
            System.out.println("NO");
        System.out.print(a.substring(0,1).toUpperCase()+a.substring(1,a.length())+" "+b.substring(0,1).toUpperCase()+b.substring(1,b.length()));
    }
}
