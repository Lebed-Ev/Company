public class Main
{
    public static void main (String[] args)
    {
        Company cop = new Company();
        System.out.println(cop.hireAll(10,1, 5));
        System.out.println(cop.list.size());
        cop.setIncome();
        System.out.println(cop.getLowSalaryStaff(0));
        System.out.println(cop.getTopSalaryStaff(16));

    }
}
