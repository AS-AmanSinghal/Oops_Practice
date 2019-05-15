//program to find tax
import java.util.*;
public class A
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      double sal=sc.nextDouble();  //enter salary
      double tax=0;
      if(sal<=300000)
      {
          tax=sal*0.05;
      }
      else if(sal<=500000)
      {
          tax=15000*.1*(sal-300000);
      }
      else
      {
          tax=35000+.15*(sal-500000);
      }
      System.out.println("Compound Tax="+tax);
    }
}
