import java.util.*;

/**
 * @author Opemipo Adebayo
 */
public class StringNode {
    private String data;
    private StringNode next;

    /**
     * Constructor StringNode instantiates a new StringNode object
     * @param initialData the value for the node's data
     * @param initialNext the value for the next node.
     */
    public StringNode(String initialData, StringNode initialNext){
        data = initialData;
        next = initialNext;
    }

    /**
     * getData method gets/returns the current value in the data field
     * @return the value for the data
     */
    public String getData(){
        return data;
    }

    /**
     * getNext method gets/returns the current value in the next field
     * @return the value for next
     */
    public StringNode getNext(){
        return next;
    }

    /**
     * setData method sets a new value for the data field
     * @param newData the new value for the data field
     */
    public void setData(String newData){
        data = newData;
    }

    /**
     * setNext method sets a new value for the next field
     * @param newNext the new value for the next field
     */
    public void setNext(StringNode newNext){
        next = newNext;
    }
}
