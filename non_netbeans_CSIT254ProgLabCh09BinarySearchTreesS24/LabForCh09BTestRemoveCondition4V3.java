// STB - removed: package xxx;

/**
 * Purpose To Test remove() method - condition 4 node to be removed has a left
 * child - will go left and get largest on left and bring up
 *
 * @author Stephen T. Brower
 */
public class LabForCh09BTestRemoveCondition4V3 {

    public static void main(String args[]) {
        BSTree<Car> myTree = new BSTree<Car>();
        Car valueToRemove = new Car(2023, "Explorer");
        boolean debug = true;
        int sizeBeforeAction = 6, sizeAfterAction = 5;
		int returnResults = 0;

        System.out.println("========Test Condition 4 - remove() \n- there is a left child, get largest on left subtree - version 3");

        myTree.add(new Car(2023, "Explorer"));
        myTree.add(new Car(2023, "Dodge"));
        myTree.add(new Car(2023, "Malibu"));
        myTree.add(new Car(2023, "Aero"));
        myTree.add(new Car(2023, "Edsel"));
        myTree.add(new Car(2023, "Avalon"));

        System.out.print("Tree before removal (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeBeforeAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
			returnResults++;
        }

        myTree.printTree();

        // attempt to remove valueToRemove
        if (myTree.remove(valueToRemove)) {
            System.out.println("\n" + valueToRemove + " removed");
        } else {
            System.out.println("\n" + valueToRemove + " not removed <<---Issue");
			returnResults++;
        }

        System.out.print("Tree After removal (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeAfterAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
			returnResults++;
        }

        myTree.printTree();

		if (returnResults == 0) {
			System.out.println("\nAll functional tests good");
		} else {
			System.out.println("\nSome functional tests failed \t\t<-issue");
		}

        System.out.println("\n^^^ please visually compare output(above) "+
                "with expected output (in comments below)");
		System.exit(returnResults);
    }
}
/* output should be:
========Test Condition 4 - remove() 
- there is a left child, get largest on left subtree - version 3
Tree before removal (Size == 6)-Yes
[Car 2023 Aero]
[Car 2023 Avalon]
[Car 2023 Dodge]
[Car 2023 Edsel]
[Car 2023 Explorer]
[Car 2023 Malibu]

[Car 2023 Explorer] removed
Tree After removal (Size == 5)-Yes
[Car 2023 Aero]
[Car 2023 Avalon]
[Car 2023 Dodge]
[Car 2023 Edsel]
[Car 2023 Malibu]

All functional tests good

^^^ please visually compare output(above) with expected output (in comments below)

 */
