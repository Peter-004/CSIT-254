// STB Removed - package XXX;

import java.util.Arrays;
import java.util.Scanner;

/**
 * UI for Lab for Ch 14A - let's walk around the house
 * This program is partially written...you will complete the program
 * *** for this Lab, only change THIS file
 * @author Stephen T. Brower - modified by Opemipo Adebayo Peter
 */
public class UndirectedNonWeightedGraphHouseS24 {

    public static void main(String[] args) {
        int currentVertex, userChoice;
        Scanner input = new Scanner(System.in);
        
        // constants so it's easier to refer to room numbers
        final int KITCHEN = 0;
        final int PANTRY = 1;
        final int DINING_ROOM = 2;
        final int BACK_FOYER = 3;
        final int FRONT_FOYER = 4;
        final int STUDY = 5;
        final int LIVING_ROOM = 6;
        final int STAIRS = 7;
        final int UPSTAIRS_HALLWAY = 8;
        
        final int GUESTROOM = 9;
        final int TRAINING_ROOM = 10;
        final int GYM = 11;
        final int LIVING_ROOM_2 = 12;
        final int KIDS_LIVING_ROOM = 13;
        // ^^^ add 5 additional rooms ^^
        // *******************************************
        

        // create graph using Author's Graph
        Graph myGraph = new Graph(14);
        //                       ^^^change 9 to represesent correct # of rooms

        // put labels on 'rooms'
        myGraph.setLabel(KITCHEN, "Kitchen");
        myGraph.setLabel(PANTRY, "Pantry");
        myGraph.setLabel(DINING_ROOM, "Dining Room");
        myGraph.setLabel(BACK_FOYER, "Back Foyer");
        myGraph.setLabel(FRONT_FOYER, "Front Foyer");
        myGraph.setLabel(STUDY, "Study");
        myGraph.setLabel(LIVING_ROOM, "Living Room");
        myGraph.setLabel(STAIRS, "Stairway");
        myGraph.setLabel(UPSTAIRS_HALLWAY, "Hallway");

        myGraph.setLabel(GUESTROOM,"Guest room");
        myGraph.setLabel(TRAINING_ROOM,"Training room");
        myGraph.setLabel(GYM,"Gym");
        myGraph.setLabel(LIVING_ROOM_2,"Living Room 2");
        myGraph.setLabel(KIDS_LIVING_ROOM,"Kid's living room");
        // ^^^ add room labels for the 5 additional rooms ^^^
        // **************************************************

        // connect rooms using edges 
        // (the initial undirected Graph has 7 edges, so there are 14 edges)
        myGraph.addEdge(KITCHEN, PANTRY);
        myGraph.addEdge(PANTRY, KITCHEN);

        myGraph.addEdge(PANTRY, DINING_ROOM);
        myGraph.addEdge(DINING_ROOM, PANTRY);

        myGraph.addEdge(DINING_ROOM, FRONT_FOYER);
        myGraph.addEdge(FRONT_FOYER, DINING_ROOM);

        myGraph.addEdge(KITCHEN, BACK_FOYER);
        myGraph.addEdge(BACK_FOYER, KITCHEN);

        myGraph.addEdge(BACK_FOYER, FRONT_FOYER);
        myGraph.addEdge(FRONT_FOYER, BACK_FOYER);

        myGraph.addEdge(FRONT_FOYER, LIVING_ROOM);
        myGraph.addEdge(LIVING_ROOM, FRONT_FOYER);

        myGraph.addEdge(BACK_FOYER, STUDY);
        myGraph.addEdge(STUDY, BACK_FOYER);

        myGraph.addEdge(FRONT_FOYER, STAIRS);
        myGraph.addEdge(STAIRS, FRONT_FOYER);

        myGraph.addEdge(STAIRS, UPSTAIRS_HALLWAY);
        myGraph.addEdge(UPSTAIRS_HALLWAY, STAIRS);

        //New edges for rooms below:
        myGraph.addEdge(UPSTAIRS_HALLWAY, LIVING_ROOM_2);
        myGraph.addEdge(LIVING_ROOM_2, UPSTAIRS_HALLWAY);

        myGraph.addEdge(LIVING_ROOM_2, GUESTROOM);
        myGraph.addEdge(GUESTROOM, LIVING_ROOM_2);

        myGraph.addEdge(LIVING_ROOM_2, KIDS_LIVING_ROOM);
        myGraph.addEdge(KIDS_LIVING_ROOM, LIVING_ROOM_2);

        myGraph.addEdge(LIVING_ROOM_2, GYM);
        myGraph.addEdge(GYM, LIVING_ROOM_2);

        myGraph.addEdge(GYM, TRAINING_ROOM);
        myGraph.addEdge(TRAINING_ROOM, GYM);

        // ^^^ add connections to connect your additional rooms^^^
        // *******************************************************
        
        // let's pretend we are in FRONT_FOYER
        currentVertex = FRONT_FOYER;

        //display the current vortex
        System.out.println("\nYou are currently in room "
                + currentVertex + "-" + myGraph.getLabel(currentVertex));

        // display our neighbors
        System.out.println("neighbors of " + currentVertex + "-" +
                myGraph.getLabel(currentVertex) + " are:");

        for (int neighbor : myGraph.neighbors(currentVertex)) {
            System.out.printf("%2d-%s\n", neighbor, myGraph.getLabel(neighbor));
        }
        System.out.println();

        // suppose I was interacting with user, (hey, I am)
        // I will ask for their choice
        System.out.print("\nWhere would you like to go? (-1 to exit): ");
        userChoice = input.nextInt();

        while(userChoice != -1 || userChoice >= myGraph.size()){
            if(userChoice>13 || userChoice < -1){
                System.out.println("The entry is not valid. Retry...");
            }
            else {
                // if their choice is a valid neighbor
                if (myGraph.isEdge(currentVertex, userChoice)) {
                    // then move to new vertex
                    // hint: change currentVertex to userChoice
                    currentVertex = userChoice;
                    // display the current vertex

                    System.out.println("\nYou are currently in room "
                            + currentVertex + "-" + myGraph.getLabel(currentVertex));

                    // display our neighbors
                    System.out.println("neighbors of " + currentVertex + "-" +
                            myGraph.getLabel(currentVertex) + " are:");

                    for (int neighbor : myGraph.neighbors(currentVertex)) {
                        System.out.printf("%2d-%s\n", neighbor, myGraph.getLabel(neighbor));
                    }
                    System.out.println();
                } else // report the vertex they entered is unreachable
                {
                    System.out.println("\nYou can't go to " + userChoice
                            + "-" + myGraph.getLabel(userChoice)
                            + " from " + currentVertex
                            + "-" + myGraph.getLabel(currentVertex));
                }
            }
            System.out.print("\nWhere would you like to go? (-1 to exit): ");
            userChoice = input.nextInt();
        }
        // <-- might be a good place for the top of a loop
        System.out.println("Good bye!");
    }

}
