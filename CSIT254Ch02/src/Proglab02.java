/**
 * Driver class for the ProgLab2
 * @author Opemipo Adebayo
 */
public class Proglab02 {
    /**
     * main method
     * @param args the command line argument
     */
    public static void main(String[] args){
        //Coin object
        Coin penny = new Coin();
        System.out.println("Your coin is on its "+penny.getSideUp());
        System.out.println("Your coin is on its "+penny.getSideUp());
        penny.flip();
        System.out.println("Your coin flipped on its "+penny.getSideUp());
        System.out.println("Your coin flipped on its "+penny.getSideUp());

        //Coin array
        Coin[] coins = new Coin[10];
        System.out.println("------------------EXTRA CREDIT------------------");

        //Filling in the coin array and printing the sideUp for each
        for(int i = 0;i<10;i++){
            coins[i] = new Coin();
            System.out.printf("The coin %d is on its %s\n", i+1,coins[i].getSideUp());
        }
    }
}
