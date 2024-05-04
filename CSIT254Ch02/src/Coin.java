import java.util.*;

/**
 * Coin class for ProgLab2
 * @author Opemipo Adebayo
 */
public class Coin {
    private String sideUp;

    /**
     * Coin constructor creates a coin object
     */
    public Coin(){
        flip();
    }

    /**
     * flip method assigns a head or tails to the sideUp
     */
    public void flip(){
        if(Math.random()>0.5){
            sideUp = "head";
        }
        else{
            sideUp="tail";
        }
    }

    /**
     * getSideUp method gives the current side of the coin facing the top
     * @return a String containing the randomly generated side.
     */
    public String getSideUp(){
        return sideUp;
    }
}

