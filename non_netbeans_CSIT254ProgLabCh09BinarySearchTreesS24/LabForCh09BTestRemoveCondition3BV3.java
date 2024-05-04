// STB - removed: package xxx;

/**
 * pillaged from Condition3A but to use parent's right
 *
 * @author Stephen T. Brower
 */
public class LabForCh09BTestRemoveCondition3BV3 {

    public static void main(String args[]) {
        BSTree<Car> myTree = new BSTree<Car>();
        Car valueToRemove = new Car(2023, "Edsel");
        boolean debug = true;
        int sizeBeforeAction = 7, sizeAfterAction = 6;
		int returnResults = 0;

        System.out.println("========Test Condition 3b - remove() - no left, use parent's right - version 3");

        myTree.add(new Car(2023, "Explorer"));
        myTree.add(new Car(2023, "Dodge"));
        myTree.add(new Car(2023, "Malibu"));
        myTree.add(new Car(2023, "Aero"));
        myTree.add(new Car(2023, "Edsel"));
        myTree.add(new Car(2023, "Avalon"));
        myTree.add(new Car(2023, "Eieio"));

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
/* sample output is:
========Test Condition 3b - remove() - no left, use parent's right - version 3
Tree before removal (Size == 7)-Yes
[Car 2023 Aero]
[Car 2023 Avalon]
[Car 2023 Dodge]
[Car 2023 Edsel]
[Car 2023 Eieio]
[Car 2023 Explorer]
[Car 2023 Malibu]

[Car 2023 Edsel] removed
Tree After removal (Size == 6)-Yes
[Car 2023 Aero]
[Car 2023 Avalon]
[Car 2023 Dodge]
[Car 2023 Eieio]
[Car 2023 Explorer]
[Car 2023 Malibu]

All functional tests good

^^^ please visually compare output(above) with expected output (in comments below)

*/
