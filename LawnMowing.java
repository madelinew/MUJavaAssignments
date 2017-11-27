//Maddie Warndorf's code
import java.util.Scanner;
public class LawnMowing {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Lawn-Mowing Service");
    System.out.println("\nPlease enter the length and width of your lawn:");
    System.out.print("Length:");
    int length = input.nextInt();
    System.out.print("Width:");
    int width = input.nextInt();
    System.out.print("How would you like to set up a payment?");
    System.out.print("\n(1) once, (2) twice, (3) 20 times per year:");
    int paymentPlan = input.nextInt();
    String paymentSentence = " ";
    if(paymentPlan == 1) {
      paymentSentence = "a one time fee";
    }
    else if(paymentPlan == 2) {
      paymentSentence = "twice a year";
    }
    else if(paymentPlan == 3) {
      paymentSentence = "20 times per year";
    }
    else {
      paymentSentence = "Error";
    }
    
    int paymentBreakdown = 0;
    if(paymentPlan == 1) {
      paymentBreakdown = 1;
    }
    else if(paymentPlan == 2) {
      paymentBreakdown = 2;
    }
    else {
      paymentBreakdown = 20;
    }
    
    int lawnSize = length * width;
    double weeklyRate = 0.0;
    if(lawnSize < 4000) {
      weeklyRate = 25.00;
    }
    else if(lawnSize >= 4000 && lawnSize < 6000) {
      weeklyRate = 35.00;
    }
    else{
      weeklyRate = 50.00;
    }
    
    double seasonalFee = weeklyRate * 20;
    double paymentCharge = seasonalFee / paymentBreakdown;
 
    
      
    System.out.print("Your lawn is " + lawnSize + " square feet.");
    System.out.printf("\nWeekly fee: $%.2f", weeklyRate);
    System.out.printf("\n20-week seasonal fee: $%.2f", seasonalFee);
    System.out.printf("\nYour payment is %s: $%.2f", paymentSentence, paymentCharge);
  
  
  
  
  }
}