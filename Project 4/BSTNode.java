// STB - removed: package xxx;

/**
 * BSTNode<E> class for Binary Search Tree
 * @author Opemipo Adebayo Peter
 */
public class BSTNode<E> {

    // declare fields here ( private )
    private E data;
    private BSTNode<E> left;
    private BSTNode<E> right;

    /**
     *
     * @param initialData the initial data of the node
     * @param initialLeft the left child node of the node
     * @param initialRight the right child node of the node
     */
    public BSTNode(E initialData, BSTNode<E> initialLeft, BSTNode<E> initialRight){
        data = initialData;
        left = initialLeft;
        right = initialRight;
    }

    /**
     *getData method gets the data of the node
     * @return the data
     */
    // methods here - several already provided 
    public E getData(){
        return data;
    }

    /**
     *getLeft gets the left child node
     * @return the left child node
     */
    public BSTNode<E> getLeft(){
        return left;
    }

    /**
     *getRight method gets the right child node of the current node
     * @return the right child node
     */
    public BSTNode<E> getRight(){
        return right;
    }

    /**
     *setData sets a new value for the data field of the node
     * @param newData the data to be set to.
     */
    public void setData(E newData){
        data = newData;
    }

    /**
     *setLeft sets a new value for the left child node
     * @param newLeft the left child node to be set to
     */
    public void setLeft(BSTNode<E> newLeft){
        left = newLeft;
    }

    /**
     *setRight sets a new value for the right child node
     * @param newRight the right child node to be set to
     */
    public void setRight(BSTNode<E> newRight){
        right = newRight;
    }

    /**
     * The inorderPrint method displays the tree from this node
     */
    public void inorderPrint() {
        if (left != null) {
            left.inorderPrint();
        }

        System.out.println(data);

        if (right != null) {
            right.inorderPrint();
        }
    }

    /**
     * The getLeftmostData method returns the data that is most to the left
     * (a.k.a. smallest valued node)
     *
     * @return a value of type E from the left most node.
     */
    public E getLeftmostData() {
        if (left == null) {
            return data;
        } else {
            return left.getLeftmostData();
        }
    }

    /**
     * The getRightmostData method returns the data that is most to the right
     * (a.k.a. largest valued node)
     *
     * @return a value of type E from the right most node.
     */
    public E getRightmostData() {
        if (right == null) {
            return data;
        } else {
            return right.getRightmostData();
        }
    }

    /**
     * The removeLeftmost method keeps going to the left until it cannot go left
     * anymore, then returns the link to the right node
     *
     * @return BSTNode<E> from the right child of the left most node.
     */
    public BSTNode<E> removeLeftmost() {
        if (left == null) {
            return right;
        } else {
            left = left.removeLeftmost();
            return this;
        }
    }

    /**
     * The removeRightmost method keeps going to the right until it cannot go
     * right anymore, then returns the link to the left node
     *
     * @return BSTNode<E> from the left child of the right most node.
     */
    public BSTNode<E> removeRightmost() {
        if (right == null) {
            return left;
        } else {
            right = right.removeRightmost();
            return this;
        }
    }

}
