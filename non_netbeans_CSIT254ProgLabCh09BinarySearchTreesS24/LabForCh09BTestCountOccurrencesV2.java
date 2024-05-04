// STB - removed: package xxx;

/**
 * Tester for LabForCh09 - test of countOccurrences()
 * @author Stephen T. Brower
 */
public class LabForCh09BTestCountOccurrencesV2 {
    public static void main(String args[])
    {
        Car carToFindOnce = new Car(2023,"Aero");
        Car carToNotFind = new Car(2023,"Air head");
		Car carToFindMultipleTimes = new Car(2023,"Bugatti");

        BSTree<Car> myTree = new BSTree<Car>();
        int sizeBeforeAction = 0, sizeAfterAction = 10;
		int returnResults = 0;

        System.out.println("========Simple Tester - Test countOccurrences() - version 2");

        System.out.print("Tree before adds (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeBeforeAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
			returnResults++;
        }

        myTree.add(new Car(2023,"Edsel"));
        myTree.add(new Car(2023,"Dodge"));
        myTree.add(new Car(2023,"Malibu"));
		myTree.add(carToFindMultipleTimes);
        myTree.add(new Car(2023,"Explorer"));
        myTree.add(carToFindOnce);
        myTree.add(new Car(2023,"Camaro"));
		myTree.add(carToFindMultipleTimes);
        myTree.add(new Car(2023,"Neon"));
		myTree.add(carToFindMultipleTimes);

        System.out.print("Tree after 10 adds (Size == "+myTree.size()+")");

        if (myTree.size() ==  sizeAfterAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
			returnResults++;
		}

        myTree.printTree();


        System.out.println();
		System.out.print(carToFindOnce + " count: <"+myTree.countOccurrences(carToFindOnce)+"> ");
        if (myTree.countOccurrences(carToFindOnce) == 1) {
            System.out.println(carToFindOnce + " exists once -- good");
        } else {
            System.out.println(carToFindOnce + " does not exist once -- issue <"+myTree.countOccurrences(carToFindOnce)+">");
			returnResults++;
		}


        System.out.println();
		System.out.print(carToNotFind + " count: <"+myTree.countOccurrences(carToNotFind)+"> ");
        if (myTree.countOccurrences(carToNotFind) == 0) {
            System.out.println(carToNotFind + " does not exist -- good");
        } else {
            System.out.println(carToNotFind + " exists -- issue <"+myTree.countOccurrences(carToFindOnce)+">");
			returnResults++;
		}

        System.out.println();
		System.out.print(carToFindMultipleTimes + " count: <"+myTree.countOccurrences(carToFindMultipleTimes)+"> ");
        if (myTree.countOccurrences(carToFindMultipleTimes) == 3) {
            System.out.println(carToFindMultipleTimes + " exists three times -- good");
        } else {
            System.out.println(carToFindMultipleTimes + " does not exist three times -- issue <"+myTree.countOccurrences(carToFindOnce)+">");
			returnResults++;
		}

        System.out.print("\nTree after 3 searches (Size == "+myTree.size()+")");

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
========Simple Tester - Test countOccurrences() - version 2
Tree before adds (Size == 0)-Yes
Tree after 10 adds (Size == 10)-Yes
[Car 2023 Aero]
[Car 2023 Bugatti]
[Car 2023 Bugatti]
[Car 2023 Bugatti]
[Car 2023 Camaro]
[Car 2023 Dodge]
[Car 2023 Edsel]
[Car 2023 Explorer]
[Car 2023 Malibu]
[Car 2023 Neon]

[Car 2023 Aero] count: <1> [Car 2023 Aero] exists once -- good

[Car 2023 Air head] count: <0> [Car 2023 Air head] does not exist -- good

[Car 2023 Bugatti] count: <3> [Car 2023 Bugatti] exists three times -- good

Tree after 3 searches (Size == 10)-Yes

All functional tests good

^^^ please visually compare output(above) with expected output (in comments below)

*/
