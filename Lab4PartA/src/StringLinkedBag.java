// STB removed: package csit254proglabch04bstringlinkedbags24;

/**
 *
 * @author Opemipo Adebayo
 */
public class StringLinkedBag {
    
    // declare fields here ( private )
    private StringNode head;
    private StringNode tail;
    private int numElements;
    // write constructor here
    public  StringLinkedBag(){
        head = null;
        tail = null;
        numElements = 0;
    }

    // methods here - iteratorPrototype() is provided at the bottom

    /**
     *getSize returns the size of the StringLinkedBag
     * @return the number of elements in the StringLinkedBag
     */
    public int getSize(){
        return numElements;
    }

    /**
     *add method adds a new element to the StringLinkedBag
     * @param element the element to be added to the StringLinkedBag
     */
    public void add(String element){
        StringNode cursor = head;
        StringNode previous = null;
        if(tail == null){
            head = new StringNode(element, null);
            tail = head;
        }
        else{
            boolean inserted = false;
            while(cursor != null && !inserted){
                if(element.compareToIgnoreCase(cursor.getData())<=0){
                    numElements++;
                    if(cursor == head){
                        head = new StringNode(element, head);
                    }
                    else{
                        previous.setNext( new StringNode(element, cursor) );
                    }
                    inserted = true;
                }
                else{
                    previous = cursor;
                    cursor = cursor.getNext();
                }
            }
            if(!inserted){
                tail.setNext(new StringNode(element, null));
                tail = tail.getNext();
            }
            numElements++;
        }

        /*
        if(tail == null){
            head = new StringNode(element, null);
            tail = head;
        }
        else{
            tail.setNext(new StringNode(element, null));
            tail = tail.getNext();
        }
        numElements++;*/
    }

    /**
     * exists method checks if a target exists
     * @param target the String element to be checked
     * @return the true or false if it exists
     */
    public boolean exists(String target){
        boolean found = false;
        StringNode cursor = head;
         while(cursor != null && !found){
             if(cursor.getData().equalsIgnoreCase(target)){
                 found = true;
             }
             else{
                 cursor = cursor.getNext();
             }
         }
        return found;
    }

    /**
     *countOccurrence counts the number of times a String appears
     * @param target the String element to be counted
     * @return the number of times a String appears in the StringLinkedBag
     */
    public int countOccurrences(String target){
        int count = 0;
        StringNode cursor = head;
        while(cursor != null){
            if(cursor.getData().equalsIgnoreCase(target)){
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
     *
     * @param target the String element to be removed
     * @return whether the element can be removed or not
     */
    public boolean remove(String target){
        StringNode cursor = head, previous = null;
        boolean found = false;

        while (cursor!= null && !found) {
            if (cursor.getData().equalsIgnoreCase(target))
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
     * the iteratorPrototype method "copies" the linked list and passes the
     * copied linked list to a new ListerPrototype2
     *
     * @return a ListerPrototype2 using a copy of the linked list
     */
    public ListerPrototype2 iteratorPrototype() {
        // declare variables
        StringNode headOfListToReturn; // beginning of new "copied" list
        StringNode cursorOfListToCopy; // active node of list to copy
        StringNode lastNodeOfListToReturn; // end of new "copied" list

        // establish the copied list
        headOfListToReturn = null;

        if (head != null) {
            // create the head of the new list
            headOfListToReturn = new StringNode(head.getData(), null);
            // use lastNodeOfListToReturn as a pointer to the last node in the copied list
            lastNodeOfListToReturn = headOfListToReturn;
            // use currentCursor as the pointer to the existing list
            cursorOfListToCopy = head.getNext();
            // if we have a node...
            while (cursorOfListToCopy != null) {
                // create a new node from the end of the new list
                lastNodeOfListToReturn.setNext(new StringNode(cursorOfListToCopy.getData(), null));
                // move lastNodeOfListToReturn to the new last node
                lastNodeOfListToReturn = lastNodeOfListToReturn.getNext();
                // move the cursorOfListToCopy to the next node
                cursorOfListToCopy = cursorOfListToCopy.getNext();
            }
        }

        return new ListerPrototype2(headOfListToReturn);
    }

    
    
}
