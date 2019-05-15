public class prog8
{
    public static void main(String args[])
    {
        for(int i=1;;i++)
        {
            if(i%7==1&&i%6==1&&i%5==1&&i%4==1&&i%3==1&&i%2==1)
            {
                System.out.println(" "+i);
                break;
            }
        }
    }
}
