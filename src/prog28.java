//Sorting in lexographical order(Dictionary order)
import java.util.*;
public class prog28
{
    public static void main(String args[])
    {
        String a[]={"hello","we","are","programmer"};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
