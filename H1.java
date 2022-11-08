/**
 * Created by students on 07/11/22.
 */
public class H1 {

    private double balance;
    public void Setdeposits(double amount)
    {
        balance = balance + amount;
    }

    public void Setwithdraws(double amount)
    {
        balance = balance - amount;
    }

    public void get_Remaining_Balance()
    {
        System.out.println(balance);
    }

    public void AddInterest()
    {
        double rate = ((balance*10)/100);
        balance=balance+rate;
    }
}
