public class Operator implements Employee
{
    public String name;
    public static int id = 1;

    public Operator()
    {
        this.name = "Operator_" + id;
        id++;
    }
    @Override
    public double getMonthSalary ()
    {
        return 70000;
    }

    @Override
    public String getName ()
    {
        return name;
    }

}
