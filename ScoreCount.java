//Maddie Warndorf's code for ScoreCount
import java.util.Scanner;
public class ScoreCount {
  public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Student Name:");
      String studentName = input.nextLine();
      int score [] = new int [10];
      
     
      for(int index = 0; index < score.length; index++) {
        System.out.print("Enter score " + (index+1) + ":");
        int element = input.nextInt();
        score[index] = element;
      }
      
      System.out.print("Score Summary of " + studentName);
      double total = 0.0;
      for(int index = 0; index < score.length; index++) {
      total += score[index];
      }    
      
      double averageScore = total / 10;
      System.out.printf("\nAverage Score: %.1f", averageScore);
      
    int numberOfPassing = 0;
    int numberOfFailing= 0;
      for(int index = 0; index < score.length; index++) {
         if(score[index] >= 50) {
          numberOfPassing++;
        }
         else if(score[index] <= 49) {
           numberOfFailing++;
         }
         else {
           System.out.print("Error");
         }
      }
      System.out.print("\nNumber of Passing Score: " + numberOfPassing);

      System.out.print("\nNumber of Failing Score: " + numberOfFailing);
  }
}
