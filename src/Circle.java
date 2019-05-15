class Circle
{
    double x,y;       //centre of the circle
    double r;  //radius of circle
    void findPosition(double x1, double y1)
    {
        double d;
        d=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
        if(d<r)
            System.out.println("Inside circle");
        else if(d==r)
            System.out.println("on the circle");
        else
            System.out.println("outside the circle");
    }
    //Method to return circumference and area
    double circumference ()
    {
        return 2*3.14*r;
    }
    double area ()
    {
        return 3.14*r*r;
    }
}                               //can only compile not run
