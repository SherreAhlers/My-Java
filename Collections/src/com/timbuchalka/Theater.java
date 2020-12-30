package com.timbuchalka;

import java.util.*;

// Collections class provides a binary search method that
// performs much better.
// an ordering being consistent with equals
// a method that produces
public class Theater {
    private final String theaterName;
    private List<Seat> seats = new ArrayList<Seat>();

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        // the above is not consistant to 0 - will cause problems with maps
    }
    // going to make above public for testing purposes on=ly.
//    public List<Seat> seats = new ArrayList<Seat>();

//    private List<Seat> seats = new LinkedList<>();
    // code will still work if you do above
    // but can be even more generic than that
//    private Collection<Seat> seats = new LinkedList<>();
    // the above is very generic and can now use many collections
    // ex:
//    private Collection<Seat> seats = new HashSet<>();
    // this will return out of order due to sets.
    // or:
//    private Collection<Seat> seats = new LinkedHashSet<>();
    // this will return in order
    // each above code will all work same with rest of program.

//    private Collection<Seat> seats = new TreeSet<>();
    // the above will throw an error because the Collection can only
    // go one row down.

    public Theater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;

        int lastRow = 'A' + (numRows - 1);
        for(char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;
                // set base price to $12
                if((row < 'D') && (seatNum >= 4 && seatNum <= 9)) {
                    price = 14.00;
                    // if seat is near middle more expensive
                } else if((row > 'F') || seatNum < 4 || seatNum > 9) {
                    price = 7.00;
                    // if seats are by aisle will be less expensive
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }
    public String getTheaterName() {
        return theaterName;
    }
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber + " available.");
            return false;
        }
        // this code makes running it very optimized
//        int low = 0;
//        int high = seats.size()-1;
//
//        while(low <= high) {
//            System.out.println(".");
//            int mid = (low + high) / 2;
//            Seat midVal = seats.get(mid);
//            int cmp = midVal.getSeatNumber().compareTo(seatNumber);
//
//            if (cmp < 0) {
//                low = mid + 1;
//            } else if (cmp > 0) {
//                high = mid -1;
//            } else {
//                return seats.get(mid).reserve();
//            }
//        }
//        System.out.println("There is no seat " + seatNumber);
//        return false;

        // changing the below code to make it more efficient
        // with Collections.binarySearch
//        Seat requestedSeat = null;
//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if(foundSeat >= 0) {
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
        // Now the below code is no longer needed because it is
        // being replaced with the Collections.binarySearch method.

//        for(Seat seat : seats) {
//            System.out.println(".");
            // this will output: ..................
            // because it had to loop through many elements to get
            // to the appropriate seat.
            // this will tell us how many seats it will have to go
            // through to check for a particular seats
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if(requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
    }
    // for testing
    public Collection<Seat> getSeats() {
//        for(Seat seat : seats) {
//            System.out.println(seat.getSeatNumber());
//        }
        return seats;
    }
//    private class Seat {
//    private class Seat implements Comparable<Seat> {
        // making above public for testing reasons.
public class Seat implements Comparable<Seat> {

    private final String seatNumber;
    private double price;
    private boolean reserved = false;

    public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        // this will return the 0 number less than 0 and a number
        // greater than 0 if it is greater than
        // can now use different kind of set to be more efficient
    }

    public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved.");
                return true;
            } else {
                return false;
            }
        }
        public boolean cancel() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled.");
                return true;
            } else {
                return false;
            }
        }
        public String getSeatNumber() {
            return seatNumber;
        }

    public double getPrice() {
        return price;
    }
}

}
