import javax.xml.crypto.Data;
import java.io.*;
public class prog7c
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        int n=0,i=0;
        try
        {
            System.out.println("Enter the range:");
            n=Integer.parseInt(in.readLine());
        }catch(Exception e){}
        for(i=4;i<=n;i=i*2)
        {
            System.out.println(" "+i);
        }
    }
}
