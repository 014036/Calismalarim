package Proje.railwayreservationsystem;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainMain {
    public static void main(String[] args) {

        TrainService.searchTrainsBetweenStations("Ankara","Istanbul", LocalDate.now(),110);

        //passanger listini cekebilmek icin obj uretmek gerekiyor once bu nedenl asagidakileri yapiyoruz

        BankAccount b1=new BankAccount();
        b1.setActNumber(999);
        b1.setActBalance(10000);

        Passenger p1=new Passenger(10,"Ebru",38,b1);
        Passenger p2 =new Passenger(10,"Meryem",28,b1);
        Passenger p3 =new Passenger(10,"Dilek",22,b1);

        int initialBalance=b1.getActBalance();

        List<Passenger> passengerList=new LinkedList<>();

        passengerList.add(p1);
        passengerList.add(p2);
        passengerList.add(p3);


        TrainService.bookTickets(101,passengerList);

        TicketService.showTicketDetails(1);

        System.out.println("\n\n");
        TrainService.searchTrainsBetweenStations("Ankara","Istanbul", LocalDate.now(),110);

        int balanceAfterBookingTickets=b1.getActBalance();
        System.out.println("Initial Balance :" + initialBalance );
        System.out.println("Balance After Booking : " + balanceAfterBookingTickets);
    }
}
