//Maddie Warndorf's code
import java.util.Scanner;
public class CarLoan3 {
  public static void main(String [] args) {
     Scanner input = new Scanner(System.in);
    int choice = 0;
     do {
       System.out.print("Enter Vehicle Price");
       double vPrice = input.nextDouble();  
       System.out.print("Enter Trade-in Value");
       double tradeinValue = input.nextDouble();
       System.out.print("Enter Down Payment");
       double downPayment = input.nextDouble();
       System.out.print("Enter Term of Loan (Number of Months)");
       int termOfLoan = input.nextInt();
     
       double totalPriceOfVehicle = vPrice - tradeinValue - downPayment;
       double monthlyPayment = totalPriceOfVehicle / termOfLoan;
       System.out.printf("Total Vehicle Price: $%.2f", totalPriceOfVehicle);
       System.out.printf("\nMonthly Payment: $%.2f", monthlyPayment); 
   
       System.out.print("\nEnter 1 to Continue: 0 to Exit");
       choice = input.nextInt();
     } while(choice == 1);

  }

}