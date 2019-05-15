import java.util.*;

public class prog4 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = s.nextLine();
        System.out.println("How many times you want to print");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        System.out.println("Hello " + name);
    }
}
