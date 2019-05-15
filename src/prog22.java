import java.util.Scanner;

public class prog22
{


            public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; i++)
            c[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            t[i] = sc.nextInt();

        int t1= 1000000;
        int t2= 1000000;
        int t3= 1000000;

        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                if (c[i] < t1)
                    t1 = c[i];
            } else if (t[i] == 2) {
                if (c[i] < t2)
                    t2 = c[i];
            } else if (t[i] == 3) {
                if (c[i] < t3)
                    t3 = c[i];
            }
        }

        if (t1 + t2 < t3) {
            System.out.println(t1 + t2);
        } else {
            System.out.println(t3);
        }


    }   }

