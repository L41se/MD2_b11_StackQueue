package BTVN_chua_bai;

import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private Integer id;
    private double balance;
    private String typeAccount;
    private ArrayList<Objects> transactions;

    public Account(Integer id, double balance, String typeAccount, ArrayList<Objects> transactions) {
        this.id = id;
        this.balance = balance;
        this.typeAccount = typeAccount;
        this.transactions = new ArrayList<Objects>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public ArrayList<Objects> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Objects> transactions) {
        this.transactions = transactions;
    }

    public void setInfoTransaction(String infoTransaction) {
    }
}
