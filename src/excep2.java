import java.util.InputMismatchException;
import java.util.Scanner;

public class excep2
{
    public static void main(String args[])
    {
        int a=0,b =0,div=0;
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("ENTER VALUE OF A ");
            a=s.nextInt();
            System.out.println("ENTER VALUE OF B ");
            b=s.nextInt();
            div=a/b;
            System.out.println("DIVISION IS " +div);
        }catch(ArithmeticException e)
        {
            div=0;
            System.out.print("NOT BE IN DENOMINATOR");
        }
        catch(InputMismatchException e)
        {
            System.out.println("ENTER INTEGER");
        }
    }
}
