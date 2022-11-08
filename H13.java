/**
 * Created by students on 07/11/22.
 */
public class H13 {
    private double balance ,interest;
    public H13(double intial_balance)
    {
        balance=intial_balance;
        interest= ((balance*10)/100);
    }
    public void addInterest()
    {
        balance =balance+interest;
    }
    public void GetBalance()
    {
        System.out.println(balance);
    }
}

