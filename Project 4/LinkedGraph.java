/**
 * @author Opemipo Adebayo Peter
 */
public class LinkedGraph {
    private OrderedDoublyLinkedList<Location> vertexList;

    /**
     * Constructor LinkedGraph
     */
    public LinkedGraph(){
        vertexList = new OrderedDoublyLinkedList<Location>();
    }

    /**
     * addVertex method adds a vertex to a location
     * @param newVertex the new vertex to be added to the linked graph
     */
    public void addVertex(Location newVertex){
        vertexList.add(newVertex);
    }

    /**
     * size method returns the size of the graph or number of nodes
     * @return the number of nodes in the linkec graph
     */
    public int size(){
        return vertexList.size();
    }

    /**
     * addEdge method adds a new edge to the graph
     * @param source the beginning of the journey
     * @param destination the end of the journey
     */
    public void addEdge(Location source, Location destination){
        if(vertexList.exists(source) && vertexList.exists(destination)){
            source.addNeighbor(destination);
        }
    }

    /**
     * isEdge method verifies if there's a path between two nodes
     * @param source the beginning of the path
     * @param destination the end of the path
     * @return true or false whether there is a path or not
     */
    public boolean isEdge(Location source, Location destination){
        boolean edge = false;
        if(vertexList.exists(source) && vertexList.exists(destination)){
            edge = source.isNeighbor(destination);
        }
        return edge;
    }

    /**
     * neighbors method does something sha...
     * @param vertex the parameter for the method
     * @return a lister of the neighbors
     */
    public DoublyLinkedLister<Location> neighbors(Location vertex){
       return vertex.neighbors();
    }
}
