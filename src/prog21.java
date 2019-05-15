import java.util.Scanner;

public class prog21
{
    public static void main(String args[]) {
        int c = 0;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        while (a > 0) {
            int r = a % 10;
            a = a / 2;
            if (r % 2 == 0) {
                c++;
            }
        }
        System.out.println(" " + c);
    }
}
