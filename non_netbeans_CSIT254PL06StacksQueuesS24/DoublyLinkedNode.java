package csit254pl06stacksqueuess24;

/**
 * DoublyLinkedNode class for DoublyLinkedList...and Stacks&Queues& Probably Btrees
 * @author Opemipo Adebayo Peter
 */
public class DoublyLinkedNode<E> {
    private E data;
    private DoublyLinkedNode next;
    private DoublyLinkedNode previous;

    /**
     * Constructor Node
     * @param initialData data
     * @param initialNext next
     * @param initialPrevious previous
     */
    public DoublyLinkedNode(E initialData, DoublyLinkedNode initialNext, DoublyLinkedNode initialPrevious){
        data = initialData;
        next = initialNext;
        previous = initialPrevious;
    }

    /**
     * getData method fetches the data of the Node
     * @return a generic type containing the data
     */
    public E getData(){
        return data;
    }

    /**
     * getNext method fetches the next node
     * @return a doublylinkednode for the next
     */
    public DoublyLinkedNode getNext(){
        return next;
    }

    /**
     * getPrevious method fetches the previous node
     * @return a DoublyLinkedNode for the previous node
     */
    public DoublyLinkedNode getPrevious(){
        return previous;
    }

    /**
     * setData sets a new data for the data field of the node
     * @param newData the data of general type
     */
    public void setData(E newData){
        data = newData;
    }

    /**
     * setNext sets a new data for the data field of the node
     * @param newNext the next of general type
     */
    public void setNext(DoublyLinkedNode newNext){
        next = newNext;
    }

    /**
     * setPrevious sets a new data for the data field of the node
     * @param newPrevious the next of general type
     */
    public void setPrevious(DoublyLinkedNode newPrevious){
        previous = newPrevious;
    }
}
