package com.timbuchalka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Collections framework
        // at top level of Collections framework
        // is the Collections class
        // static methods that operate on Collection methods
        // interfaces allow framework to be extended
        // List Interface, ArrayList etc.
        // includes sets, maps, trees, queues
        // Arrays are not a part of the Collections framework but
        // it does include methods that allow you to use Arrays.
        // Aggregate
        // Implementations of Collection
        // Algorithms work on Objects that use the interface
//        Theater theater = new Theater("Olympian", 8, 12);
//        theater.getSeats();
//        // this will output:
//        // all rows from A-H with 8 seats per row
////        if(theater.reserveSeat("H11")) {
//        if(theater.reserveSeat("D12")) {
//            // this is much faster searching.
//            // this will reserve the seat
//            System.out.println("Please pay.");
//        } else {
//            System.out.println("Sorry, seat is taken.");
//            // this will tell you if seat is already reserved.
//        }
    // binarySearch relies on the List - for researching and being sorted
        // collection sort uses very efficient merge sort which performs better
        // than bubble search
        // collections framework has a method to copy a list
        Theater theater = new Theater("Olympian", 8, 12);
//        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        // this is a shallow copy - if something in array changes will change in other array
//        printList(seatCopy);
        // this will print all seat entries in the original array into a new array
//        seatCopy.get(1).reserve();
        if(theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12.");
            // this wil output:
            // Seat D12 reserved.
            // Please pay for D12.
        } else {
            System.out.println("Seat already reserved.");
        }
        if(theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12.");
        } else {
            System.out.println("Seat already reserved.");
            // this will output: Seat already reserved.
        }
        if(theater.reserveSeat("B13")) {
            System.out.println("Please pay for B13.");
            // this will output: There is no seat B13 available.
        } else {
            System.out.println("Seat already reserved.");
            // this will output: Seat already reserved. -- because above doesn't exist
        }
        if(theater.reserveSeat("B13")) {
            System.out.println("Please pay for B13.");
            // this will output: There is no seat B13 available.
        } else {
            System.out.println("Seat already reserved.");
            // this will output: Seat already reserved. -- because above doesn't exist
        }
        List<Theater.Seat> reverseSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);
        // this will sort from high to low - output will be a list of seats
        // starting from h08 down to a01

        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.new Seat("B00", 12.00));
        priceSeats.add(theater.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        // sort is guaranteed to be stable - elements wont be swapped if they don't need to be
        printList(priceSeats);



//        Collections.reverse(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theater.seat");
//        printList(theater.seats);
        // the above shows we made a copy of original array into new array

//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theater.seat");
//        printList(theater.seats);
        // the above code displays the original array in shuffled order
        // but the copied array is still in original order.

//        Theater.Seat minSeat = Collections.min(seatCopy);
//        Theater.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        // this will output: Min seat number is A01
//        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
        // this will output: Max seat number is H12
        // min and max will work even if list is not in order
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);
        // this will display the array sorted in original order
//        List<Theater.Seat> newList = new ArrayList<>(theater.seats.size());
//        Collections.copy(newList, theater.seats);
        // this will output an error:
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Source does not fit in dest
        //	at java.base/java.util.Collections.copy(Collections.java:561)
        //	at com.timbuchalka.Main.main(Main.java:80)

    }
    public static void printList(List<Theater.Seat> list) {
        for(Theater.Seat seat : list) {
            System.out.println(seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("==================================");
    }
//    public static void sortList(List<? extends Theater.Seat> list) {
//        for(int i = 0; i < list.size(); i++) {
//            for(int j = i + 1; j < list.size(); j++) {
//                if(list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i , j);
//                }
//                // this is a version of the bubble sort algorithm
//            }
//        }
//    }
    // cleaned up code no longer need code above

    // collections copy method -
    // deep copy of list - is a copy where elements are not just referenced
    // but actually copied

}

// compareTo() should return a number less than 0 if object should sort less
// than the object being compared to - if two objects are equal must return 0.
