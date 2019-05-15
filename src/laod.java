class Eload {
    Double ac_on, g_on, led_on, fan_on;

    double calLoad() {
        return (ac_on * 1500 + g_on * 1000 + fan_on * 200 + led_on * 20) / 1000.0;
    }
        String status()
        {
            if (calLoad() > 5)
                return "Over load";
            else
                return "Under load";
        }


    void printdetails() {
        //System.out.println("Owner name:"+name);
        //System.out.println("ID:"+id);
        System.out.println("Current Load:"+calLoad());
        System.out.println("Status:"+status());
    }
}

public class laod
{
    public static void main(String args[])
    {

    }
}
