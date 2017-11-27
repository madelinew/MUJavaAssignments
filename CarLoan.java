//Maddie Warndorf's code
import java.util.Scanner;
public class CarLoan {
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
     
     double totalPriceOfVehicle = vehiclePrice - tradeinValue - downPayment;
     double monthlyPayment = totalPriceOfVehicle / termOfLoan;
     
     System.out.printf("Total Vehicle Price: $%.2f", totalPriceOfVehicle);
     System.out.printf("\nMonthly Payment: $%.2f", monthlyPayment);
     
  }



}