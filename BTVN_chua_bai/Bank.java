package BTVN_chua_bai;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> listAccount;

    public Bank(){
        this.listAccount = new ArrayList<Account>();
    }

    public void addAccount(Account account){
        this.listAccount.add(account);
    }
    public void removeAccount(Account account){

    }
    public void deposit(Account account, double money){

    }
    public void transfer(Account sender, Account receiver, Double amount){
        sender.setBalance(-amount);
        receiver.setBalance(receiver.getBalance() + amount);

        String infoTransaction ="Da nhan" + amount + " tien";
        receiver.setInfoTransaction(infoTransaction);
    }
}

