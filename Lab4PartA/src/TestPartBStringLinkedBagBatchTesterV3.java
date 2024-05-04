// STB removed: package csit254proglabch04bstringlinkedbags24;

/**
 * Batch Tester for StringLinkedBag
 * Version 2 adds apple first and watermelon last so that
 * whether the extra credit is done or not the first and last elements are
 * tested for removal.
 * Version 2 adds 2 additional fruits after the removals
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class TestPartBStringLinkedBagBatchTesterV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        StringLinkedBag fruitBag = new StringLinkedBag();
        String fruitToAdd, fruitToFind, fruitToDelete;

        System.out.println("\n*** Version 3 -- This tester requires visual comparison ***\n");

        displayBag("\nfruitBag upon startup", fruitBag);

        System.out.println("\nAdding Fruit\n");

        fruitToAdd = "Apple";
        System.out.print("Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        fruitToAdd = "Mango";
        System.out.print(", Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        fruitToAdd = "Grape";
        System.out.print(", Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        fruitToAdd = "ManGo";
        System.out.print(", Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        fruitToAdd = "pear";
        System.out.print(", Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        fruitToAdd = "banana";
        System.out.print(", Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        fruitToAdd = "Watermelon";
        System.out.print(", Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);
        
        displayBag("\nfruitBag after adding fruit", fruitBag);

        System.out.println("\nSearching...\n");

        fruitToFind = "apple";
        System.out.print("---Looking for " + fruitToFind + "->");

        // try to find fruit
        if (fruitBag.exists(fruitToFind)) {
            System.out.println("1: " + fruitToFind + " exists in fruitBag "
                    + "# of times: " + fruitBag.countOccurrences(fruitToFind));
        } else {
            System.out.println("2: " + fruitToFind + " is not in fruitBag "
                    + "# of times: " + fruitBag.countOccurrences(fruitToFind));
        }

        fruitToFind = "fig";
        System.out.print("---Looking for " + fruitToFind + "->");

        // try to find fruit
        if (fruitBag.exists(fruitToFind)) {
            System.out.println("2: " + fruitToFind + " exists in fruitBag "
                    + "# of times: " + fruitBag.countOccurrences(fruitToFind));
        } else {
            System.out.println("2: " + fruitToFind + " is not in fruitBag "
                    + "# of times: " + fruitBag.countOccurrences(fruitToFind));
        }

        fruitToFind = "pineapple";
        System.out.print("---Looking for " + fruitToFind + "->");

        // try to find fruit
        if (fruitBag.exists(fruitToFind)) {
            System.out.println("3: " + fruitToFind + " exists in fruitBag "
                    + "# of times: " + fruitBag.countOccurrences(fruitToFind));
        } else {
            System.out.println("3: " + fruitToFind + " is not in fruitBag "
                    + "# of times: " + fruitBag.countOccurrences(fruitToFind));
        }

        fruitToFind = "maNGo";
        System.out.print("---Looking for " + fruitToFind + "->");

        // try to find fruit
        if (fruitBag.exists(fruitToFind)) {
            System.out.println("4: " + fruitToFind + " exists in fruitBag "
                    + "# of times: " + fruitBag.countOccurrences(fruitToFind));
        } else {
            System.out.println("4: " + fruitToFind + " is not in fruitBag "
                    + "# of times: " + fruitBag.countOccurrences(fruitToFind));
        }

        displayBag("\nfruitBag after searching " + fruitToFind, fruitBag);

        System.out.println("\nRemoving:\n");

        fruitToDelete = "fig";
        // try to remove fruit
        if (fruitBag.remove(fruitToDelete)) {
            System.out.print("1D: " + fruitToDelete + " was removed from fruitBag");
        } else {
            System.out.print("1D: " + fruitToDelete + " wasn't removed");
        }

        displayBag("\nfruitBag after deleting " + fruitToDelete, fruitBag);

        fruitToDelete = "apple";
        // try to remove fruit
        if (fruitBag.remove(fruitToDelete)) {
            System.out.print("2D: " + fruitToDelete + " was removed from fruitBag");
        } else {
            System.out.print("2d: " + fruitToDelete + " wasn't removed");
        }

        displayBag("\nfruitBag after deleting " + fruitToDelete, fruitBag);

        fruitToDelete = "watermelon";
        // try to remove fruit
        if (fruitBag.remove(fruitToDelete)) {
            System.out.print("3D: " + fruitToDelete + " was removed from fruitBag");
        } else {
            System.out.print("3D: " + fruitToDelete + " wasn't removed");
        }

        displayBag("\nfruitBag after deleting " + fruitToDelete, fruitBag);

        fruitToDelete = "pomegranate";
        // try to remove fruit
        if (fruitBag.remove(fruitToDelete)) {
            System.out.print("4D: " + fruitToDelete + " was removed from fruitBag");
        } else {
            System.out.print("4d: " + fruitToDelete + " wasn't removed");
        }

        displayBag("\nfruitBag after deleting " + fruitToDelete, fruitBag);

        fruitToDelete = "pear";
        // try to remove fruit
        if (fruitBag.remove(fruitToDelete)) {
            System.out.print("5D: " + fruitToDelete + " was removed from fruitBag");
        } else {
            System.out.print("5D: " + fruitToDelete + " wasn't removed");
        }

        displayBag("\nfruitBag after deleting " + fruitToDelete, fruitBag);

        fruitToAdd = "Peach";
        System.out.print("\nAdding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        displayBag("\nfruitBag after adding " + fruitToAdd, fruitBag);

        fruitToFind = "peach";
        System.out.print("---Looking for " + fruitToFind + "->");

        // try to find fruit
        if (fruitBag.exists(fruitToFind)) {
            System.out.println("1: " + fruitToFind + " exists in fruitBag "
                    + "# of times: " + fruitBag.countOccurrences(fruitToFind));
        } else {
            System.out.println("2: " + fruitToFind + " is not in fruitBag "
                    + "# of times: " + fruitBag.countOccurrences(fruitToFind));
        }
        
        
        System.out.println("\nAdd two more fruits\n");

        fruitToAdd = "Apricot";
        System.out.print("Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        fruitToAdd = "Raspbery";
        System.out.print(", Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        displayBag("\nfruitBag after adding 2 fruits after deletion", fruitBag);
        
        System.out.println("\n*** This tester requires visual comparison -- Version 3 ***\n");

    }

    /**
     * the displayBag method displays the StringBag
     *
     * @param heading a String to display before the bag
     * @param aBag the StringBag to display
     */
    public static void displayBag(String heading, StringLinkedBag aBag) {
        System.out.println(heading);
        System.out.print("n=" + aBag.getSize() + " Bag: ");

        if (aBag.getSize() == 0) {
            System.out.println("Empty");//: Double Check if empty [ " + aBag + "]");
        } else {
            //System.out.println("Not Empty: Check [ " + aBag + "]");
            ListerPrototype2 stringLister = aBag.iteratorPrototype();
            while (stringLister.hasNext()) {
                String displayString = stringLister.next();
                System.out.print("{" + displayString + "}");
                if (stringLister.hasNext()) {
                    System.out.print(", ");
                }
            }
            System.out.println();

        }

    }
}
