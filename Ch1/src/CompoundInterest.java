import java.util.*;

/**
 * Compound Interest class to calculate the compound interest with interest rate for a period of time
 * @author Adebayo Opemipo Peter
 */
public class CompoundInterest {
    public static void main(String[] args){
        //variables declaration
        double principal  = 10000;
        double rate = 0.02;
        int numberOfPeriods = 12;
        int numberOfYears = 20;
        double runningBalance = principal;
        //Printing out the initial balance
        System.out.printf("Initial Balance is %.2f",principal);

        //Nested for loop for getting the running balance each period of the year
        for(int i = 0;i< numberOfYears;i++){
            //getting the running bal across the number of periods
            for(int j = 0;j<numberOfPeriods;j++){
                runningBalance += runningBalance*rate/numberOfPeriods;
                System.out.printf("Year %d period %d, Current balance is %.2f\n",i+1,j+1,runningBalance);
            }
        }
        //Printing out the final balance
        System.out.printf("\nFinal balance is %.2f\n",runningBalance);

        System.out.println("--------------------EXTRA CREDIT--------------------");
        double amount = principal*Math.pow((1+rate/numberOfPeriods),numberOfYears*numberOfPeriods);
        System.out.printf("Compound Interest formula checks %.2f",amount);
    }
}
