//Maddie Warndorf's code
import java.util.Scanner;
public class LoanInstallmentPlan {
  public static void main(String [] args) {
   Scanner input = new Scanner(System.in);
    System.out.print("First Name:");
    String firstName = input.next();
    System.out.print("Last Name:");
    String lastName = input.next();
    input.nextLine();
    System.out.print("Billing Address:");
    String billingAddress = input.nextLine();
    System.out.print("Loan Amount:");
    double loanAmount = input.nextDouble();
    System.out.print("Term of Loan (Months):");
    int termOfLoan = input.nextInt();
    double rate = 0.0;
   
    
    System.out.print("Credit Score:");
    int creditScore = input.nextInt();
    if(creditScore == 0) {
      rate = 0.2;
    }
    
    else if(creditScore > 100 && creditScore <= 400) {
      rate = 0.06;
    }
    else if(creditScore > 401 && creditScore <= 600) {
      rate = 0.04;
    }
    else if(creditScore < 0) {
      rate = 0.05;
    }
    else {
      rate = 0.2;
    }
              
    
    double interestAmount = loanAmount * rate;
    double totalLoanAmount = loanAmount + interestAmount;
    double monthlyPayment = totalLoanAmount / termOfLoan;
    
    System.out.println("Borrower: " + firstName + " " + lastName);
    System.out.println("Billing Address: " + billingAddress);
    System.out.printf("\nLoan Amount: $%.2f", loanAmount);
    System.out.printf("\nInterest: $%.2f", interestAmount);
    System.out.printf("\nTotal Loan Amount: $%.2f", totalLoanAmount);
    System.out.print("\nTerm of Loan: " + termOfLoan + " months");
    System.out.printf("\nPayment/month: $%.2f", monthlyPayment);
    

  }
}