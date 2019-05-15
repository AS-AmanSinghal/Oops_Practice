class Animal1
{
    void eat()
    {
        System.out.println("I AM EATING");
    }
}
class DOG extends Animal1
{
    void bark()
    {
        System.out.println("I AM BARKING");
    }
}
class CAT extends Animal1
{
    void weep()
    {
        System.out.println("I AM WEEPING");
    }
}

public class HIERARICHAL_INHERITANCE
{
    public static void main(String args[])
    {
        CAT c=new CAT();
        c.weep();
        c.eat();
    }
}
