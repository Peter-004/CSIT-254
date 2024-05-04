// STB - removed: package xxx;

/**
 * Purpose: To Test BSTNode
 *
 * @author Stephen T. Brower
 */
public class LabForCh09TestBSTNodeForBSTreesV5 {

    public static void main(String args[]) {
        int results = 0;
        // create 3 nodes for test
        BSTNode<Car> node2 = new BSTNode<Car>(new Car(2018, "Dodge"), null, null);
        BSTNode<Car> node3 = new BSTNode<Car>(new Car(2019, "Foo"), null, null);
        BSTNode<Car> node1 = new BSTNode<Car>(new Car(2017, "Explorer"), node2, node3);

        System.out.println("======== Begin Test BSTNode - version 5 ========");
        System.out.println("\nNote: inorderPrint() requires visual inspection\n");
        try {

            // create some cars
            Car checkCar1 = new Car(2017, "Explorer");
            Car checkCar2 = new Car(2018, "Dodge");
            Car checkCar3 = new Car(2019, "Foo");

            Car newCar1 = new Car(1965, "Lemans");
            Car newCar2 = new Car(1973, "Shelby");
            Car newCar3 = new Car(1954, "Edsel");

            System.out.println("\n\t\t\tTree 1");
            node1.inorderPrint();

            //check data
            System.out.println("\nCheck constructor-data and getData()\n");
            System.out.print("node1.getData()=" + node1.getData());

            System.out.print("\tcheckCar1=" + checkCar1);
            if (node1.getData().equals(checkCar1)) {
                System.out.println("\tnode1 data checks");
            } else {
                results++;
                System.out.println("node1 data <== issue");
            }

            System.out.print("node2.getData()=" + node2.getData());
            System.out.print("\tcheckCar2=" + checkCar2);
            if (node2.getData().equals(checkCar2)) {
                System.out.println("node2 data checks");
            } else {
                results++;
                System.out.println("node2 data <== issue");
            }

            System.out.print("node3.getData()=" + node3.getData());
            System.out.print("\tcheckCar3=" + checkCar3);
            if (node3.getData().equals(checkCar3)) {
                System.out.println("node3 data checks");
            } else {
                results++;
                System.out.println("node3 data <== issue");
            }

            // check links
            System.out.println("\nCheck constructor-links (left and right) getLeft() getRight()\n");

            //display node1
            System.out.print("node1= " + node1.getData());

            //Check left of node1
            if (node1.getLeft() == node2) {
                System.out.print("-Left Yes");
            } else {
                results++;
                System.out.print("-Left XXX << issue");
            }

            //Check right of node1
            if (node1.getRight() == node3) {
                System.out.println("-Right Yes");
            } else {
                results++;
                System.out.println("-Right XXX << issue");
            }

            //check nodes 2 and 3 to be nulls
            System.out.print("node2= " + node2.getData());
            //Check left of node2
            if (node2.getLeft() == null) {
                System.out.print("-Left null Yes");
            } else {
                results++;
                System.out.print("-Left != null << issue");
            }

            //Check right of node2
            if (node2.getRight() == null) {
                System.out.println("-Right null Yes");
            } else {
                results++;
                System.out.println("-Right != null << issue");
            }

            System.out.print("node3= " + node3.getData());
            //Check left of node3
            if (node3.getLeft() == null) {
                System.out.print("-Left null Yes");
            } else {
                results++;
                System.out.print("-Left != null << issue");
            }

            //Check right of node3
            if (node3.getRight() == null) {
                System.out.println("-Right null Yes");
            } else {
                results++;
                System.out.println("-Right != null << issue");
            }

            System.out.println("\nCheck setData()\n");

            // change data in nodes to new value
            node1.setData(newCar1);
            node2.setData(newCar2);
            node3.setData(newCar3);

            // set left of node1 to node3
            node1.setLeft(node3);
            // set right of node1 to node2
            node1.setRight(node2);

            System.out.println("\n\t\t\tTree 2");
            node1.inorderPrint();

            System.out.print("\nnode1.getData()=" + node1.getData());

            System.out.print("\tcheckCar1=" + newCar1);
            if (node1.getData().equals(newCar1)) {
                System.out.println("\tnode1 data checks");
            } else {
                results++;
                System.out.println("node1 data <== issue");
            }

            System.out.print("node2.getData()=" + node2.getData());
            System.out.print("\tcheckCar2=" + newCar2);
            if (node2.getData().equals(newCar2)) {
                System.out.println("node2 data checks");
            } else {
                results++;
                System.out.println("node2 data <== issue");
            }

            System.out.print("node3.getData()=" + node3.getData());
            System.out.print("\tcheckCar3=" + newCar3);
            if (node3.getData().equals(newCar3)) {
                System.out.println("node3 data checks");
            } else {
                results++;
                System.out.println("node3 data <== issue");
            }

            System.out.println("\nCheck links (left and right) setLeft() and setRight()\n");

            //display node 1
            System.out.print("node1= " + node1.getData());

            //Check left of node1
            if (node1.getLeft() == node3) {
                System.out.print("-Left Yes");
            } else {
                results++;
                System.out.print("-Left XXX << issue");
            }

            //Check right of node1
            if (node1.getRight() == node2) {
                System.out.println("-Right Yes");
            } else {
                results++;
                System.out.println("-Right XXX << issue");
            }

            //check nodes 2 and 3 to be nulls
            System.out.print("node2= " + node2.getData());
            //Check left of node2
            if (node2.getLeft() == null) {
                System.out.print("-Left null Yes");
            } else {
                results++;
                System.out.print("-Left != null << issue");
            }

            //Check right of node2
            if (node2.getRight() == null) {
                System.out.println("-Right null Yes");
            } else {
                results++;
                System.out.println("-Right != null << issue");
            }

            System.out.print("node3= " + node3.getData());
            //Check left of node3
            if (node3.getLeft() == null) {
                System.out.print("-Left null Yes");
            } else {
                results++;
                System.out.print("-Left != null << issue");
            }

            //Check right of node3
            if (node3.getRight() == null) {
                System.out.println("-Right null Yes");
            } else {
                results++;
                System.out.println("-Right != null << issue");
            }

            BSTNode<Car> node4a = new BSTNode<Car>(new Car(2018, "Explorer"), null, null);
            BSTNode<Car> node3a = new BSTNode<Car>(new Car(2019, "Foo"), node4a, null);
            BSTNode<Car> node2a = new BSTNode<Car>(new Car(2018, "Edsel"), null, node3a);
            BSTNode<Car> node1a = new BSTNode<Car>(new Car(2017, "Dodge"), null, node2a);

            System.out.println("\n\t\t\tTree 3");
            node1a.inorderPrint();

            BSTNode<Car> rightMostCheck = node3a;

            if (node1a.getRightmostData().equals(rightMostCheck.getData())) {
                System.out.println("\nrightmost of node1a - checks");
            } else {
                System.out.println("\nrightmost of node1a - <-- issue");
                System.out.println("Node1a: " + node1a.getData()
                        + "\nnode1a.getRightmostData(): " + node1a.getRightmostData()
                        + "\nrightMostCheck.getData(): " + rightMostCheck.getData());
                results++;
            }

            // remove rightmost of dodge node1a
            node1a.removeRightmost();

            System.out.println("\n\t\t\tTree 3 - rightmost removed");
            node1a.inorderPrint();

            //check
            if (node1a.getRightmostData().equals(node4a.getData())) {
                System.out.println("\nremove right most - checks");
            } else {
                System.out.println("\nremove right most <--- issue");
                System.out.println("node1a.getRightmostData(): " + node1a.getRightmostData()
                        + "\nnode4a.getData(): " + node4a.getData());
                results++;
            }
        } catch (NullPointerException e) {
            System.out.println("\nSomething went wrong - NullPointerException thrown");
            results++;
        }

        System.out.print("\n\nResults of all BSTNode tests: " + results);
        if (results == 0) {
            System.out.println("--Good");
            System.out.println("\n^^^ please visually compare output(above) "
                    + "with expected output (in comments below)");

        } else {
            System.out.println("<---------issue(s)");
        }
        System.out.println("\nNote: inorderPrint() requires visual inspection\n");
        System.out.println("======== End Test BSTNode - version 4 ========");
    }
}

/* 

output should be:
======== Begin Test BSTNode - version 5 ========

Note: inorderPrint() requires visual inspection


			Tree 1
[Car 2018 Dodge]
[Car 2017 Explorer]
[Car 2019 Foo]

Check constructor-data and getData()

node1.getData()=[Car 2017 Explorer]	checkCar1=[Car 2017 Explorer]	node1 data checks
node2.getData()=[Car 2018 Dodge]	checkCar2=[Car 2018 Dodge]node2 data checks
node3.getData()=[Car 2019 Foo]	checkCar3=[Car 2019 Foo]node3 data checks

Check constructor-links (left and right) getLeft() getRight()

node1= [Car 2017 Explorer]-Left Yes-Right Yes
node2= [Car 2018 Dodge]-Left null Yes-Right null Yes
node3= [Car 2019 Foo]-Left null Yes-Right null Yes

Check setData()


			Tree 2
[Car 1954 Edsel]
[Car 1965 Lemans]
[Car 1973 Shelby]

node1.getData()=[Car 1965 Lemans]	checkCar1=[Car 1965 Lemans]	node1 data checks
node2.getData()=[Car 1973 Shelby]	checkCar2=[Car 1973 Shelby]node2 data checks
node3.getData()=[Car 1954 Edsel]	checkCar3=[Car 1954 Edsel]node3 data checks

Check links (left and right) setLeft() and setRight()

node1= [Car 1965 Lemans]-Left Yes-Right Yes
node2= [Car 1973 Shelby]-Left null Yes-Right null Yes
node3= [Car 1954 Edsel]-Left null Yes-Right null Yes

			Tree 3
[Car 2017 Dodge]
[Car 2018 Edsel]
[Car 2018 Explorer]
[Car 2019 Foo]

rightmost of node1a - checks

			Tree 3 - rightmost removed
[Car 2017 Dodge]
[Car 2018 Edsel]
[Car 2018 Explorer]

remove right most - checks


Results of all BSTNode tests: 0--Good

^^^ please visually compare output(above) with expected output (in comments below)

Note: inorderPrint() requires visual inspection

======== End Test BSTNode - version 4 ========
*/
