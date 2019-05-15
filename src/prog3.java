import java.util.*;

public class prog3 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=s.nextLine();
        for(int i=0;i<5;i++)
        System.out.println("Hello "+name);
    }
}
