import java.util.*;

public class excep
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        int n;
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        n=s.nextInt();
        System.out.println("ENTER ELEMENT");

        try{
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
        }
        catch(Exception e)
        {
            n=5;
            System.out.println("ONLY 5 ELEMNET ACCEPTED");
        }


        System.out.println("YOU HAVE ENTERED");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
