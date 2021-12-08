package studentWork;

import java.util.*;

public class HockeyStarter {

    public static void main(String[] args) {
        
        String team = "Oilers";
        int periodsPlayed = 3;
        System.out.println(TotalGoals(periodsPlayed, team));

      
       
    }

        public static String TotalGoals(int periods, String teams) {
            
            int sum = 0;
            double average = 0.0;
            for (int i=1; i<= periods; i++){
                Scanner hstat = new Scanner(System.in);
            System.out.println("The " + teams + " scored how many goals by the end of the " + i + "period?");
            int value = hstat.nextInt();
            sum = sum + value;
            
            
            } 
            return "In " + periods + " periods of play they have " + sum + " goals and an average of " + average + " goals per period.";
        
    } 
}