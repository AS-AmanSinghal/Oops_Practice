import java.io.*;
public class prog15
{
    public static void main(String  args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        int amt=0,h=0,t=0,f=0;
        try
        {
            System.out.println("Enter the amount you want:");
            amt=Integer.parseInt(in.readLine());
        }catch(Exception e){}
        if(amt%100==0)
        {
            while (amt > 0) {
                if (amt % 2000 == 0)
                {
                    t++;
                    amt = amt - 2000;
                } else {
                    if (amt % 500 == 0)
                    {
                        f++;
                        amt = amt - 500;
                    }
                    else
                        {
                        h++;
                        amt = amt - 100;
                    }
                }
            }
        }
        else
        {
            System.out.println("Entered amount cannot be dispatched");
        }
        System.out.println("Number of 2000 rupees note:"+t);
        System.out.println("Number of 500 rupees note:"+f);
        System.out.println("Number of 100 rupees note:"+h);
    }
}
