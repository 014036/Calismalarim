package Proje.railwayreservationsystem;

public class Passenger {

    private int passengerId;
    private String passangerName;
    private int age;

    private BankAccount bankAccount;//BankAccount classindan obj uretmis olduk

    public Passenger() {
        super();
    }

    public Passenger(int passengerId, String passangerName, int age, BankAccount bankAccount) {
        this.passengerId = passengerId;
        this.passangerName = passangerName;
        this.age = age;
        this.bankAccount = bankAccount;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
