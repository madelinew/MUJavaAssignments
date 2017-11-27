//Maddie Warndorf's code for CountFamilies
import java.util.Scanner;
public class ArrayAssignment {
  public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("How many family members do you have?");
      int size = input.nextInt();
      double score [] = new double [size];
   
        
      for(int index = 0; index < score.length; index++) {
        int memberNumber = index + 1;
        System.out.print("Enter income of family member " + memberNumber + ":");
        double element = input.nextDouble();
        score[index] = element;
      
      }
      for(int index = 0; index < score.length; index++) {
        int familyNumber = index + 1;
        System.out.printf("\nIncome of Family " + familyNumber + " is $%.2f", score[index]);
      }
      
      double maximum = score[0];
      for(int index = 0; index < score.length; index++) {
         if(score[index] > maximum) {
          maximum = score[index];
        }
      }
      System.out.printf("\nMaximum income: $%.2f", maximum);
      
      double tenPercent = maximum * 0.1;
      System.out.printf("\n10 percent of maximum income: $%.2f", tenPercent);
      
      int numberOfFamilies = 0;
      for(int index = 0; index < score.length; index++) {
         if(score[index] < tenPercent) {
          numberOfFamilies = index;
        }
         
      }
      System.out.print("\nNumber of families whose income is below 10 percent: " + numberOfFamilies);
  }  
}