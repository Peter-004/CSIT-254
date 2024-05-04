// STB - removed: package xxx;

/**
 * Tester for LabForCh09 - test of add()
 * @author Stephen T. Brower
 */
public class LabForCh09BTestAddV3 {
    public static void main(String args[])
    {
        BSTree<Car> myTree = new BSTree<Car>();
        int sizeBeforeAction = 0, sizeAfterAction = 7;

        System.out.println("========Simple Tester - Test add() - version 3");

        System.out.print("Tree before adds (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeBeforeAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
        }

        myTree.add(new Car(2023,"Edsel"));
        myTree.add(new Car(2023,"Dodge"));
        myTree.add(new Car(2023,"Malibu"));
        myTree.add(new Car(2023,"Explorer"));
        myTree.add(new Car(2023,"Aero"));
        myTree.add(new Car(2023,"Camaro"));
        myTree.add(new Car(2023,"Neon"));

        System.out.print("Tree after 7 adds (Size == "+myTree.size()+")");
        if (myTree.size() ==  sizeAfterAction)
            System.out.println("-Yes");
        else
            System.out.println("<<----ISSUE------");

        myTree.printTree();

        System.out.println("\n^^^ please visually compare output(above) "+
                "with expected output (in comments below)");
    }
}
/*
Expected Output:
========Simple Tester - Test add() - version 3
Tree before adds (Size == 0)-Yes
Tree after 7 adds (Size == 7)-Yes
[Car 2023 Aero]
[Car 2023 Camaro]
[Car 2023 Dodge]
[Car 2023 Edsel]
[Car 2023 Explorer]
[Car 2023 Malibu]
[Car 2023 Neon]

^^^ please visually compare output(above) with expected output (in comments below)

*/
