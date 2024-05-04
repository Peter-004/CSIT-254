// STB removed: package csit254pl05genericordereddoublylinkedlists24;

/**
 * There is no need to change this file ( other than the package statement)
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class TestOrderedDoublyLinkedListV0 {

    public static void main(String[] args) {
        int results = 0;
        // create list of Car - carList
        OrderedDoublyLinkedList<Car> carList = new OrderedDoublyLinkedList<Car>();

        // array of cars for adding to list
        Car[] arrayOfCarsToAdd1 = {new Car(2023, "Honda Accord"),
            new Car(2022, "Camry"), new Car(2023, "Explorer"),
            new Car(2022, "Zoom Zoom"), new Car(2023, "Acura")};

        // array of cars for adding to list
        Car[] arrayOfCarsToAdd2 = {new Car(2022, "Neon"),
            new Car(1965, "Shelby Mustang GT 350"),
            new Car(2022, "zOom zoOM")};

        Car extraCarToAdd = new Car(2022, "Kia Soul");

        // array of cars that should exist
        Car[] arrayOfCarsToFindExisting = {new Car(2023, "Honda Accord"),
            new Car(2022, "Camry"), new Car(2023, "Explorer"),
            new Car(2022, "Zoom Zoom"), new Car(2023, "Acura"),
            new Car(2022, "Neon"), new Car(1965, "Shelby Mustang GT 350"),
            new Car(2022, "zOom zoOM"),new Car(2022, "Kia Soul") };

        // array of cars that shouldn't exist
        Car[] arrayOfCarsToFindNonExistant = {new Car(2021, "Delorean ii"),
            new Car(1977, "Ford Pinto")};

        // array of cars to count
        Car[] arrayOfCarsToCount = {new Car(2022, "zOom zoOM"),
            new Car(2023, "Explorer"), new Car(2022, "Kia Soul"),
            new Car(2021, "Delorean ii"),
            new Car(2023, "Honda Accord")};

        // expected results of count
        int[] expectedCountResults = {2, 1, 1, 0, 1};

        Car[] arrayOfCarsToRemove = { new Car(2023, "Honda Accord"),
            new Car(2021, "Delorean ii"), new Car(2022, "Kia Soul"),
            new Car(2023, "Acura"), new Car(1977, "Ford Pinto")  };

        boolean[] expectedRemovalResults = { true, false, true, true, false};

        boolean removalResult;

        int numberOfCarsShouldBeRemoved = 0;

        for (boolean removalExpected : expectedRemovalResults)
            if (removalExpected)
                numberOfCarsShouldBeRemoved++;

        // array of cars - the final list of what should exist
        Car[] arrayOfCarsToFindFinal = {new Car(2022, "Camry"),
            new Car(2023, "Explorer"), new Car(2022, "Zoom Zoom"),
            new Car(2022, "Neon"), new Car(1965, "Shelby Mustang GT 350"),
            new Car(2022, "zOom zoOM")};


        System.out.println("======== Test OrderedDoublyLinkedList ( version 0 ) ========\n");

        // display empty carList
        results += displayLinkedListCarAndSize(carList, "carList upon startup",0);

        for (Car newCar : arrayOfCarsToAdd1) {
            System.out.print("Adding: [" + newCar.getYearModel() + " " + newCar.getMake() + "] ");
            carList.add(newCar);
            System.out.println(" size=" + carList.size());
        }

        // display carList after adds
        results += displayLinkedListCarAndSize(carList, "\ncar list after "
                + arrayOfCarsToAdd1.length + " adds", arrayOfCarsToAdd1.length);

        for (Car newCar : arrayOfCarsToAdd2) {
            System.out.print("Adding: [" + newCar.getYearModel() + " " + newCar.getMake() + "] ");
            carList.add(newCar);
            System.out.println(" size=" + carList.size());
        }

        // display carList after adds#2
        results += displayLinkedListCarAndSize(carList, "\ncar list after "
                + arrayOfCarsToAdd2.length + " adds",
                (arrayOfCarsToAdd1.length + arrayOfCarsToAdd2.length));

        carList.add(extraCarToAdd);
        // display carList after appends
        results += displayLinkedListCarAndSize(carList, "\ncar list after 1 extra add",
                (arrayOfCarsToAdd1.length + arrayOfCarsToAdd2.length + 1));

        System.out.println("\nSearch for cars - should exist [ call to exists #1]");
        for (Car carToFind : arrayOfCarsToFindExisting) {
            System.out.print("Looking for [" + carToFind.getYearModel() + " "
                    + carToFind.getMake() + "] ");
            if (carList.exists(carToFind)) {
                System.out.println(" -- it exists! - good");
            } else {
                System.out.println("\t\t\t<=== issue");
                results++;
            }
        }

        // display carList after searches
        results += displayLinkedListCarAndSize(carList, "\ncar list after calling exists #1",
                (arrayOfCarsToAdd1.length + arrayOfCarsToAdd2.length + 1));

        System.out.println("\nSearch for cars - shouldn't exist [call to exists #2]");
        for (Car carToFind : arrayOfCarsToFindNonExistant) {
            System.out.print("Looking for [" + carToFind.getYearModel() + " "
                    + carToFind.getMake() + "] ");
            if (!carList.exists(carToFind)) {
                System.out.println(" -- it doesn't exist - good");
            } else {
                System.out.println("\t\t\t<=== issue");
                results++;
            }
        }

        // display carList after searches
        results += displayLinkedListCarAndSize(carList, "\ncar list after exists #2",
                (arrayOfCarsToAdd1.length + arrayOfCarsToAdd2.length + 1));

        System.out.println("\ncount cars ");
        for (int i = 0; i < arrayOfCarsToCount.length; i++) {
            System.out.print("counting [" + arrayOfCarsToCount[i].getYearModel() + " "
                    + arrayOfCarsToCount[i].getMake() + "] <"
                    + carList.countOccurrences(arrayOfCarsToCount[i]) + ">");
            if (carList.countOccurrences(arrayOfCarsToCount[i])
                    == expectedCountResults[i]) {
                System.out.println(" - good");
            } else {
                System.out.println("\t\t\t<=== issue");
                results++;
            }

        }

        // display carList after searches
        results += displayLinkedListCarAndSize(carList, "\ncar list after count",
                (arrayOfCarsToAdd1.length + arrayOfCarsToAdd2.length + 1));

        System.out.println("\nremove cars ");
        for (int i = 0; i < arrayOfCarsToRemove.length; i++) {
            System.out.print("removing [" + arrayOfCarsToRemove[i].getYearModel() + " "
                    + arrayOfCarsToRemove[i].getMake() + "] <");
            removalResult = carList.remove(arrayOfCarsToRemove[i]);
            if (removalResult)
                System.out.print("removed>");
            else
                System.out.print("not removed>");
            if (removalResult == expectedRemovalResults[i]) {
                System.out.println(" - good");
            } else {
                System.out.println("\t\t\t<=== issue");
                results++;
            }

        }

        // display carList after removals
        results += displayLinkedListCarAndSize(carList, "\ncar list after removes",
                (arrayOfCarsToAdd1.length + arrayOfCarsToAdd2.length + 1 - numberOfCarsShouldBeRemoved));


        System.out.println("\nSearch for cars removed - shouldn't exist [call to exists #3]");
        for (int i = 0; i < arrayOfCarsToRemove.length; i++) {
            if (expectedRemovalResults[i]) {
                System.out.print("Looking for [" + arrayOfCarsToRemove[i].getYearModel() + " "
                        + arrayOfCarsToRemove[i].getMake() + "] ");
                if (!carList.exists(arrayOfCarsToRemove[i])) {
                    System.out.println(" -- removed car doesn't exist - good");
                } else {
                    System.out.println("\t\t\t<=== issue");
                    results++;
                }
            }
        }

        // display carList after searches
        results += displayLinkedListCarAndSize(carList, "\ncar list after exists #3",
                (arrayOfCarsToAdd1.length + arrayOfCarsToAdd2.length + 1 - numberOfCarsShouldBeRemoved));

        System.out.println("\nSearch for final set of cars - should exist [ call to exists #4]");
        for (Car carToFind : arrayOfCarsToFindFinal) {
            System.out.print("Looking for [" + carToFind.getYearModel() + " "
                    + carToFind.getMake() + "] ");
            if (carList.exists(carToFind)) {
                System.out.println(" -- it exists! - good");
            } else {
                System.out.println("\t\t\t<=== issue");
                results++;
            }
        }

        // display carList after searches
        results += displayLinkedListCarAndSize(carList, "\nFinal car list [ after exists #4 ]",
                (arrayOfCarsToAdd1.length + arrayOfCarsToAdd2.length + 1 - numberOfCarsShouldBeRemoved));


        // now print list backwards
        results += displayLinkedListCarBackwards(carList, "\nFinal car list [ backwards ]",
                (arrayOfCarsToAdd1.length + arrayOfCarsToAdd2.length + 1 - numberOfCarsShouldBeRemoved));

        if (results == 0) {
            System.out.println("\ntests for exists(), countOccurrences(), remove(), size() -- good");
            System.out.println("visually inspect the displayed lists ");
        } else {
            System.out.println("\n*** " + results + " issue(s) ***");
        }
        System.exit(results);

    }

    /**
     * displayLinkedListCarAndSize method displays Cars from a
 OrderedDoublyLinkedList<Car>
     * using an iterator
     *
     * @param listToDisplay the OrderedDoublyLinkedList<Car> to display
     * @param label String to display before displaying list
     * @param expectedSize the value that .size() is expected to return
     * @return the value to add to the return resuls for the tester
     */
    public static int displayLinkedListCarAndSize(OrderedDoublyLinkedList<Car> listToDisplay,
                        String label, int expectedSize) {
        int returnResult = 0;
        System.out.println(label + ":\n[");

        if (listToDisplay.size() == 0 && expectedSize == 0) {
            System.out.print("--Empty(expected)--");
        }
        else if (listToDisplay.size() == 0 && expectedSize != 0) {
            System.out.println("--Empty not expected--  <== issue");
            returnResult++;
        }
        DoublyLinkedLister<Car> carLister = listToDisplay.iterator();
        while (carLister.hasNext()) {
            Car displayCar = carLister.next();
            System.out.print(" { Car " + displayCar.getYearModel() +
                            " " + displayCar.getMake() +
                            " @ " + displayCar.getSpeed() + " } ");
            if (carLister.hasNext()) {
                System.out.print(",");
            }
            System.out.println();
        }

        System.out.print("]\tSize: " + listToDisplay.size() + "  ");

        if (listToDisplay.size() == expectedSize)
            System.out.println(" -- good");
        else {
            System.out.println("  " + expectedSize + " was expected -- issue");
            returnResult++;
        }
        return returnResult;
    }

    /**
     * displayLinkedListCarBackwards method displays Cars from a
 OrderedDoublyLinkedList<Car>
     * using an iterator
     *
     * @param listToDisplay the OrderedDoublyLinkedList<Car> to display
     * @param label String to display before displaying list
     * @param expectedSize the value that .size() is expected to return
     * @return the value to add to the return resuls for the tester
     */
    public static int displayLinkedListCarBackwards(OrderedDoublyLinkedList<Car> listToDisplay,
                        String label, int expectedSize) {
        int returnResult = 0;
        System.out.println(label + ":\n[");

        if (listToDisplay.size() == 0 && expectedSize == 0) {
            System.out.print("--Empty(expected)--");
        }
        else if (listToDisplay.size() == 0 && expectedSize != 0) {
            System.out.println("--Empty not expected--  <== issue");
            returnResult++;
        }
        DoublyLinkedLister<Car> carLister = listToDisplay.iteratorBackwards();
        while (carLister.hasNext()) {
            Car displayCar = carLister.next();
            System.out.print(" { Car " + displayCar.getYearModel() +
                            " " + displayCar.getMake() +
                            " @ " + displayCar.getSpeed() + " } ");
            if (carLister.hasNext()) {
                System.out.print(",");
            }
            System.out.println();
        }

        System.out.print("]\tSize: " + listToDisplay.size() + "  ");

        if (listToDisplay.size() == expectedSize)
            System.out.println(" -- good");
        else {
            System.out.println("  " + expectedSize + " was expected -- issue");
            returnResult++;
        }
        return returnResult;
    }

}
