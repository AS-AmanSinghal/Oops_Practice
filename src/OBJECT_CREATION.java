class Aman
{
    static int count;
    public Aman()
    {
        count++;
        System.out.println("object number=" +count +"created");
    }
    public static void main(String args[])
    {
        Aman a=new Aman();
        Aman b=new Aman();
        Aman c=new Aman();
        Aman d=new Aman();
    }
}