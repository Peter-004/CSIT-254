import java.util.Scanner;

/**
 * The driver for Project 4
 * @author Opemipo Adebayo Peter
 */
public class Project4Driver {
    public static void main(String[] args) throws EmptyQueue {
        HouseGraph hGraph = new HouseGraph();
        /*
        For the driver, when you enter a location:
Display the location
check to see if there are items at the location. If there are items there, grab an item and add it
to your inventory and return the number of items at the location. If there aren’t items there say
so.
Display the current inventory from the BSTree
Display the neighbors (similar to Lab Ch 14 but more similar to displaying the list of objects from
Project 2 [ creating a Lister<Location> and use .hasNext() loop ]
Get the user’s choice
(for this project you can assume the user will enter a valid integer, it just might not be in range)
Validate the choice, and if valid, change currentVertex
        */
        int choice = 0;
        Scanner input = new Scanner(System.in);
        Location currentVertex = hGraph.getHomeLocation();
        BSTree<Shotgun> inventory = new BSTree<>();
        while(choice!= -1){
            if(currentVertex.numItems()>0){
                Shotgun berlin = currentVertex.grabItem();
                System.out.printf("You are currently in room %s %ngrabbed <%s> %d shotgun(s) remaining here",
                        currentVertex.getDescription(),berlin,currentVertex.numItems());
                inventory.add(berlin);
                System.out.println("\n\nYour inventory is: ");
                inventory.printTree();
                DoublyLinkedLister<Location> lister = currentVertex.neighbors();

                System.out.printf("\nneighbors of %s are: %n",currentVertex.getDescription());
                for(int i = 1;lister.hasNext();i++){
                    System.out.printf("%d-%s ",i,lister.next());
                }
                System.out.println("\nWhere do you want to go to? (-1 to exit)");
                choice = input.nextInt();
                if(choice > currentVertex.numNeighbors() || choice < -1){
                    System.out.println("Oops, This is not a neighbour try again");
                }
                else{
                    DoublyLinkedLister<Location> lister1 = hGraph.neighbors(currentVertex);
                    for(int i = 1;lister1.hasNext();i++){
                        //System.out.printf("%d-%s ",i,lister1.next());
                        Location newVertex = lister1.next();
                        if(choice == i)currentVertex = newVertex;
                    }
                }
                //change the currentVertex to the choice selected
            }
            else{
                System.out.printf("You are currently in room %s %nNo shotgun here",
                        currentVertex.getDescription());
                System.out.println("\n\nYour inventory is: ");
                inventory.printTree();
                DoublyLinkedLister<Location> lister = currentVertex.neighbors();

                System.out.printf("\nneighbors of %s are: %n",currentVertex.getDescription());
                for(int i = 1;lister.hasNext();i++){
                    System.out.printf("%d-%s ",i,lister.next());
                }
                System.out.println("\nWhere do you want to go to? (-1 to exit)");
                choice = input.nextInt();
                if(choice > currentVertex.numNeighbors() || choice < -1){
                    System.out.println("Oops, This is not a neighbour try again");
                }
                else{
                    DoublyLinkedLister<Location> lister1 = hGraph.neighbors(currentVertex);
                    for(int i = 1;lister1.hasNext();i++){
                        //System.out.printf("%d-%s ",i,lister1.next());
                        Location newVertex = lister1.next();
                        if(choice == i)currentVertex = newVertex;
                    }
                }
            }
        }
        System.out.println("Goodbye");
    }
}
