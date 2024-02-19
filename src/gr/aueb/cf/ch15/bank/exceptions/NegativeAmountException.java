package gr.aueb.cf.ch15.bank.exceptions;

public class NegativeAmountException extends Exception{
    private static final long serialVersionUID = 46546L;

    public NegativeAmountException (double amount) {
        super("Amount " + amount + "is not sufficient.");
    }
}
