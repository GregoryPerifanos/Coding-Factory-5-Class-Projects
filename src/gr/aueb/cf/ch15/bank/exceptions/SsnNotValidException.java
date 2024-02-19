package gr.aueb.cf.ch15.bank.exceptions;

public class SsnNotValidException extends Exception{
    private static final long serialVersionUID = 1209l;

    public SsnNotValidException(String ssn) {
        super("Ssn " + ssn + " not Valid.");
    }
}
