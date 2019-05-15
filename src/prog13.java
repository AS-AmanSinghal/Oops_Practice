import java.util.Scanner;

public class prog13
{
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number:");
        int no=n.nextInt();
        int no1=no;
        int s=0;
        while(no>0)
        {
           int r=no%10;
           s=s+r;
           no=no/10;
        }
        System.out.println("The sum of digits of number "+ no1 +" is:"+s);
    }
}
