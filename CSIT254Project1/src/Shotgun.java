import java.util.*;

/**
 *Shotgun Class
 * @author Opemipo Adebayo
 */
public class Shotgun implements Comparable<Shotgun>{
    private double damage;
    private int accuracy;
    private String name;

    /**
     * Constructor for a Shotgun object
     * @param gunName the name of the shotgun
     * @param dmg the damage number the shotgun deals in one shot
     * @param acc the accuracy of the shotgun
     */
    public Shotgun(String gunName, double dmg, int acc){
        name = gunName;
        damage = dmg;
        accuracy = acc;
    }

    /**
     * getName method gets the name of the shotgun
     * @return the String of characters representing the name
     */
    public String getName(){
        return name;
    }

    /**
     * getAccuracy method gets the accuracy of the specific shotgun
     * @return the accuracy of the shotgun
     */
    public int getAccuracy(){
        return accuracy;
    }

    /**
     * getDamage method gets the damage of the specific shotgun
     * @return the number of damage dealt in one shot by the shotgun
     */
    public double getDamage(){
        return damage;
    }

    /**
     * setName method sets a name of the shotgun or a new shotgun
     * @param newName the name to be set
     */
    public void setName(String newName){
        name = newName;
    }

    /**
     * setAccuracy sets an accuracy for the shotgun or a new shotgun
     * @param newAccuracy the accuracy to be set
     */
    public void setAccuracy(int newAccuracy){
        accuracy = newAccuracy;
    }

    /**
     * setDamage method sets a damage number for the shotgun or a new shotgun
     * @param newDamage the damage number to be set.
     */
    public void setDamage(double newDamage){
        damage = newDamage;
    }

    /**
     * equals method verifies if a shotgun is the same
     * @param shotg the object to be compared to for similarity
     * @return true or false if similar or not
     */
    public boolean equals(Object shotg){
        boolean bool;
        Shotgun shotgun = (Shotgun) shotg;
        if((name.equals(shotgun.getName())) && (accuracy == shotgun.getAccuracy()) && (damage == shotgun.getDamage()))bool = true;
        else{
            bool = false;
        }
        return bool;
        }

    /**
     * compareTo method compares objects
     * @return an int if it's ></=
     */
    public int compareTo(Shotgun shotgun) {
        return name.compareTo(shotgun.getName());
    }
}
