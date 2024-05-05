// STB - removed: package xxx;

/**
 *
 * @author Opemipo Adebayo
 */
public class BSTree<E extends Comparable<E>> {
    //field declarations
    private BSTNode<E> root;
    private int numItems;

    /**
     *The BST constructor
     */
    public BSTree(){
        root = null;
        numItems = 0;
    }

    /**
     *add method adds an element to the BST
     * @param element to be added to the BST
     */
    public void add(E element){
        if(root == null){
            root = new BSTNode<E>(element, null,null);
        }
        else{
            BSTNode<E> cursor = root;
            boolean added = false;
            while(!added){
                if(element.compareTo(cursor.getData()) <= 0){
                    if(cursor.getLeft() == null){
                        cursor.setLeft(new BSTNode<>(element,null,null));
                        added = true;
                    }
                    else{
                        cursor = cursor.getLeft();
                    }
                }
                //right child node
                else{
                    if(cursor.getRight() == null){
                        cursor.setRight(new BSTNode<>(element, null,null));
                        added = true;
                    }
                    else{
                        cursor = cursor.getRight();
                    }
                }
            }
        }
        numItems++;
    }

    /**
     *exists method checks the existence of an element in a BST
     * @param target the element to be checked for existence
     * @return whether the element exists in the tree or not
     */
    public boolean exists(E target){
        BSTNode<E> cursor = root;
        boolean alive = false;
        while(cursor != null && !alive){
            if(cursor.getData().equals(target))alive = true;
            if(target.compareTo(cursor.getData()) > 0){
                cursor = cursor.getRight();
            }
            else{
                cursor = cursor.getLeft();
            }
        }
        return alive;
    }

    /**
     * remove an element in the BST
     * @param target the data to be removed
     * @return if it was removed or not
     */
    public boolean remove(E target){
        BSTNode<E> cursor = root;
        BSTNode<E> parent = null;
        boolean alive = false;
        while(cursor != null && !alive){
            if(cursor.getData().equals(target)){
                alive = true;
                numItems--;
            }
            else if(target.compareTo(cursor.getData()) > 0){
                parent = cursor;
                cursor = cursor.getRight();
            }
            else{
                parent = cursor;
                cursor = cursor.getLeft();
            }
        }

        if(cursor == null){
            alive = false;
        }
        else if(cursor == root && cursor.getLeft() == null){
            root = cursor.getRight();
        }
        else if(cursor != root && cursor.getLeft() == null){
            if(cursor == parent.getLeft())
                parent.setLeft(cursor.getRight());
            else{
                parent.setRight(cursor.getRight());
            }
        }
        else{
            BSTNode<E> leftSub = cursor.getLeft();
            cursor.setData(leftSub.getRightmostData());
            cursor.setLeft(leftSub.removeRightmost());
        }
        return alive;
    }

    /**
     * countOccurrences counts the number of times a data in the tree appears
     * @param target to be counted
     * @return the count
     */
    public int countOccurrences(E target){
        int count = 0;
        BSTNode<E> cursor = root;
        while(cursor != null){
            if(cursor.getData() == target)count++;
            if(target.compareTo(cursor.getData()) > 0){
                cursor = cursor.getRight();
            }
            else{
                cursor = cursor.getLeft();
            }
        }
        return count;
    }

    /**
     *size method returns the capacity of the tree
     * @return the number of items in the tree
     */
    public int size(){
        return numItems;
    }

    /**
     * The printTree method calls the inorderPrint on the root.
     */
    public void printTree() {
        if (root != null) {
            root.inorderPrint();
        } else {
            System.out.println("empty");
        }
    }
}
