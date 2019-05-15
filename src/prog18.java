public class prog18
{
    public static void main(String args[]) {
        int i, sum = 0;
        for (i = 1;; i++) {
            int n = i;
            sum=0;
            while (n > 0) {
                int r = n % 10;
                sum = sum + r;
                n = n / 10;
            }

            if ((sum * 3) == i) {
                break;
            }
        }
        System.out.println(""+i);
    }

}
