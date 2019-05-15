import java.io.*;
import java.util.*;
public class prog29
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        String s[]=new String[5];
        try
        {
            System.out.println("Enter the string:");
            for(int i=0;i<s.length;i++)
            {
                s[i]=in.readLine();
            }
        }catch(Exception e){}
        Arrays.sort(s);
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
}
