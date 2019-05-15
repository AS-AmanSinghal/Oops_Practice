import java.util.*;
public class B1
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int val=sc.nextInt();
      System.out.println(method(val));
  }
  static long method(int n)
  {
      if(n==0)
          return 1;
      else
          return n*method(n-1);
  }
}
