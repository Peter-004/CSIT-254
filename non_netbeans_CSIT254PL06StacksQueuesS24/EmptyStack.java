package csit254pl06stacksqueuess24;

/**
 * There is no need to change this file ( other than the package statement)
 *
 * EmptyStack exception for Stack NOTE: Java has a built-in exception for Java's
 * built-in Stack
 * https://docs.oracle.com/javase/7/docs/api/java/util/EmptyStackException.html
 * But since we are using our own Stack, we will use our own exception
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class EmptyStack extends Exception {

    /**
     * No-arg constructor
     */
    public EmptyStack() {
        super("Error: Stack is empty. cannot pop stack");
    }
}
