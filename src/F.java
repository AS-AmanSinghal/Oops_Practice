import java.util.*;
public class F
{
    public static void main(String args[]) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a numner greater than 1:");
        num = s.nextInt();

        if (method(num))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean method(int n)
    {
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
