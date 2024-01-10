import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
    public static void main(String[] args) {

        CollectionTheatre theatre = new CollectionTheatre("Olympian", 8, 12);
//        theatre.getSeats();
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        List<CollectionTheatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        CollectionTheatre.Seat minSeat = Collections.min(seatCopy);
        CollectionTheatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println(minSeat.getSeatNumber());
        System.out.println(maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

//        System.out.println(theatre.seats.size());
//        List<CollectionTheatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//        Collections.copy(newList,theatre.seats);
//        printList(newList);
    }

    public static void printList(List<CollectionTheatre.Seat> list){
         for(CollectionTheatre.Seat seat : list){
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
 */