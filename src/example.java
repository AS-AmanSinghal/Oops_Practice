class OUTER_CLASS
{
    private static String msg1="WE LOVE JAVA";
    private  static String msg2="WE LOVE PROGRAMMING";
    public static class NESTED_STATIC_CLASS
    {
        public void printMessage()
        {
            System.out.println(msg1);
        }
    }
    public class INNER_CLASS
    {
        public void display()
        {
            System.out.println(msg1+" "+msg2);
        }
    }
}
class example
{
    public static void main(String args[])
    {
        OUTER_CLASS.NESTED_STATIC_CLASS p=new OUTER_CLASS.NESTED_STATIC_CLASS();
        p.printMessage();
        OUTER_CLASS outer=new OUTER_CLASS();
        OUTER_CLASS.INNER_CLASS inner1=outer.new INNER_CLASS();
        inner1.display();
        OUTER_CLASS.INNER_CLASS inner2=new OUTER_CLASS().new INNER_CLASS();
        inner2.display();
    }
}