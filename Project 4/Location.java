/**
 * @author Opemipo Adebayo Peter
 */
public class Location implements Comparable<Location>{
    private String description;
    private OrderedDoublyLinkedList<Location> neighbors;
    private Queue<Shotgun> itemsAtLocation;

    /**
     * Constructor for Location
     * @param location the initial description of the location
     */
    public Location(String location){
        description = location;
        neighbors = new OrderedDoublyLinkedList<>();
        itemsAtLocation = new Queue<>();
    }

    /**
     * getDescription method returns the description
     * @return the description of the location or the name
     */
    public String getDescription(){
        return description;
    }

    /**
     * isNeighbor method verifies if two locations are neighbors
     * @param otherLocation
     * @return
     */
    public boolean isNeighbor(Location otherLocation){
        boolean gojo;
        gojo = neighbors.exists(otherLocation);
        return gojo;
    }

    /**
     * compareTo method compares for equality and inequality between locations
     * @param otherLocation the object to be compared.
     * @return -1,1, or 0
     */
    public int compareTo(Location otherLocation){
        return description.compareTo(otherLocation.getDescription());
    }

    /**
     * equals method checks if two locations are equal
     * @param otherLocation the other location to be checked
     * @return true or false based on the description of the method
     */
    public boolean equals(Location otherLocation){
        boolean gojo = false;
        if(description.equals(otherLocation.description)){
           gojo = true;
        }
        return gojo;
    }

    /**
     * addItem method adds an item to the location
     * @param gun the item to be added
     */
    public  void addItem(Shotgun gun){
        itemsAtLocation.add(gun);
    }

    /**
     * addNeighbor method adds a new neighbor to the list
     * @param newNeighbor the newighbor to be added
     */
    public void addNeighbor(Location newNeighbor){
        neighbors.add(newNeighbor);
    }

    /**
     * grabItem method removes an object from the itemsAtLocation Queue
     * @return the first item on the queue
     */
    public Shotgun grabItem() throws EmptyQueue{
        return itemsAtLocation.remove();
    }

    /**
     * numItems method returns the size of the queue
     * @return the size of the queue
     */
    public int numItems(){
        return itemsAtLocation.size();
    }

    /**
     * numNeighbor method returns the number of neighbors
     * @return the size of the neighbors list
     */
    public int numNeighbors(){
        return neighbors.size();
    }

    /**
     * neighbors returns the lister from the neighbors list
     * @return the lister from the linked list
     */
    public DoublyLinkedLister<Location> neighbors(){
        return neighbors.iterator();
    }

    /**
     * toString method overrides and turns the location into a String
     * @return a String detailing the Location
     */
    public String toString(){
        String s = description;
        return s;
    }
}
