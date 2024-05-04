package csit254pl06stacksqueuess24;

/**
 * There is no need to change this file ( other than the package statement)
 *
 * Programmed by Stephen Brower Inspired by Michael Main 
 * Date Written 10/3/2014
 * - made tester generic 
 * Date Modified 
 *    10/12/2014 - changed to use Queues
 *    3/6/2019 - added additional item to add
 *    3/15/2023 - added calls to peek and added returnResults
 *
 * Run this program using the following: RunTestQueueWithCarV3.java
 */
public class GenericQueueGenericTestV2<E> {

    public void test(E[] testDataAdd, E additionalItemToAdd) {
        // creates a Queue
        Queue<E> myGenericQueue = new Queue<E>();

        // holds an item removed
        E itemRemoved;

        // holds an item from peek
        E itemPeeked;

		int checkItem = 0;

        int returnResults = 0;
		
        // show initial Queue size
        displayQueueSize("Display Queue Size on startup", myGenericQueue, checkItem);

        // add some stuff to the Queue
        System.out.println("\n===========\n<<Start adds:");
        for (E item : testDataAdd) {
            System.out.print("Adding: " + item);
            myGenericQueue.add(item);
            checkItem++;
            System.out.print(" \tadded...now size is " + myGenericQueue.size());
            if (checkItem == myGenericQueue.size()) {
                System.out.println(" -good");
            } else {
                System.out.println(" no, expected " + checkItem + "\t\t<=== issue");
				returnResults++;
            }
        }
        System.out.println("Stopped adding>>\n===========");

        // show Queue size after adds
        displayQueueSize("\nDisplay Queue size after adds", myGenericQueue, checkItem);

        // set index for checking to the beginning of the testDataAdd array
        checkItem = 0;

        System.out.print("\nAbout to remove 1 item...");

        // peek and remove 1 item
        try {
			itemPeeked = myGenericQueue.peek();
            // display 1 item
            System.out.print("...peek: <" + itemPeeked
                    + "> exp:{" + testDataAdd[checkItem]
                    + "} \tsize: " + myGenericQueue.size());
            if (itemPeeked.equals(testDataAdd[checkItem])) {
                System.out.println(" -good");
            } else {
                System.out.println(" exp:" + testDataAdd[checkItem] + "\t\t<=== issue");
				returnResults++;
            }
            itemRemoved = myGenericQueue.remove();
            // display 1 removed item
            System.out.print("...removed: <" + itemRemoved
                    + "> exp:{" + testDataAdd[checkItem]
                    + "} \tsize: " + myGenericQueue.size());
            if (itemRemoved.equals(testDataAdd[checkItem])) {
                System.out.println(" -good");
            } else {
                System.out.println(" exp:" + testDataAdd[checkItem] + "\t\t<=== issue");
				returnResults++;
            }
            checkItem++;

        } catch (EmptyQueue e) {
            System.out.println("Can't remove from Queue - empty");
			returnResults++;
        }

        // show Queue size after 1 remove
        displayQueueSize("Display Queue size after 1 remove", myGenericQueue,
                (testDataAdd.length - checkItem));

        // remove all
        System.out.println("\n===========\n<<Start removing:");
        while (myGenericQueue.size() > 0) {
            System.out.print("About to remove...");
            // remove 1 item
            try {
				itemPeeked = myGenericQueue.peek();
				// display 1 item
				System.out.print("...peek: <" + itemPeeked
						+ "> exp:{" + testDataAdd[checkItem]
						+ "} \tsize: " + myGenericQueue.size());
				if (itemPeeked.equals(testDataAdd[checkItem])) {
					System.out.println(" -good");
				} else {
					System.out.println(" exp:" + testDataAdd[checkItem] + "\t\t<=== issue");
					returnResults++;
				}
                itemRemoved = myGenericQueue.remove();
                // display 1 item
                System.out.print("...removed: <" + itemRemoved
                        + "> exp:{" + testDataAdd[checkItem]
                        + "} \tsize: " + myGenericQueue.size());
                if (itemRemoved.equals(testDataAdd[checkItem])) {
                    System.out.println(" -good");
                } else {
                    System.out.println(" exp:" + testDataAdd[checkItem] + "\t\t<=== issue");
					returnResults++;
                }
                checkItem++;
            } catch (EmptyQueue e) {
                System.out.println("Can't remove from Queue - empty");
				returnResults++;
            }

        }
        System.out.println("Stopped removing>>\n===========");

        // show Queue size after removing  all
        displayQueueSize("Display Queue size after remove all", myGenericQueue,
                (testDataAdd.length - checkItem));

        System.out.print("\nattempt to peek at an item from an empty Queue:\npeek?");
        try {
            itemPeeked = myGenericQueue.peek();
            // display 1 item
            System.out.println("...peeked: <" + itemPeeked
                    + "> expected EmptyQueue Exception"
                    + " \tsize: " + myGenericQueue.size() + "\t\t<==issue");
			returnResults++;
        } catch (EmptyQueue e) {
            System.out.println("Can't peek  - EmptyQueue exception  -good");
        }

        System.out.print("\nattempt to remove 1 item from an empty Queue:\nremove?");
        try {
            itemRemoved = myGenericQueue.remove();
            // display 1 item
            System.out.println("...removed: <" + itemRemoved
                    + "> expected EmptyQueue Exception"
                    + " \tsize: " + myGenericQueue.size() + "\t\t<==issue");
			returnResults++;
        } catch (EmptyQueue e) {
            System.out.println("Can't remove  - EmptyQueue exception  -good");
        }

        // show Queue size after 1 pop
        displayQueueSize("Display Queue size after 1 remove", myGenericQueue, 0);

        // add 1 item
        myGenericQueue.add(additionalItemToAdd);

        // show queue size after 1 additional push
        displayQueueSize("Display queue size after 1 additional add", myGenericQueue, 1);

        System.out.print("\nremove the additional item");

        // remove 1 item
        try {
			itemPeeked = myGenericQueue.peek();
            // display 1 item
            System.out.print("...peek: <" + itemPeeked
                    + "> exp:{" + additionalItemToAdd
                    + "} \tsize: " + myGenericQueue.size());
            if (itemPeeked.equals(additionalItemToAdd) && myGenericQueue.size() == 1) {
                System.out.println(" -good");
            } else {
                System.out.println(" exp:" + additionalItemToAdd + "\t\t<=== issue");
				returnResults++;
            }
            itemRemoved = myGenericQueue.remove();
            // display 1 item
            System.out.print("...removed: <" + itemRemoved
                    + "> exp:{" + additionalItemToAdd
                    + "} \tsize: " + myGenericQueue.size());
            if (itemRemoved.equals(additionalItemToAdd) && myGenericQueue.size() == 0) {
                System.out.println(" -good");
            } else {
                System.out.println(" exp:" + checkItem + "\t\t<=== issue");
				returnResults++;
            }
        } catch (EmptyQueue e) {
            System.out.println("Can't remove from queue - empty\t\t<=== Issue");
			returnResults++;
        }

        // show queue size after 1 additional remove
        displayQueueSize("Display queue size after 1 remove", myGenericQueue, 0);
		
        System.out.print("\n\nResults of all Queue tests:\t " + returnResults);
        if (returnResults == 0) {
            System.out.println("--Good");
        } else {
            System.out.println("<---------issue(s)");
        }
		
    }

    /**
     * the displayBag method displays the Queue size
     *
     * @param heading a String to display before the Queue size
     * @param aBag the Queue to display the size from
     * @param expected value for the expected size of the queue
     */
    private void displayQueueSize(String heading, Queue<E> aQueue, int expected) {
        System.out.println("\n" + heading);
        System.out.print("Size: " + aQueue.size());
        if (expected == aQueue.size()) {
            System.out.println(" -good");
        } else {
            System.out.println(" exp: " + expected + "\t\t<=== issue");
        }

    }

    public static void main(String[] args) {
        System.out.println("Don't run this file...run RunTestQueueWithCarV3.java");
    }
}

/*
Expected Output:

 */
