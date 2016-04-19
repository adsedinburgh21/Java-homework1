/*
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   /*
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /*
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      double total = purchase + amount;
      purchase = total;
   }

   /*
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
   public void enterPayment(double amount)
   {
      payment = amount;
   }

   /*
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double calculateChange()
   {   
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }

   public double giveChange()
   {
      double change = calculateChange();
      int tenPound = 0;
      int fivePound = 0;
      int pound = 0;
      int fiftyPence = 0;
      int twentyPence = 0;
      int tenPence = 0;
      int fivePence = 0;
      int twoPence = 0;
      int onePence = 0;
     
      if( change >= 10){
         while( change >= 10){
            change -= 10;
            tenPound += 1;
         }
      } if ( change < 10 && change >= 5){
         while( change >= 5){
            change -= 5;
            fivePound += 1;
         }
      } if ( change < 5 && change >= 1){
         while( change >= 1){
            change -= 1;
            pound += 1;
         }
      } if ( change < 1 && change >= 0.5){
         while( change >= 0.5){
            change -= 0.5;
            fiftyPence += 1;
         }
      } if ( change < 0.5 && change >= 0.2){
         while( change >= 0.2){
            change -= 0.2;
            twentyPence += 1;
         } 
      } if ( change < 0.2 && change >= 0.1){
         while( change >= 0.1){
            change -= 0.1;
            tenPence += 1;
         }
      } if ( change < 0.1 && change >= 0.05){
         while( change >= 0.05){
            change -= 0.05;
            fivePence += 1;
         }
      } if ( change < 0.05 && change >= 0.02){
         while( change >= 0.02){
            change -= 0.02;
            twoPence += 1;
         }
      } if ( change < 0.02 && change >= 0.01){
         while( change >= 0.01){
            change -=0.01;
            onePence += 1;
         }
      }
      System.out.println("Total Change: " + change);
      System.out.println("£10: " + tenPound);
      System.out.println("£5: " + fivePound);
      System.out.println("£1: " + pound);
      System.out.println("50p: " + fiftyPence);
      System.out.println("20p: " + twentyPence);
      System.out.println("10p: " + tenPence);
      System.out.println("5p: " + fivePence);
      System.out.println("2p: " + twoPence);
      System.out.println("1p: " + onePence);
      return change;
   }
}
