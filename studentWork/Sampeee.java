package studentWork;

import java.util.*;

public class Sampeee {

    public static void main(String[] args) {

    Scanner deagle = new Scanner (System.in);

    System.out.println("How many numbers do you want to add?");
    
    int sum = 0;
    int numbersCount = deagle.nextInt();
    
     for (int i = 0; i < numbersCount; i++) {
        System.out.println("What is the number you want to add?");
        int value = deagle.nextInt();
        
        if (value % 2 == 0){
        sum = sum + value;
        }

      }
      double average = sum / numbersCount;
      System.out.println("The sum is " + sum);
      System.out.println("The average is " + average);
      deagle.close();
    }
    
}