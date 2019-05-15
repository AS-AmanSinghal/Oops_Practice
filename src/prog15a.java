import java.io.*;
public class prog15a
{
    public static void main(String  args[]) {
        DataInputStream in = new DataInputStream(System.in);
        int amt = 0, h=0, h2=0, h5=0;
        try {
            System.out.println("Enter the amount you want:");
            amt = Integer.parseInt(in.readLine());
        } catch (Exception e) {}
        if(amt%100==0) {
            h2 = amt / 2000;
            amt = amt - h2 * 2000;    //amt=amt%2000;
            h5 = amt / 500;
            amt = amt - h5 * 500;     //amt=amt%500;
            h = amt / 100;
            System.out.println("Number of 2000 rupees note:" + h2);
            System.out.println("Number of 500 rupees note:" + h5);
            System.out.println("Number of 100 rupees note:" + h);
        }
        else
        {
            System.out.println("Entered amount cannot be dispatched");
        }
    }
}
