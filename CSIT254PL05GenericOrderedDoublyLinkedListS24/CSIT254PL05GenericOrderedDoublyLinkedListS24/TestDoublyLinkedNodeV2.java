// STB removed: package csit254pl05genericordereddoublylinkedlists24;

/**
 * There is no need to change this file ( other than the package statement)
 *
 * This class is solely for the purpose of testing the generic DoublyLinkedNode. It contains
 * a main method so that it can be run independently of the tester for the
 * LinkedList. 
 * Modified 2/26/2020: added null testing, added displayCar() method, corrected newCar# labels
 * Modified 2/20/2023: renamed node to DoublyLinkedNode because of prior issues with naming
 *
 * @author Stephen T. Brower
 */
public class TestDoublyLinkedNodeV2 {

    public static void main(String[] args) {
        int results = 0;        // to total errors - hopefully it remains 0

        boolean verbose = false;

        // create 5 Car nodes for test
        DoublyLinkedNode<Car> previousB = new DoublyLinkedNode<Car>(new Car(2017, "Dodge"), null, null);
        DoublyLinkedNode<Car> previousA = new DoublyLinkedNode<Car>(new Car(2018, "Foo"), null, null);
        DoublyLinkedNode<Car> node3 = new DoublyLinkedNode<Car>(new Car(2018, "Dodge"), null, previousB);
        DoublyLinkedNode<Car> node2 = new DoublyLinkedNode<Car>(new Car(2019, "Foo"), node3, previousA);
        DoublyLinkedNode<Car> node1 = new DoublyLinkedNode<Car>(new Car(2017, "Explorer"), node2, null);

        // create some cars to test the nodes created
        Car checkPreviousB = new Car(2017, "Dodge");
        Car checkPreviousA = new Car(2018, "Foo");
        Car checkCar3 = new Car(2018, "Dodge");
        Car checkCar2 = new Car(2019, "Foo");
        Car checkCar1 = new Car(2017, "Explorer");

        // create some additional cars for changing the nodes
        Car newCar1 = new Car(1965, "Lemans");
        Car newCar2 = new Car(1973, "Shelby");
        Car newCar3 = new Car(1954, "Edsel");

        System.out.print("========Test DoublyLinkedNode for DoublyLinkedList ( version 2 ) -");
        if (verbose) {
            System.out.println("verbose");
        } else {
            System.out.println("abbreviated output");
        }

        // this section checks for each node if the data returned
        // is what is exepected?
        if (verbose) {
            System.out.println("\nCheck constructor-data and getData()\n");
        }

        // check node1 to see if the data is what is expected
        if (verbose) {
            System.out.print("node1.getData()=");
            displayCar(node1.getData());
            System.out.print("\tcheckCar1=");
            displayCar(checkCar1);
        }

        // check data
        if (node1.getData() == null) {
            results++;
            System.out.println("node1 data <== null issue");
        } else if (checkCar1.equals(node1.getData())) {
            System.out.print("node1 data checks");
        } else {
            results++;
            System.out.println("node1 data <== value issue");
        }

        // check node2 to see if the data is what is expected
        if (verbose) {
            System.out.print("node2.getData()=");
            displayCar(node2.getData());
            System.out.print("\tcheckCar2=");
            displayCar(checkCar2);
        }

        // check data
        if (node2.getData() == null) {
            results++;
            System.out.println("node2 data <== null issue");
        } else if (node2.getData().equals(checkCar2)) {
            System.out.print("\tnode2 data checks");
        } else {
            results++;
            System.out.println("node2 data <== issue");
        }

        // check node3 to see if the data is what is expected
        if (verbose) {
            System.out.print("node3.getData()=");
            displayCar(node3.getData());
            System.out.print("\tcheckCar3=");
            displayCar(checkCar3);
        }
        // check data
        if (node3.getData() == null) {
            results++;
            System.out.println("node3 data <== null issue");
        } else if (node3.getData().equals(checkCar3)) {
            System.out.println("\tnode3 data checks");
        } else {
            results++;
            System.out.println("node3 data <== issue");
        }

        // this section checks for each node if the next returned
        // is what is exepected?
        if (verbose) {
            System.out.println("\nCheck constructor-next and getNext()\n");
        }

        // check node1 to see if the next is what is expected
        if (verbose) {
            System.out.print("node1= ");
            displayCar(node1.getData());
        }
        //Check next of node1
        if (node1.getNext() == node2) {
            System.out.print("-Next-1 Yes");
        } else {
            results++;
            System.out.println("-Next XXX << issue");
        }
        //Check previous of node1
        if (node1.getPrevious() == null) {
            System.out.print("\t-Previous-1 Yes");
        } else {
            results++;
            System.out.println("-Previous-1 XXX << issue");
        }

        // check node2 to see if the next is what is expected
        if (verbose) {
            System.out.print("node2= ");
            displayCar(node2.getData());
        }

        //Check next of node2
        if (node2.getNext() == node3) {
            System.out.print("\t-Next-2 Yes");
        } else {
            results++;
            System.out.println("-Next XXX << issue");
        }

        //Check previous of node2
        if (node2.getPrevious() == previousA) {
            System.out.print("\t-Previous-2 Yes");
        } else {
            results++;
            System.out.println("-Previous-2 XXX << issue");
        }

        //display node3
        if (verbose) {
            System.out.print("node3= ");
            displayCar(node3.getData());
        }

        //Check next of node3
        if (node3.getNext() == null) {
            System.out.print("\t-Next-3 Yes");
        } else {
            results++;
            System.out.println("-Next XXX << issue");
        }

        //Check previous of node3
        if (node3.getPrevious() == previousB) {
            System.out.println("\t-Previous-3 Yes");
        } else {
            results++;
            System.out.println("-Previous-3 XXX << issue");
        }

        // this section checks if the setData works
        if (verbose) {
            System.out.println("\nCheck setData()\n");
        }

        // change data in nodes to new value
        node1.setData(newCar1);
        node2.setData(newCar2);
        node3.setData(newCar3);

        if (verbose) {
            System.out.print("\nnode1.getData()=");
            displayCar(node1.getData());
            System.out.print("\tnewCar1=");
            displayCar(newCar1);
        }
        // check data
        if (node1.getData() == null) {
            results++;
            System.out.println("node1 data <== null issue");
        } else if (node1.getData().equals(newCar1)) {
            System.out.print("node1 data checks");
        } else {
            results++;
            System.out.print("node1 data <== issue");
        }

        if (verbose) {
            System.out.print("node2.getData()=");
            displayCar(node2.getData());
            System.out.print("\tnewCar2=");
            displayCar(newCar2);
        }
        // check data
        if (node2.getData() == null) {
            results++;
            System.out.println("node2 data <== null issue");
        } else if (node2.getData().equals(newCar2)) {
            System.out.print("\tnode2 data checks");
        } else {
            results++;
            System.out.println("node2 data <== issue");
        }

        if (verbose) {
            System.out.print("node3.getData()=");
            displayCar(node3.getData());
            System.out.print("\tnewCar3=");
            displayCar(newCar3);
        }
        // check data
        if (node3.getData() == null) {
            results++;
            System.out.println("node3 data <== null issue");
        } else if (node3.getData().equals(newCar3)) {
            System.out.println("\tnode3 data checks");
        } else {
            results++;
            System.out.println("node3 data <== issue");
        }

        if (verbose) {
            System.out.println("\nCheck setNext()\n");
        }

        // set next of node2 to node1
        node2.setNext(node1);
        // set next of node3 to node2
        node3.setNext(node2);
        // set next of node1 to null
        node1.setNext(null);

        // set previous of node2 to node3
        node2.setPrevious(node3);
        // set previous of node3 to null
        node3.setPrevious(null);
        // set previous of node1 to node2
        node1.setPrevious(node2);

        //display node 1
        if (verbose) {
            System.out.print("node1= ");
            displayCar(node1.getData());
        }

        //Check next of node1
        if (node1.getNext() == null) {
            System.out.print("-Next-1 Yes");
        } else {
            results++;
            System.out.println("-Next-1 XXX << issue");
        }

        //Check previous of node1
        if (node1.getPrevious() == node2) {
            System.out.print("-Previous-1 Yes");
        } else {
            results++;
            System.out.println("-Previous-1 XXX << issue");
        }

        //display node 2
        if (verbose) {
            System.out.print("node2= ");
            displayCar(node2.getData());
        }

        //Check next of node1
        if (node2.getNext() == node1) {
            System.out.print("\t-Next-2 Yes");
        } else {
            results++;
            System.out.println("-Next-2 XXX << issue");
        }

        //Check previous of node2
        if (node2.getPrevious() == node3) {
            System.out.print("-Previous-2 Yes");
        } else {
            results++;
            System.out.println("-Previous-2 XXX << issue");
        }

        //display node 3
        if (verbose) {
            System.out.print("node3= ");
            displayCar(node3.getData());
        }

        //Check next of node1
        if (node3.getNext() == node2) {
            System.out.print("\t-Next-3 Yes");
        } else {
            results++;
            System.out.println("-Next-3 XXX << issue");
        }

        //Check previous of node3
        if (node3.getPrevious() == null) {
            System.out.print("-Previous-3 Yes");
        } else {
            results++;
            System.out.println("-Previous-3 XXX << issue");
        }

        System.out.print("\n\nResults of all DoublyLinkedNode tests:\t " + results);
        if (results == 0) {
            System.out.println("--Good");
        } else {
            System.out.println("<---------issue(s)");
        }

    }

    public static void displayCar(Car carToDisplay) {
        if (carToDisplay == null) {
            System.out.print(" { Car null }");
        } else {
            System.out.print(" { Car " + carToDisplay.getYearModel()
                    + " " + carToDisplay.getMake()
                    + " @ " + carToDisplay.getSpeed() + " } ");
        }
    }
}
