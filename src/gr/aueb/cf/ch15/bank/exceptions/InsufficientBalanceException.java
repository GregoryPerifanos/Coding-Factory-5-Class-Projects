package gr.aueb.cf.ch15.bank.exceptions;

public class InsufficientBalanceException extends Exception{
    private static final long serialVersionUID = 177985L;

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient Balance " + balance + " for amount " + amount);
    }
}
