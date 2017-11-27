//Maddie Warndorf's Code
import java.util.Scanner;
public class NumberAboveAverage {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    int temp [] = new int [10];
    
    for(int index = 0; index < temp.length; index++) {
    System.out.print("Enter Day " + (index+1) + ":");
    int element = input.nextInt();
    temp[index] = element;
    }
    
    double total = 0.0;
    for(int index = 0; index < temp.length; index++) {
      total += temp[index]; 
    }
    
    double average = total/10;
    System.out.printf("Average = %.1f", average);
    
    int numberOfDays = 0;
    for(int index = 0; index < temp.length; index++) {
      if(temp[index] > average) {
        numberOfDays++;
    }
    }
    System.out.print("\nNumber of days above average: " + numberOfDays);
    for(int index = 0; index < temp.length; index++) {
      if(temp[index] > average) {
        System.out.print("\nDay " + (index+1) + ": " + temp[index]);
 //I left them as non-doubles because they were entered as integers not decimals.
    }
    }
   
  }
}