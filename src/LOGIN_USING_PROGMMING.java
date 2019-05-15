import java.util.*;
public class LOGIN_USING_PROGMMING
    {
        public static void main(String agrs[])
        {
            String A="PROGRAMMING";
            Scanner s=new Scanner(System.in);
            System.out.println("ENTER YOUR PASS ");
            String B=s.nextLine();
            int count=B.length();
            String C=A.substring(0,4);
            int c=A.length();
            String D=A.substring(c-4,c);
            if(B.substring(0,4).equalsIgnoreCase(C) && B.substring(count-4,count).equalsIgnoreCase(D))
            System.out.println("YOU ARE LOGIN IN");
            else
            System.out.println("YOU ARE NOT LOGIN IN");
        }
    }

