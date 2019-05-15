class Driver
{
    public static void main (String args[])
    {
       Circle c1;  //creating reference
       c1=new Circle(); //creating object
        c1.x=10;  //assisgning value to data field
        c1.y=20;
        c1.r=5;
        Circle c2;  //creating reference
        c2=new Circle(); //creating object
        c2.x=10;  //assisgning value to data field
        c2.y=20;
        c2.r=10;
        Circle c3;  //creating reference
        c3=new Circle(); //creating object
        c3.x=10;  //assisgning value to data field
        c3.y=20;
        c3.r=15;
        double area=c1.area(); //invoking method
        double circumf=c1.circumference();    // same variable to be declared only once
        System.out.println("Radius="+c1.r+"Area="+area);
        System.out.println("Radius="+c1.r+"Circumference="+circumf);
        area=c2.area(); //invoking method
        circumf=c2.circumference();
        System.out.println("Radius="+c2.r+"Area="+area);
        System.out.println("Radius="+c2.r+"Circumference="+circumf);
        area=c3.area(); //invoking method
        circumf=c3.circumference();
        System.out.println("Radius="+c3.r+"Area="+area);
        System.out.println("Radius="+c3.r+"Circumference="+circumf);
    }

}
