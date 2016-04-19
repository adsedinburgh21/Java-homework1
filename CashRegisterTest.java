import java.util.Scanner;

/**
   A class to test the CashRegister class.
*/
public class CashRegisterTest
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      // register.recordPurchase(13.50);
      Scanner in = new Scanner(System.in);
      System.out.println("Price for first item: ");
      double price1 = in.nextDouble();

      System.out.println("Price for second item: ");
      double price2 = in.nextDouble();

      System.out.println("Payment Amount: ");
      double amount = in.nextDouble();

      register.recordPurchase(price1);
      register.recordPurchase(price2);
      register.enterPayment(amount);
      // register.recordPurchase(2.25);
      // register.enterPayment(20);
      double change = register.giveChange();
      System.out.println(change);      
   }
}
