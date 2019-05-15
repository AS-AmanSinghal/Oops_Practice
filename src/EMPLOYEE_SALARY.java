import java.util.Scanner;

class Emp
{
    String Emp_ID;
    double salary;
    String Name;
    Emp(String Emp_ID,String Name,double salary)
    {
        this.Emp_ID=Emp_ID;
        this.salary=salary;
        this.Name=Name;
    }
    void display()
    {
        System.out.println("EMP.ID= "+Emp_ID);
        System.out.println("NAME= "+Name);
        System.out.println("SALARY= "+salary);
    }
}

public class EMPLOYEE_SALARY
{
    public static void main(String args[])
    {
        int i;
        int a[]=new int[100];
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER RANGE ");
        int n=s.nextInt();
        Emp [] e=new Emp[100];
        for(i=0;i<n;i++)
        {
            System.out.println("ENTER EMP_ID ");
            s.nextLine();
            String emp_id=s.nextLine();
            System.out.println("ENTER NAME ");
            String name=s.nextLine();
            System.out.println("ENTER SALARY ");
            double salary=s.nextDouble();
            e[i] =new Emp(emp_id,name,salary);
        }
        int x=0;
        for(i=0;i<n-1;i++)
        {
            if(e[i].salary>e[i+1].salary)
                x=i;
            else
                x=i+1;
        }
        e[x].display();
    }
}
