// STB - removed: package xxx;

/**
 * Purpose: To Test remove() method - condition 1 - cursor is null -
 *    target not found
 * meaning: attempt to remove value not in tree
 * @author Stephen T. Brower
 */
public class LabForCh09BTestRemoveCondition1V3 {

    public static void main(String args[]) {
        BSTree<Car> myTree = new BSTree<Car>();
        Car valueToRemove = new Car(2023, "Cruz");
        boolean debug = true;
        int sizeBeforeAction = 6, sizeAfterAction = 6;
		int returnResults = 0;

        System.out.println("========Test Condition 1 - remove() - not there - version 3");

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
            System.out.println("\n" + valueToRemove + " removed <<---Issue");
			returnResults++;
        } else {
            System.out.println("\n" + valueToRemove + " not removed");
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

/* 
output should be:
========Test Condition 1 - remove() - not there - version 3
Tree before removal (Size == 6)-Yes
[Car 2023 Aero]
[Car 2023 Avalon]
[Car 2023 Dodge]
[Car 2023 Edsel]
[Car 2023 Explorer]
[Car 2023 Malibu]

[Car 2023 Cruz] not removed
Tree After removal (Size == 6)-Yes
[Car 2023 Aero]
[Car 2023 Avalon]
[Car 2023 Dodge]
[Car 2023 Edsel]
[Car 2023 Explorer]
[Car 2023 Malibu]

All functional tests good

^^^ please visually compare output(above) with expected output (in comments below)
*/
