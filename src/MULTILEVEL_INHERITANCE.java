class Animal
{
    void eat()
    {
        System.out.println("I AM EATING");
    }
}
class dog extends Animal
{
    void bark()
    {
        System.out.println("I AM BARKING");
    }
}
class cat extends dog
{
    void weep()
    {
        System.out.println("I AM WEEPING");
    }
}
public class MULTILEVEL_INHERITANCE
{
    public  static void main(String args[])
    {
        cat c=new cat();
        c.weep();
        c.bark();
        c.eat();
    }
}
