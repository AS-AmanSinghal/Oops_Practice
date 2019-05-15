import java.io.*;
public class prog7b
{
    public static void main(String args[]) {
        DataInputStream in = new DataInputStream(System.in);
        int i=0,n=0,a=48,b=43;
        try
        {
            System.out.println("Enter the range:");
            n = Integer.parseInt(in.readLine());
        } catch (Exception e) {}
        for (i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(" "+a);
                a=a-10;
            }
            else
            {
                System.out.println(" "+b);
                b=b-10;
            }
        }
    }
}
