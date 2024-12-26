package SOAP;

import java.util.Date;

public class Account {
    private int id;
    private Double balance;
    private Date creation_date;

    public Account() {
    }

    public Account(int id, Double balance, Date creation_date) {
        this.id = id;
        this.balance = balance;
        this.creation_date = creation_date;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", creation_date=" + creation_date +
                '}';
    }
}
