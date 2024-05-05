// stb removed: package xxx;

/**
 *
 * @author Stephen T. Brower edited by Opemipo P Adebayo
 */
public class HouseGraph extends LinkedGraph
{
    // establish rooms
    private final Location kitchen = new Location("Kitchen");
    private final Location pantry = new Location("Pantry");
    private final Location diningRoom = new Location("Dining Room");
    private final Location backFoyer = new Location("Back Foyer");
    private final Location frontFoyer = new Location("Front Foyer");    
    private final Location study = new Location("Study");
    private final Location livingRoom = new Location("Living Room");      
    private final Location stairs = new Location("Stairs");
    private final Location upstairsHallway = new Location("Upstairs Hallway");
    
    // establish the "home" (a.k.a. "starting") location
    private final Location homeLocation = frontFoyer;
    
    /**
     * Constructor - builds a house as a LinkedGraph
     */
    public HouseGraph() {
        // add rooms to graph - first floor
        addVertex(kitchen);
        addVertex(pantry);
        addVertex(diningRoom);
        addVertex(backFoyer);
        addVertex(frontFoyer);
        addVertex(study);
        addVertex(livingRoom);

        // add rooms to graph - second floor
        addVertex(stairs);
        addVertex(upstairsHallway);

        // you can "choose" to add more rooms to the second floor
        
        // Add each edge (this undirected Graph has 7 edges,
        //                  so we add 14 edges)
        addEdge(kitchen,pantry);
        addEdge(pantry,kitchen);

        addEdge(pantry,diningRoom);
        addEdge(diningRoom,pantry);

        addEdge(diningRoom,frontFoyer);
        addEdge(frontFoyer,diningRoom);

        addEdge(kitchen,backFoyer);
        addEdge(backFoyer,kitchen);

        addEdge(backFoyer,frontFoyer);
        addEdge(frontFoyer,backFoyer);

        addEdge(frontFoyer,livingRoom);
        addEdge(livingRoom,frontFoyer);

        addEdge(backFoyer,study);
        addEdge(study,backFoyer);          
        
        // connect second floor
        addEdge(frontFoyer, stairs);
        addEdge(stairs, frontFoyer);
        
        addEdge(stairs, upstairsHallway);
        addEdge(upstairsHallway, stairs);
		
		// you can "choose" to add more rooms to the second floor
        
        // adds items to Queue at each location
		// for Project 4, use your class
        frontFoyer.addItem(new Shotgun("Lockwood360",51.4,77));
        frontFoyer.addItem(new Shotgun("Bryson419",78.9,67));
        
        livingRoom.addItem(new Shotgun("Lockwood300",88,52));
        
        diningRoom.addItem(new Shotgun("BY-16",90.0,45));
        diningRoom.addItem(new Shotgun("HSOS4",91.2,77));
        diningRoom.addItem(new Shotgun("M1014",68.9,34));
		
		study.addItem(new Shotgun("T560series",90,89));
    }
    
    /**
     * the getHomeLocation method returns "a" location as the starting point
     * @return a Location that is the "home"(starting) location
     */
    public Location getHomeLocation() {
        return homeLocation;
    }    
    
}
