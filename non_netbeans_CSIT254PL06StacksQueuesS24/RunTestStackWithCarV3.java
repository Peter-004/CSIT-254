package csit254pl06stacksqueuess24;

/**
 * There is no need to change this file ( other than the package statement)
 *
 * Programmed by Stephen Brower Inspired by Michael Main
 *
 * Date Written 10/3/2014 - written to use generic tester to test generic linked
 * list needs TestLinkedBagGeneric.java Date
 *
 * Modified 10/12/2014 - changed to use stacks 3/6/2019 - added 1 additional
 * item 3/15/2023 - changed to reference GenericStackGenericTestV2
 *
 * For Sample Output, see below
 */
public class RunTestStackWithCarV3 {

    public static void main(String[] args) {
        runMe();
    }

    public static void runMe() {

        System.out.println("============= RunTestStackWithCarV3 using GenericStackGenericTestV2 =============");

        GenericStackGenericTestV2<Car> testStackCarV3 = new GenericStackGenericTestV2<Car>();

        Car[] arrayOfCarsToAdd = {
            new Car(2015, "Honda Accord"),
            new Car(1998, "Camry"),
            new Car(1994, "Explorer"),
            new Car(2015, "Zoom Zoom"),
            new Car(2015, "Acura"),
            new Car(2007, "Neon"),
            new Car(1965, "Shelby Mustang GT 350"),
            new Car(2015, "zOom zoOM")};

        testStackCarV3.test(arrayOfCarsToAdd, new Car(2019, "Kia Soul"));
    }
}
/*
Expected Output:
============= RunTestStackWithCarV3 using GenericStackGenericTestV2 =============

Display Stack Size on startup
Size: 0 -good

===========
<<Start Pushes:
Pushing: [Car 2015 Honda Accord] 	pushed...now size is 1 -good
Pushing: [Car 1998 Camry] 	pushed...now size is 2 -good
Pushing: [Car 1994 Explorer] 	pushed...now size is 3 -good
Pushing: [Car 2015 Zoom Zoom] 	pushed...now size is 4 -good
Pushing: [Car 2015 Acura] 	pushed...now size is 5 -good
Pushing: [Car 2007 Neon] 	pushed...now size is 6 -good
Pushing: [Car 1965 Shelby Mustang GT 350] 	pushed...now size is 7 -good
Pushing: [Car 2015 zOom zoOM] 	pushed...now size is 8 -good
Stopped Pushing>>
===========


Display stack size after adds
Size: 8 -good

pop?...peek: <[Car 2015 zOom zoOM]> exp:{[Car 2015 zOom zoOM]} 	size: 8 -good
...popped: <[Car 2015 zOom zoOM]> exp:{[Car 2015 zOom zoOM]} 	size: 7 -good

Display stack size after 1 pop
Size: 7 -good

===========
<<Start popping:
pop?...peek: <[Car 1965 Shelby Mustang GT 350]> exp:{[Car 1965 Shelby Mustang GT 350]} 	size: 7 -good
...popped: <[Car 1965 Shelby Mustang GT 350]> exp:{[Car 1965 Shelby Mustang GT 350]} 	size: 6 -good
pop?...peek: <[Car 2007 Neon]> exp:{[Car 2007 Neon]} 	size: 6 -good
...popped: <[Car 2007 Neon]> exp:{[Car 2007 Neon]} 	size: 5 -good
pop?...peek: <[Car 2015 Acura]> exp:{[Car 2015 Acura]} 	size: 5 -good
...popped: <[Car 2015 Acura]> exp:{[Car 2015 Acura]} 	size: 4 -good
pop?...peek: <[Car 2015 Zoom Zoom]> exp:{[Car 2015 Zoom Zoom]} 	size: 4 -good
...popped: <[Car 2015 Zoom Zoom]> exp:{[Car 2015 Zoom Zoom]} 	size: 3 -good
pop?...peek: <[Car 1994 Explorer]> exp:{[Car 1994 Explorer]} 	size: 3 -good
...popped: <[Car 1994 Explorer]> exp:{[Car 1994 Explorer]} 	size: 2 -good
pop?...peek: <[Car 1998 Camry]> exp:{[Car 1998 Camry]} 	size: 2 -good
...popped: <[Car 1998 Camry]> exp:{[Car 1998 Camry]} 	size: 1 -good
pop?...peek: <[Car 2015 Honda Accord]> exp:{[Car 2015 Honda Accord]} 	size: 1 -good
...popped: <[Car 2015 Honda Accord]> exp:{[Car 2015 Honda Accord]} 	size: 0 -good
Stopped Popping>>
===========

Display stack size after pop all
Size: 0 -good

attempt to peek at item from empty stack:
pop? - EmptyStack Exception - Can't peek stack  -good

attempt to remove item from empty stack:
pop? - EmptyStack Exception - Can't pop stack  -good

Display stack size after 1 pop
Size: 0 -good

Display stack size after 1 additional push
Size: 1 -good

pop the additional item...peek: <[Car 2019 Kia Soul]> exp:{[Car 2019 Kia Soul]} 	size: 1 -good
...popped: <[Car 2019 Kia Soul]> exp:{[Car 2019 Kia Soul]} 	size: 0 -good

Display stack size after 1 pop
Size: 0 -good


Results of all Stack tests:	 0--Good

 */
