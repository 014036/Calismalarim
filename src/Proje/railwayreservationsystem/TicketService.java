package Proje.railwayreservationsystem;

import java.util.LinkedList;
import java.util.List;

public class TicketService {

    private static List<Ticket> allTickets=new LinkedList<>();

    public static void addNewTicket(int trainNumber, List<Passenger> passengerList) {

        int pnr=allTickets.size()+1;//
        Train bookedTrain=TrainService.findTrain(trainNumber);
        allTickets.add(new Ticket(pnr,bookedTrain,passengerList));//Ticket classindaki objeyi eklemeliyiz buraya
        //System.out.println("Isleminiz gerceklesmistir.");

    }

    public static void showTicketDetails(int pnr){

        Ticket tempTicket=null;
        for(Ticket t:allTickets){
            if(t.getPnr()==pnr){
                tempTicket=t;
                break;
            }
        }
        Train tempTrain=tempTicket.getBookedTrain();//sout icerisinde tempTicket.getBookedTrain(); tekrar etmek yerine bu yapildi
        List<Passenger>passengerList=tempTicket.getPassengerList();
        int totalFare=tempTrain.getFare()* passengerList.size();

        System.out.println("======BILET DETAYLARI======");
        System.out.println("PNR =>" + tempTicket.getPnr()+ " Tr.No" + tempTrain.getTrainNumber());
        System.out.println("Train Name =>" +tempTrain.getTrainName());
        System.out.println("From station =>" +tempTrain.getFromStation() + " To station =>" +tempTrain.getToStation());
        System.out.println("DOJ : " + tempTrain.getDoj() + " Fare : " +tempTrain.getFare() + " Total Fare : " + totalFare);
        System.out.println("\nPassanger info below\n");

        System.out.println("Passenger Name      Age");
        for (Passenger p:passengerList) {
            System.out.println(p.getPassangerName()+ "\t"+p.getAge());
        }
        System.out.println("=============================");
    }
}
