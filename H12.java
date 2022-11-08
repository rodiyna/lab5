/**
 * Created by students on 07/11/22.
 */
public class H12 {

    public static void main(String[] args) {
       H1 account=new H1();
        account.Setdeposits(1000);
        account.Setwithdraws(500);
        account.Setwithdraws(400);
        account.get_Remaining_Balance();
        System.out.println("expected result = "+100);
        account.Setdeposits(900);
        account.AddInterest();
        account.get_Remaining_Balance();
        System.out.println("expected result = "+1100);


    }
}
