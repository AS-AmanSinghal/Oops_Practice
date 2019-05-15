class OuterClass
{
    private static String msg1 = "We Love Java";
    private String msg2="We Love Programming";
    public static class NestedStaticClass
    {
        public void printMessage()
        {
            System.out.println(msg1);
        }
        //End of method
    }
        // End of static class
    public class InnerClass
        {
            public void display()
            {
                System.out.println(msg1 + " " + msg2);
            }
            //End of method
        }//End of inner class
    }//End of outer class
    class Main
    {
        public static void main(String args[])
        {
            OuterClass.NestedStaticClass p = new OuterClass.NestedStaticClass(); p.printMessage();
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner1 = outer.new InnerClass();
        inner1.display();
        OuterClass.InnerClass inner2= new OuterClass().new InnerClass();
        inner2.display();
        }
    }
