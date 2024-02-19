package gr.aueb.cf.ch15.bank.model;

import gr.aueb.cf.ch15.bank.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.bank.exceptions.NegativeAmountException;
import gr.aueb.cf.ch15.bank.exceptions.SsnNotValidException;

/**
 * Makes a Joint Account.
 */
public class JointAccount extends IdentifiableEntity{
    private Account account;
    private User secondHolder;

    //Constructor
    public JointAccount(){

    }

    //Overloaded Constructor
    public JointAccount(Account account, User secondHolder) {
        this.account = account;
        this.secondHolder = secondHolder;
    }

    //Getters Setters

    public Account getAccount() {
        return new Account(account);
    }

    public void setAccount(Account account) {
        this.account = new Account(account);
    }

    public User getSecondHolder() {
        return new User(secondHolder);
    }

    public void setSecondHolder(User secondHolder) {
        this.secondHolder = secondHolder;
    }

    public void deposit(double amount) throws NegativeAmountException {
        account.deposit(amount);
    }

    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, SsnNotValidException{
        if (secondHolder.getSsn().equals(ssn)){
            account.setHolder(secondHolder);
        }
        account.withdraw(amount, ssn);
    }

    public double getBalance() {
        return account.getAccountBalance();
    }
}
