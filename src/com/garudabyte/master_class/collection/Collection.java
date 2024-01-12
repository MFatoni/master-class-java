package com.garudabyte.master_class.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
    public static void main(String[] args) {

//        com.garudabyte.master_class.collection.CollectionTheatre theatre = new com.garudabyte.master_class.collection.CollectionTheatre("Olympian", 8, 12);
////        theatre.getSeats();
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//
//        List<com.garudabyte.master_class.collection.CollectionTheatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//
//        seatCopy.get(1).reserve();
//        if(theatre.reserveSeat("A02")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//
//        Collections.reverse(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seat");
//        printList(theatre.seats);
//
//        com.garudabyte.master_class.collection.CollectionTheatre.Seat minSeat = Collections.min(seatCopy);
//        com.garudabyte.master_class.collection.CollectionTheatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println(minSeat.getSeatNumber());
//        System.out.println(maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);
//
////        System.out.println(theatre.seats.size());
////        List<com.garudabyte.master_class.collection.CollectionTheatre.Seat> newList = new ArrayList<>(theatre.seats.size());
////        Collections.copy(newList,theatre.seats);
////        printList(newList);

        CollectionTheatreUpdated theatre = new CollectionTheatreUpdated("Olympian", 8, 12);

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<CollectionTheatreUpdated.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);


        List<CollectionTheatreUpdated.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, CollectionTheatreUpdated.PRICE_ORDER);
        printList(priceSeats);
    }

//    public static void printList(List<com.garudabyte.master_class.collection.CollectionTheatre.Seat> list){
//         for(com.garudabyte.master_class.collection.CollectionTheatre.Seat seat : list){
//             System.out.print(" " + seat.getSeatNumber());
//         }
//        System.out.println();
//        System.out.println("=====================");
//    }

    public static void printList(List<CollectionTheatreUpdated.Seat> list){
        for(CollectionTheatreUpdated.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=====================");
    }

    public static void sortList(List<? extends CollectionTheatre.Seat> list){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }
}

/*
collection interface
collection
-set
--sortedmap
-list
-queue
-deque
map
-sortedmap

map
key must be unique, it will replace if key same
hashmap -> unordered
treemap -> ordered

set
should be unique, cant access specific key

if using own object on key map or element on set, should override equal and hashcode
equals priciple : reflexive, symmetric, transitive, consistent

symmetric difference
set1 = {501,502,503,504}
set2 = {502,503,504,505}
set = {501,505}

asymmetric differences
List x = [1, 2, 5, 7, 8];
List y = [1, 3, 4, 5];

x - y (what's in x that's not in y) => 2 7 8
y - x (what's in y that's not in x) => 3 4

*/