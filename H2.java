/**
 * Created by students on 07/11/22.
 */
public class H2 {

    private String name;
    private double salarys,raise;
    public H2(String employee_name,double currentsalary)
    {
        name = employee_name;
        salarys = currentsalary;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salarys;
    }
    public void raiseSalary(double byPercent)
    {
        raise =((salarys * byPercent)/100);
        salarys=salarys+raise;
    }
}
