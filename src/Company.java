import java.util.*;

public class Company
{
    public static int income;
    HashMap<Employee, String> list = new HashMap<>();

    public static int getIncome ()
    {
        return income;
    }

    public void setIncome ()
    {
        this.income = (new Scanner(System.in)).nextInt();
    }

    public HashMap<Employee, String> hire (String post)
    {
        if (post.equalsIgnoreCase("manager"))
        {
            Manager manager = new Manager();
            list.put(manager, manager.getName());
            return list;
        }
        if (post.equalsIgnoreCase("topmanager"))
        {
            TopManager topManager = new TopManager();
            list.put(topManager, topManager.getName());
            return list;
        }
        Operator operator = new Operator();
        list.put(operator, operator.getName());
        return list;
    }

    public HashMap<Employee, String>  hireAll (int countManager, int countTopManager, int countOperator)
    {
        if (countManager > 0)
        {
            for (int i = 0; i < countManager; i++)
            {
                Manager manager = new Manager();
                list.put(manager, manager.getName());
            }
        }
        if (countTopManager > 0)
        {
            for (int i = 0; i < countTopManager; i++)
            {
                TopManager topManager = new TopManager();
                list.put(topManager, topManager.getName());
            }
        }
        if (countOperator > 0)
        {
            for (int i = 0; i < countOperator; i++)
            {
                Operator operator = new Operator();
                list.put(operator, operator.getName());
            }
        }

        return list;
    }

    public HashMap<Employee, String> fire (String namePost)
    {
        if (list.containsValue(namePost))
        {
            list.values().remove(namePost);
        }
        return list;
    }

    public List<Employee> getTopSalaryStaff (int count)
    {
        if (count <= 0 || count > list.size())
        {
            System.out.println("Некорректные данные");
            return null;
        }
        List listTopSalary = getListSalary();
        listTopSalary.sort(new Comparator<Map.Entry<Employee, Double>>()
        {
            @Override
            public int compare (Map.Entry<Employee, Double> o1, Map.Entry<Employee, Double> o2)
            {
                return (int) (o2.getValue() - o1.getValue());
            }
        });
        return listTopSalary.subList(0, count);
    }

    public List<Employee> getLowSalaryStaff (int count)
    {
        if (count <= 0 || count > list.size())
        {
            System.out.println("Некорректные данные");
            return null;
        }
        List listLowSalary = getListSalary();
        listLowSalary.sort(new Comparator<Map.Entry<Employee, Double>>()
        {
            @Override
            public int compare (Map.Entry<Employee, Double> o1, Map.Entry<Employee, Double> o2)
            {
                return (int) (o1.getValue() - o2.getValue());
            }
        });
        return listLowSalary.subList(0, count);
    }

    public List getListSalary ()
    {
        HashMap<Employee, Double> mapSalary = new HashMap<>();
        for (Employee employee : list.keySet())
        {
            mapSalary.put(employee, employee.getMonthSalary());
        }
        return new ArrayList<>(mapSalary.entrySet());
    }
}
