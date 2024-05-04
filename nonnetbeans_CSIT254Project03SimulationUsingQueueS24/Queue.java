//STB Removed: package xxx;

/**
 *
 * @author Opemipo Adebayo
 */
public class Queue<E> {
    private DoublyLinkedNode<E> front;
    private DoublyLinkedNode<E> rear;
    private int numElements;

    /**
     * no args
     * the Constructor for Queue
     */
    public Queue(){
        front = null;
        rear = null;
        numElements = 0;
    }

    /**
     * add method adds a new element to the rear of the queue
     * @param element the element to be added
     */
    public void add(E element){
        if (rear == null) // Queue empty?
        {
            front = new DoublyLinkedNode<E>(element, null,null);
            rear = front;
        }
        else
        {
            rear.setNext(new DoublyLinkedNode<E>(element,null,rear));
            rear = rear.getNext();
        }
        //rear = new DoublyLinkedNode<>(element,null,rear);
        numElements++;
    }

    /**
     * remove method removes, if possible, the last item in the queue
     * @return the item removed
     * @throws EmptyQueue if the queue is empty
     */
    public E remove() throws EmptyQueue{
        E value;
        if (front == null) // Queue empty?
            throw new EmptyQueue();
        else {
            value = front.getData();
            if (front != rear)
                front = front.getNext();
            else // removing last node
            {
                front = null;
                rear = null;
            }
            numElements--;
        }
        return value;
    }

    /**
     * peek method looks at the frontal element in the queue
     * @return the item at the front of the queue
     * @throws EmptyQueue if the queue is empty
     */
    public E peek() throws EmptyQueue{
        if(front != null){
            return front.getData();
        }
        else{
            throw new EmptyQueue();
        }
    }

    /**
     * size method returns the num of elements present in the queue
     * @return the numElements in the queue
     */
    public int size(){
        return numElements;
    }
}
