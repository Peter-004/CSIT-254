// STB removed: package csit254proglabch03stringbags24;

import java.util.Scanner;

/**
 * Modified "A hint for Project 2" to have the user maintain a 
 * collection using the OrderedDoublyLinkedList class.
 *
 * @author Stephen Brower, modified by OpemipoAdebayo					<-- your name here
 */
public class UsingOrderedDoublyLinkedListS24 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
		// declare variables
		
        String usersChoice, gunEntered;	// for menu choice and for the fruit entered by the user
        double damageEntered;
        int accuracyEntered;
        Shotgun shotty;

        Scanner input = new Scanner(System.in); // Scanner object to get data from the user

        // create a default sized list
        OrderedDoublyLinkedList<Shotgun> oneTaps = new OrderedDoublyLinkedList<>();
	
        /* ^^^ if this was project 2, the Linked List would be declared here
           see TestSinglyLinkedListV4 for the declaraton of the carList */
        
        System.out.println("Prog Lab 03 - using OrderedDoublyLinkedList to maintain a collection of guns\n");

        do {
			
            // if this was project 2, the following would be the menu of the choices
			
			// display menu
            System.out.print("\nEnter choice (A=Add, R=Remove, F=Find, "
                    + "D=Display, X=Quit): ");
            usersChoice = input.nextLine(); // get users choice

            /* yes, the following can be a switch, but historically, students that 
               wrote a switch at 11:00 pm on the night the project was due, 
               missed a break in the switch and worlds collided or took a 
               suggestion from NetBeans and ended up with 'rule switch'
               and then changed the wrong thing and worlds collided...
            
               My advice...if you are reading this late at night 
               on the night that Project 2 is due, keep the if...else if...else
            */
            
            if (usersChoice.equalsIgnoreCase("Q")) {
				
                System.out.println("\nBye bye!\n");
				
            } else if (usersChoice.equalsIgnoreCase("A")) {
				
                System.out.print("\nEnter gunName to add: ");
                gunEntered = input.nextLine();
                System.out.print("\nEnter the damage: ");
                damageEntered = input.nextDouble();
                System.out.print("\nEnter the accuracy: ");
                accuracyEntered = input.nextInt();
                input.nextLine();
                shotty = new Shotgun(gunEntered,damageEntered,accuracyEntered);

                oneTaps.add(shotty);
				
                /* if this was project 2, and this was the logic for Add, prompt the user for
                   the attributes of the class then instantiate the object in the
                   call to the add method */
				   
            } else if (usersChoice.equalsIgnoreCase("F")) {

                System.out.print("\nEnter gunName to find: ");
                gunEntered = input.nextLine();
                System.out.print("\nEnter the damage: ");
                damageEntered = input.nextDouble();
                System.out.print("\nEnter the accuracy: ");
                accuracyEntered = input.nextInt();
                input.nextLine();
                Shotgun shorty = new Shotgun(gunEntered,damageEntered,accuracyEntered);

                if ( oneTaps.exists(shorty)) {
                    System.out.print("\n" + gunEntered + " exists! and it is there: " +
										oneTaps.countOccurrences(shorty) + " time(s)\n");
		        } else {
                    System.out.print("\n" + gunEntered + " does not exist in the list!\n");
		        }
				
                /* if this was project 2, see bottom of file for logic for find and remove */
				   
            } else if (usersChoice.equalsIgnoreCase("R")) {
                System.out.print("\nEnter gunName to remove: ");
                gunEntered = input.nextLine();
                System.out.print("\nEnter the damage: ");
                damageEntered = input.nextDouble();
                System.out.print("\nEnter the accuracy: ");
                accuracyEntered = input.nextInt();
                input.nextLine();
                shotty = new Shotgun(gunEntered,damageEntered,accuracyEntered);
                boolean removed = oneTaps.remove(shotty);
                if(removed){
                    System.out.println(gunEntered+ " was removed");
                }
                else{
                    System.out.println("It was not removed. It may not be in the list");
                }
				
				/* For Prog Lab Ch 03, see the bottom of file for logic for remove and peek at find, above */
                				
                /* if this was project 2, see bottom of file for logic for remove )*/
				   
            } else if (usersChoice.equalsIgnoreCase("D")) {
				
               // display oneTaps
               displayList("\noneTaps",oneTaps); // static method (below) for displaying bag, capacity and size
                
                /* if this was project 2, and this was Display List, call a 
                   static method like displayLinkedListCarAndSize in
                   TestSinglyLinkedListV4 from the Lab for Ch 5 */
				   
            } else { // trailing else
				
                System.out.println("\nyou entered an invalid choice");
            }

        } while (!(usersChoice.equalsIgnoreCase("Q")));
    } // end main method
	
    /**
     * the displayList method displays the OrderedDoublyLinkedList
     *
     * @param heading a String to display before the bag
     * @param aBag the OrderedDoublyLinkedList to display
     */
    public static void displayList(String heading, OrderedDoublyLinkedList<Shotgun> aBag) {
		// display heading
        System.out.println(heading);
		// display capacity and size
        System.out.print("cap=" + aBag.size() + " n=" + aBag.size() + " Bag: ");

        if (aBag.size() == 0) {
            System.out.println("Empty");//: Double Check if empty [ " + aBag + "]");
        } else {
            //System.out.println("Not Empty: Check [ " + aBag + "]");
            DoublyLinkedLister<Shotgun> stringLister = aBag.iterator();
            System.out.print("{");
            while (stringLister.hasNext()) {
                Shotgun displayString = stringLister.next();
                System.out.print("(" + displayString.getName()+","+displayString.getDamage() +","+displayString.getAccuracy()+ ")");
                if (stringLister.hasNext()) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            System.out.println();

        }


    }

} // end class

/* The logic of the Remove: prompt the user for the attributes of the class 
   then instantiate the object in the call to the remove which is 
   in an if statement:    
         if ( linkedList.remove(new ClassName(param1,param2...))) 
             System.out.print("removed");
         else
             System.out.print("not removed");
*/

/* The logic of the Find is the same as the logic of the remove */

/* :) */