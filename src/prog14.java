import java.io.DataInputStream;

public class prog14
{
    public static void main(String args[]) {
        DataInputStream in = new DataInputStream(System.in);
        int n = 0, r = 0, s = 0, no = 0;
        try
        {
            System.out.println("Enter a number:");
            n = Integer.parseInt(in.readLine());
        } catch (Exception e) {}
        no = n;
        while (n > 0) {
            r = n % 10;
            s = s + r;
            n = n / 10;
        }
        while (s > 9) {
            n = s;
            s = 0;
            while (n > 0) {
                r = n % 10;
                s = s + r;
                n = n / 10;
            }
        }
        System.out.println("Sum is:" + s);
        if (s == 1)
        {
            System.out.println("The number is magic number");
        }
        else
        {
            System.out.println("The number is not magic number");
        }
    }
}
