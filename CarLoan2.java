//Maddie Warndorf's code
import java.util.Scanner;
public class CarLoan2 {
  public static void main(String [] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter Vehicle Price");
     double vehiclePrice = input.nextDouble();  
     System.out.print("Enter Trade-in Value");
     double tradeinValue = input.nextDouble();
     System.out.print("Enter Down Payment");
     double downPayment = input.nextDouble();
     System.out.print("Enter Term of Loan (Number of Months)");
     int termOfLoan = input.nextInt();
    
     double rate = 0.0;
     System.out.print("Enter Credit Score");
     int creditScore = input.nextInt();
     if(creditScore <= 500) {
       rate = 0.10;
     }
     else if(creditScore > 501 && creditScore <= 700) {
       rate = 0.05;
     }
     else {
       rate = 0.03;
     }
     
     
     double totalPriceOfVehicle = vehiclePrice - tradeinValue - downPayment;
     double interest = totalPriceOfVehicle * rate;
     double grandTotal = totalPriceOfVehicle + interest;
     double monthlyPayment = grandTotal / termOfLoan;
       
     System.out.printf("Total Vehicle Price: $%.2f", totalPriceOfVehicle);
     System.out.printf("\nInterest: $%.2f", interest);
     System.out.printf("\nGrand Total: $%.2f", grandTotal);
     System.out.printf("\nMonthly Payment: $%.2f", monthlyPayment);
     
  }



}