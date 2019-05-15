import java.util.Scanner;

public class prog27
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a, b;
        System.out.println("Enter first string");
        a = s.nextLine();
        //int x=a.indexOf(" ");
        //if (x==-1)
          //  System.out.println("You have not used space");
        //else
          //  System.out.println("You have used space");
        String arr[]=a.split(" ");
        if(arr.length==1)
            System.out.println("You have not use space");
        else
            System.out.println("You have used any space and number of words are:"+arr.length);
    }
}
