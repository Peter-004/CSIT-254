// STB - removed: package xxx;

/**
 * Purpose To Test remove() method when tree is empty
 *
 * @author Stephen T. Brower
 */
public class LabForCh09BTestRemoveCondition0EmptyTreeV3 {

    public static void main(String args[]) {
        BSTree<Car> myTree = new BSTree<Car>();
        Car valueToRemove = new Car(2023, "Explorer");
        boolean debug = true;
        int sizeBeforeAction = 0, sizeAfterAction = 0;
		int returnResults = 0;

        System.out.println("========Test Condition 0 - remove() when tree is empty - version 3");

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
            System.out.println(" " + valueToRemove + " removed <<---Issue");
			returnResults++;
        } else {
            System.out.println(" " + valueToRemove + " not removed");
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

        System.out.println("\n^^^ please visually compare output(above) "
                + "with expected output (in comments below)");
		System.exit(returnResults);
    }
}
/* output should be:
========Test Condition 0 - remove() when tree is empty - version 3
Tree before removal (Size == 0)-Yes
empty
 [Car 2023 Explorer] not removed
Tree After removal (Size == 0)-Yes
empty

All functional tests good

^^^ please visually compare output(above) with expected output (in comments below)
*/
