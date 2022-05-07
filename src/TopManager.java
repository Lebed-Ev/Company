public class TopManager implements Employee
{
    public String name;
    public static int id = 1;

    public TopManager()
    {
        this.name = "TopManager_" + id;
        id++;
    }

    @Override
    public double getMonthSalary ()
    {
        double salary = 100000.0;
        if (Company.getIncome() > 10000000)
        {
            return salary + salary * 1.5;
        }
        return salary;
    }

    @Override
    public String getName ()
    {
        return name;
    }

}
