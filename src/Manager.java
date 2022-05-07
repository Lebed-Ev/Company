public class Manager implements Employee
{
    public String name;
    public static int id = 1;

    public Manager()
    {
        this.name = "Manager_" + id;
        id++;
    }

    @Override
    public double getMonthSalary ()
    {
        double floating = (Math.round(115000 + 25000 * Math.random())) * 0.05;
        double monthSalary = 80000 + floating;
        return monthSalary;
    }

    @Override
    public String getName ()
    {
        return name;
    }

}
