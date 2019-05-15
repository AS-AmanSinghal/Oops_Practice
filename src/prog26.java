import java.util.Scanner;

import static java.lang.System.in;

public class prog26
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        if(a.equalsIgnoreCase("admin")&&b.equalsIgnoreCase("gla"))
            System.out.println("You are an authorized user");
        else
            System.out.println("You are not an authorized user");
    }
}
