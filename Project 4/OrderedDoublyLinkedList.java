// STB removed: package csit254pl05genericordereddoublylinkedlists24;

/**
 * OrderedDoublyLinkedList for Prog Lab 05
 * @author Opemipo Adebayo
 */
public class OrderedDoublyLinkedList<E extends Comparable<E>> {

    // declare fields here ( private )
    private DoublyLinkedNode<E> head;
    private DoublyLinkedNode<E> tail;
    private int numElements;

    /**
     * Constructor
     */
    public OrderedDoublyLinkedList(){
        head = null;
        tail = null;
        numElements = 0;
    }

    // methods here - iterator() is provided at the bottom

    /**
     * size() method tells the size or num of elements in the list
     * @return the numElements i.e the num of elements in the list
     */
    public int size(){
        return numElements;
    }

    /**
     *add method adds a new element to the DoublyLinkedList
     * @param newElement the element to be added to the DoublyLinkedList
     */
    public void add(E newElement) {
        DoublyLinkedNode<E> cursor = head;
        DoublyLinkedNode<E> previous = null;
        //if the list is empty
        if (tail == null) {
            head = new DoublyLinkedNode(newElement, null, null);
            tail = head;
        }
        else {
            boolean inserted = false;
            //while loop to loop through the list of nodes
            while (cursor != null && !inserted) {
                //if the element to be added is less than the cursor, then it's found its place
                if (newElement.compareTo(cursor.getData()) <= 0) {
                    //if it is at the beginning of the list, then the newElement has to be the new head
                    if (cursor == head) {
                        head = new DoublyLinkedNode(newElement, head, null);
                    } else {
                        //previous.setNext(new DoublyLinkedNode(newElement, cursor, previous));
                        previous.setNext(new DoublyLinkedNode(newElement, cursor, previous));
                    }
                    inserted = true;
                } else {
                    previous = cursor;
                    cursor = cursor.getNext();
                }
            }
            //if it hasn't found its place after the loop,then it belongs at the tail
            if (!inserted) {
                //current tail as to move for the new tail;
                tail.setNext(new DoublyLinkedNode(newElement, null, tail));
                //set the new tail now to the newElement node
                tail = tail.getNext();
            }
        }
        numElements++;
    }

    /**
     * exists method checks if a target exists
     * @param target the String element to be checked
     * @return the true or false if it exists
     */
    public boolean exists(E target){
        boolean found = false;
        DoublyLinkedNode cursor = head;
        while(cursor != null && !found){
            if(cursor.getData().equals(target)){
                found = true;
            }
            else{
                cursor = cursor.getNext();
            }
        }
        return found;
    }

    /**
     * countOccurrence counts the number of times a String appears
     * @param target the String element to be counted
     * @return the number of times a String appears in the StringLinkedBag
     */
    public int countOccurrences(E target){
        int count = 0;
        DoublyLinkedNode<E> cursor = head;
        while(cursor != null){
            if(cursor.getData().equals(target)){
                count++;
                cursor = cursor.getNext();
            }
            else{
                cursor = cursor.getNext();
            }
        }
        return count;
    }

    /**
     * remove method removes a node from the list
     * @param target the String element to be removed
     * @return if the node was actually removed
     */
    public boolean remove(E target){
        DoublyLinkedNode<E> cursor = head, previous = null;
        boolean found = false;

        while (cursor!= null && !found) {
            if (cursor.getData().equals(target))
                found = true;
            else {
                previous = cursor;
                cursor = cursor.getNext();
            }
        }
        if(found && cursor != null){
            if(previous == null)
                head = head.getNext( );
            else
                previous.setNext(cursor.getNext( ));
            if(tail == cursor) {
                tail = previous;
            }
            numElements--;
        }
        return found;
    }

    /**
     * the iterator method "copies" the linked list and passes the
     * copied linked list to a new Lister
     *
     * @return a Lister using a copy of the linked list
     */
    public DoublyLinkedLister<E> iterator() {
        // declare variables
        DoublyLinkedNode<E> headOfListToReturn; // beginning of new "copied" list
        DoublyLinkedNode<E> cursorOfListToCopy; // active node of list to copy
        DoublyLinkedNode<E> lastNodeOfListToReturn; // end of new "copied" list

        // establish the copied list
        headOfListToReturn = null;

        if (head != null) {
            // create the head of the new list
            headOfListToReturn = new DoublyLinkedNode<E>(head.getData(), null, null);
            // use lastNodeOfListToReturn as a pointer to the last node in the copied list
            lastNodeOfListToReturn = headOfListToReturn;
            /* for debugging:
            if (head == tail)
                System.out.println("T: "+head.getData());
             */
            // use currentCursor as the pointer to the existing list
            cursorOfListToCopy = head.getNext();
            // if we have a node...
            while (cursorOfListToCopy != null) {
                // create a new node from the end of the new list
                lastNodeOfListToReturn.setNext(new DoublyLinkedNode<E>(cursorOfListToCopy.getData(), null, null));
                // move lastNodeOfListToReturn to the new last node
                lastNodeOfListToReturn = lastNodeOfListToReturn.getNext();
                /* for debugging:
                if (cursorOfListToCopy == tail)
                    System.out.println("T: "+cursorOfListToCopy.getData());
                 */
                // move the cursorOfListToCopy to the next node
                cursorOfListToCopy = cursorOfListToCopy.getNext();
            }
        }
        return new DoublyLinkedLister<E>(headOfListToReturn);
    }
    
    /**
     * the iteratorBackwards method "copies" the linked list backwards and passes the
     * backwards copied linked list to a new Lister
     *
     * @return a Lister using a copy of the linked list
     */
    public DoublyLinkedLister<E> iteratorBackwards() {
        // declare variables
        DoublyLinkedNode<E> headOfListToReturn; // beginning of new "copied" list
        DoublyLinkedNode<E> cursorOfListToCopy; // active node of list to copy
        DoublyLinkedNode<E> lastNodeOfListToReturn; // end of new "copied" list

        // establish the copied list
        headOfListToReturn = null;

        if (tail != null) {
            // create the head of the new list from the ail
            headOfListToReturn = new DoublyLinkedNode<E>(tail.getData(), null, null);
            // use lastNodeOfListToReturn as a pointer to the last node in the copied list
            lastNodeOfListToReturn = headOfListToReturn;
            /* for debugging:
             if (head == tail)
             System.out.println("T: "+head.getData());
             */
            // use currentCursor as the pointer to the existing list
            cursorOfListToCopy = tail.getPrevious();
            // if we have a node...
            while (cursorOfListToCopy != null) {
                // create a new node from the end of the new list
                lastNodeOfListToReturn.setNext(new DoublyLinkedNode<E>(cursorOfListToCopy.getData(), null, null));
                // move lastNodeOfListToReturn to the new last node
                lastNodeOfListToReturn = lastNodeOfListToReturn.getNext();
                /* for debugging:
                 if (cursorOfListToCopy == tail)
                 System.out.println("T: "+cursorOfListToCopy.getData());
                 */
                // move the cursorOfListToCopy to the next node
                cursorOfListToCopy = cursorOfListToCopy.getPrevious();
            }
        }
        return new DoublyLinkedLister<E>(headOfListToReturn);
    }



}
