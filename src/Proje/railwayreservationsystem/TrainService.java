package Proje.railwayreservationsystem;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainService {

    private static List<Train> allTrains = new LinkedList<>();

    static {
        allTrains.add(new Train(101, "Train-one", "Ankara", "Istanbul", 100, 800, LocalDate.now()));
        allTrains.add(new Train(102, "Train-two", "Istanbul", "Ankara", 100, 800, LocalDate.now()));
        allTrains.add(new Train(103, "Train-three", "Ankara", "Istanbul", 80, 600, LocalDate.now()));
        allTrains.add(new Train(104, "Train-four", "Istanbul", "Ankara", 80, 600, LocalDate.now()));
        allTrains.add(new Train(105, "Train-five", "Ankara", "Eskisehir", 100, 900, LocalDate.now()));
        allTrains.add(new Train(106, "Train-six", "Eskisehir", "Ankara", 100, 900, LocalDate.now()));
    }

    public TrainService() {
    }

    public static Train findTrain(int trainNumber) {

        Train temp = null;

        for (Train t : allTrains) {

            if (t.getTrainNumber() == trainNumber) {
                temp = t;
                break;
            }
        }//outer
        return temp;
    }

    public static void searchTrainsBetweenStations(String fromStation, String toStation, LocalDate doj, int numOfSeats) {

        List<Train> searchTrainList = new LinkedList<>();

        for (Train t : allTrains) {

            if (t.getFromStation().equals(fromStation) &&
                    t.getToStation().equals(toStation) &&
                    t.getDoj().equals(doj) &&
                    t.getSeatsAvailable() > numOfSeats) {
                /*
                eger if icerisindeki butun sartlar saglanirsa,
                secegim treni gecisi listte store etmem gerekir. bunun
                icin de searchTrainList create ediyoruz. Butun bilgileri iceriyor
                bu temp list. Bu kosullari saglayan tum trenler searchList icerisinde
                ise bunu gostermek icin forloop kullaniyoruz ve soutf ile print ediyoruz.
                 */
                searchTrainList.add(t);
            }

        }//outer

        if (searchTrainList.size() == 0) {
            System.out.println("Aradiginiz kriterde tren bulunamamistir. ");
        } else {
            System.out.println("Tr.No  \ttran Name \t   from Station\t   to Station\tDoj\t   Seats Avaliable\t   Fare");
            System.out.println();

            for (Train t : searchTrainList) {
                System.out.printf("%4d %15s %10s %15s %12s %10d %10d\n", t.getTrainNumber(), t.getTrainName(), t.getFromStation(), t.getToStation(),
                        t.getDoj(), t.getSeatsAvailable(), t.getFare());
            }
        }

    }

    public static void bookTickets(int trainNumber, List<Passenger> passengerList) {

        //step1:butun yolcular icin bankAccount objesinden ucret cikarmamiz/subtract gerekiyor
        //kac yolcumuz var, listin size'i bunu verir

        int numOfSeats=passengerList.size();//3
        /*Passenger tempPassanger=passengerList.get(0);
        BankAccount account=tempPassanger.getBankAccount();//10000 gelecek burada da

        burada p1'in banka hesabina ulasmak iicn BankAccount classindan bir obj yapip
        tempPassenger ile getBankAccount cagiriyoruz, Boylece her yolcu icin ayri ayri
        banka hesabina ulasilacaktir
         */

        BankAccount account=passengerList.get(0).getBankAccount();//burasi yukaridaki yorumda yer alan iki kodu veriyor aslinda

        //hesaptan ucerti cekmek icin asagidakini yapiyoruz oncelikle tren numarasindan ucerti bulacagiz

        Train tempTrain=findTrain(trainNumber);
        int fare=tempTrain.getFare();//700 gelecek mesela burada
        int totalFare=fare*numOfSeats;
        account.withdraw(totalFare);

        //step2:mevcut koltuk sayisindan bu yolcularin satin aldigi koltuk sayisini cikarmamiz gerekiyor

        tempTrain.setSeatsAvailable(tempTrain.getSeatsAvailable()-numOfSeats);
        //tempTrain.getSeatsAvailable kismi mevcut koltuk sayisini verecek, numOfSeats de alinan koltuk sayisini verecek

        //step3:booking bittikten sonra bilet collection'ina\databaseine  kaydetmemiz lazim bu biletleri

        TicketService.addNewTicket(trainNumber,passengerList);
    }
}
