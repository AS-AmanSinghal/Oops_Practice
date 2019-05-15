import java.util.Scanner;

public class prog20
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int a,b,count=0;
        a=s.nextInt();
        b=a;
        for(int i=0;;i++)
        {
            if(a%2==0)
            {
                count++;
                a=a/2;
            }
            else
            {
                break;
            }
        }
        System.out.print(count);
    }
}
