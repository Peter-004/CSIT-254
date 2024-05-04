// STB - removed: package xxx;

/**
 * Tester for LabForCh09 - test of exists()
 * @author Stephen T. Brower
 */
public class LabForCh09BTestExistsV3 {
    public static void main(String args[])
    {
        Car carToFind = new Car(2023,"Aero");
        Car carToNotFind = new Car(2023,"Air head");

        BSTree<Car> myTree = new BSTree<Car>();
        int sizeBeforeAction = 0, sizeAfterAction = 7;
		int returnResults = 0;

        System.out.println("========Simple Tester - Test exists() - version 3");

        System.out.print("Tree before adds (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeBeforeAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
			returnResults++;
        }

        System.out.print("\ntest exists() on empty tree: ");
		if (myTree.exists(carToFind)) {
            System.out.println(carToFind + " exists -- issue");
			returnResults++;
		} else {
            System.out.println(carToFind + " does not exist -- good");
		}
		
		System.out.println("\nadding 7 cars...");
        myTree.add(new Car(2023,"Edsel"));
        myTree.add(new Car(2023,"Dodge"));
        myTree.add(new Car(2023,"Malibu"));
        myTree.add(new Car(2023,"Explorer"));
        myTree.add(new Car(2023,"Aero"));
        myTree.add(new Car(2023,"Camaro"));
        myTree.add(new Car(2023,"Neon"));

        System.out.print("\nTree after 7 adds (Size == "+myTree.size()+")");

        if (myTree.size() ==  sizeAfterAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
			returnResults++;
		}

        myTree.printTree();


        System.out.println();
        if (myTree.exists(carToFind)) {
            System.out.println(carToFind + " exists -- good");
        } else {
            System.out.println(carToFind + " does not exist -- issue");
			returnResults++;
		}


        System.out.println();
        if (myTree.exists(carToNotFind)) {
            System.out.println(carToNotFind + " exists -- issue");
			returnResults++;
        } else {
            System.out.println(carToNotFind + " does not exist -- good");
		}

        System.out.print("\nTree after 2 searches (Size == "+myTree.size()+")");

        if (myTree.size() ==  sizeAfterAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
			returnResults++;
		}
		
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
Expected Output:
========Simple Tester - Test exists() - version 3
Tree before adds (Size == 0)-Yes

test exists() on empty tree: [Car 2023 Aero] does not exist -- good

adding 7 cars...

Tree after 7 adds (Size == 7)-Yes
[Car 2023 Aero]
[Car 2023 Camaro]
[Car 2023 Dodge]
[Car 2023 Edsel]
[Car 2023 Explorer]
[Car 2023 Malibu]
[Car 2023 Neon]

[Car 2023 Aero] exists -- good

[Car 2023 Air head] does not exist -- good

Tree after 2 searches (Size == 7)-Yes

All functional tests good

^^^ please visually compare output(above) with expected output (in comments below)
*/
