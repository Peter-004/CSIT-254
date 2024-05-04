// STB removed: package xxx;

/**
 * Demo Driver for Project 1 [ a reminder that your class CANNOT be a FORBIDDEN
 * CLASS ] Please feel free to copy this, and then do a search/replace to
 * accommodate your Class
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 *     ---edited by Opemipo Adebayo Peter
 */
public class ShotgunTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        Shotgun by_15;
        String name, newName;
        double damage, newDamage;
        int accuracy, newAccuracy;
        int returnResult = 0;

        // Assign Values - initial
        name = "BY-15";
        damage = 90;
        accuracy = 65;

        // Assign Values - "changed"
        newName = "LockWood680";
        newDamage = 89;
        newAccuracy = 70;


        //instantiate Cheese object
        by_15 = new Shotgun(name, damage, accuracy);
        Shotgun hSO = new Shotgun("HSOS4",98,88);

        // display values
        System.out.println("Object Instantiated:");
        System.out.println("\tName: " + by_15.getName());
        System.out.printf("\tDamage: %.2f\n", by_15.getDamage());
        System.out.println("\tAccuracy: " + by_15.getAccuracy());

        // check values ( this checks the constructor and the getters )
        if (name.equals(by_15.getName()) && damage == by_15.getDamage() && accuracy == by_15.getAccuracy()) {
            System.out.println("\nConstructor and Getters - good");
        } else {
            System.out.println("\nConstructor and Getters - issue(s)");
            returnResult++;
        }

        // whether or not the values return are as expected, let's call the setters, then check
        // change the object
        by_15.setName(newName);
        by_15.setDamage(newDamage);
        by_15.setAccuracy(newAccuracy);

        // display values after setters`
        System.out.println("\nObject changed:");
        System.out.println("\tName: " + by_15.getName());
        System.out.printf("\tDamage: %.2f\n", by_15.getDamage());
        System.out.println("\tAccuracy: " + by_15.getAccuracy());

        // check values ( this checks the setters )
        if (newName.equals(by_15.getName()) && newDamage == by_15.getDamage() && newAccuracy == by_15.getAccuracy()) {
            System.out.println("\nSetters - good");
        } else {
            System.out.println("\nSetters - issues");
            returnResult++;
        }

        // display summary
        if (returnResult == 0) {
            System.out.println("\nAll tests good");
        } else {
            System.out.println("\nSomething went wrong");
        }
        //System.out.println(by_15.equals(new Shotgun("LockWood680",89,70)));

        System.exit(returnResult);

    }

}
