package csit254pl06stacksqueuess24;

/**
 *
 * @author Opemipo Adebayo
 */
public class Stack<E> {
    private DoublyLinkedNode<E> top;
    private int numElements;

    /**
     * no args
     * the constructor Stack
     */
    public Stack(){
        top = null;
        numElements = 0;
    }
    /**
     * push method adds a new element to the top of the stack
     * @param element the element to be added
     */
    public void push(E element){
        top = new DoublyLinkedNode<E>(element,top,null);
        numElements++;
    }
    /**
     * pop method removes, if possible, the last item in the stack
     * @return the item removed
     * @throws EmptyStack if the stack is empty
     */
    public E pop() throws EmptyStack{

            E returnValue;
            if (top == null)
                throw new EmptyStack();
            else {
                returnValue = top.getData();
                top = top.getNext();
                numElements--;
            }
        return returnValue;
    }
    /**
     * peek method looks at the frontal element in the stack
     * @return the item at the front of the stack
     * @throws EmptyStack if the stack is empty
     */
    public E peek() throws EmptyStack{
        if(top != null){
            return top.getData();
        }
        else{
            throw new EmptyStack();
        }
    }
    /**
     * size method returns the num of elements present in the stack
     * @return the numElements in the stack
     */
    public int size(){
        return numElements;
    }
}
