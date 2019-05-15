import javax.xml.crypto.Data;
import java.io.*;
public class prog17
{
    public static void main(String args[])
    {
      int a[]=new int[50];
        DataInputStream in=new DataInputStream(System.in);
        int n=0,c=0,s=0;
        try
        {
            System.out.println("Enter the number of students");
            n=Integer.parseInt(in.readLine());
            System.out.println("Enter the number of candies");
            c=Integer.parseInt(in.readLine());
            for(int i=1;i<n;i++)
            {
                a[i]=Integer.parseInt(in.readLine());
            }
        }catch(Exception e){}
        for (int i=0;i<n;i++)
        {
            s=s+a[i];
        }
        if(c>=s)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
