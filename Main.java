import java.util.Scanner;
class Main {
  
  public static final int AMOUNT_PAID = 100;

  public static void main(String[] args) {
    int amountDispensed;
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;

    while(true) {
      Scanner amount = new Scanner(System.in);
      System.out.println("Enter a zero to exit the program");
      System.out.println("Enter the price of an item between 25 cents and a dollar:");
      int amountOwed = amount.nextInt();

      if(amountOwed % 5 == 0 && amountOwed >= 25 && amountOwed <= 100) {
        amountDispensed = AMOUNT_PAID - amountOwed;
         if(amountOwed <= 100) { 
          quarters = amountDispensed/25;
          dimes = (amountDispensed - (quarters * 25)) / 10;
          nickels = (amountDispensed - ((quarters * 25) + (dimes*10))) / 5;
         }

        System.out.println("you bought an item for " + amountOwed + " so your change is: \n" + quarters + " quarters \n" + dimes + " dimes \n" + nickels + " nickels");
      }
      else {
        if(amountOwed == 0) {
	    		  break;
	    	  }
        System.out.println("amount must be in 5 cent increments and must be greater than 25 cents and less than one dollar");
        amountDispensed = 0;
      }
    }
  }
}