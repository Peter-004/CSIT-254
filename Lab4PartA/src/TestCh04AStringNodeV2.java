//stb removed package xxx;

/**
 * This class is solely for the purpose of testing the StringNode.
 *
 * @author Stephen T. Brower
 */
public class TestCh04AStringNodeV2 {

    public static void main(String[] args) {
        int results = 0;        // to total errors - hopefully it remains 0

        boolean verbose = false;


        // create 3 nodes for test
        StringNode node3 = new StringNode("Watermelon", null);
        StringNode node2 = new StringNode("Peach", node3);
        StringNode node1 = new StringNode("Banana", node2);

        // create some Strings to test the nodes created
        String checkString3 = "Watermelon";
        String checkString2 = "Peach";
        String checkString1 = "Banana";

        // create some additional Strings for changing the nodes
        String newString1 = "Apple";
        String newString2 = "Pear";
        String newString3 = "Strawberry";

        System.out.print("========Test Node-V2 (");
        if (verbose) {
            System.out.println("verbose)");
        } else {
            System.out.println("abbreviated output)");
        }


        System.out.println("\nTest of Constructor and getters\n");
        // this section checks for each node if the data returned
        // is what is expected?
        if (verbose) {
            System.out.println("\nCheck constructor-data and getData()\n");
        }

        // check node1 to see if the data is what is expected
        if (verbose) {
            System.out.print("node1.getData()=" + node1.getData());
            System.out.print("\tcheckString1=" + checkString1);
        }
        // check data
        if (checkString1.equals(node1.getData())) {
            System.out.print("node1 data checks");
        } else {
            results++;
            System.out.println("node1 data <== issue");
        }

        // check node2 to see if the data is what is expected
        if (verbose) {
            System.out.print("node2.getData()=" + node2.getData());
            System.out.print("\tcheckString2=" + checkString2);
        }
        // check data
        if (checkString2.equals(node2.getData())) {
            System.out.print("\tnode2 data checks");
        } else {
            results++;
            System.out.println("node2 data <== issue");
        }

        // check node3 to see if the data is what is expected
        if (verbose) {
            System.out.print("node3.getData()=" + node3.getData());
            System.out.print("\tcheckString3=" + checkString3);
        }
        // check data
        if (checkString3.equals(node3.getData())) {
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
            System.out.print("node1= " + node1.getData());
        }
        //Check next of node1
        if (node1.getNext() == node2) {
            System.out.print("-Next-1 Yes");
        } else {
            results++;
            System.out.println("-Next XXX << issue");
        }

        // check node1 to see if the next is what is expected
        if (verbose) {
            System.out.print("node2= " + node2.getData());
        }

        //Check next of node2
        if (node2.getNext() == node3) {
            System.out.print("\t-Next-2 Yes");
        } else {
            results++;
            System.out.println("-Next XXX << issue");
        }

        //display node3
        if (verbose) {
            System.out.print("node3= " + node3.getData());
        }

        //Check next of node3
        if (node3.getNext() == null) {
            System.out.println("\t-Next-3 Yes");
        } else {
            results++;
            System.out.println("-Next XXX << issue");
        }

        // this section checks if the setData works
        if (verbose) {
            System.out.println("\nCheck setData()\n");
        }

        System.out.println("\nTest of setters\n");
        // change data in nodes to new value
        node1.setData(newString1);
        node2.setData(newString2);
        node3.setData(newString3);

        if (verbose) {
            System.out.print("\nnode1.getData()=" + node1.getData());
            System.out.print("\tcheckString1=" + newString1);
        }
        // check data
        if (newString1.equals(node1.getData())) {
            System.out.print("node1 data checks");
        } else {
            results++;
            System.out.print("node1 data <== issue");
        }

        if (verbose) {
            System.out.print("node2.getData()=" + node2.getData());
            System.out.print("\tcheckString2=" + newString2);
        }
        if (newString2.equals(node2.getData())) {
            System.out.print("\tnode2 data checks");
        } else {
            results++;
            System.out.println("node2 data <== issue");
        }

        if (verbose) {
            System.out.print("node3.getData()=" + node3.getData());
            System.out.print("\tcheckString3=" + newString3);
        }
        if (newString3.equals(node3.getData())) {
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

        //display node 1
        if (verbose) {
            System.out.print("node1= " + node1.getData());
        }

        //Check next of node1
        if (node1.getNext() == null) {
            System.out.print("-Next-1 Yes");
        } else {
            results++;
            System.out.println("-Next XXX << issue");
        }

        //display node 2
        if (verbose) {
            System.out.print("node2= " + node2.getData());
        }

        //Check next of node1
        if (node2.getNext() == node1) {
            System.out.print("\t-Next-2 Yes");
        } else {
            results++;
            System.out.println("-Next XXX << issue");
        }

        //display node 3
        if (verbose) {
            System.out.print("node3= " + node2.getData());
        }

        //Check next of node1
        if (node3.getNext() == node2) {
            System.out.print("\t-Next-3 Yes");
        } else {
            results++;
            System.out.println("-Next XXX << issue");
        }

        System.out.print("\n\nResults of all Node tests:\t " + results);
        if (results == 0) {
            System.out.println("--Good");
        } else {
            System.out.println("<---------issue(s)");
        }
        System.exit(results); // this throws a fit if results is not 0
    }
}
/*
Expected output:
========Test Node-V2 (abbreviated output)

Test of Constructor and getters

node1 data checks	node2 data checks	node3 data checks
-Next-1 Yes	-Next-2 Yes	-Next-3 Yes

Test of setters

node1 data checks	node2 data checks	node3 data checks
-Next-1 Yes	-Next-2 Yes	-Next-3 Yes

Results of all Node tests:	 0--Good
*/