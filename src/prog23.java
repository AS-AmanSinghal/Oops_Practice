import java.io.*;
public class prog23
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        int a[]=new int[10];
        int i=0,c=0,n=0;
        try
        {
            System.out.println("Enter a digit");
            n=Integer.parseInt(in.readLine());
        }catch(Exception e){}
        for(i=0;i<10;i++)
        {
            a[i]=0;
        }
        while(n>0)
        {
            int r=n%10;
            a[r]++;
            n=n/10;
        }
        for(i=0;i<10;i++)
        {
            if(a[i]==1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
