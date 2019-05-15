import java.util.Scanner;

public class prog19
{
    public static void main(String args[])
    {
        int a,b,temp;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        for(int i=1;;i++)
        {
            int r=a%b;
            b=b/a;
            if(r==0)
            {
                System.out.println(b);
                break;
            }
            else
            {
                temp=a;
                a=r;
                b=temp;
            }
        }
    }
}
