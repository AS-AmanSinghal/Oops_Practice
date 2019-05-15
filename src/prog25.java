import java.util.*;
public class prog25
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a,b;
        System.out.println("Enter first string");
        a=s.nextLine();
        System.out.println("Enter second string");
        b=s.nextLine();
        if(a.equalsIgnoreCase(b))
            System.out.println("Strings are same");
        else
            System.out.println("Strings are not same");
    }
}
