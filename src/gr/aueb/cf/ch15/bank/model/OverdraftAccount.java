package gr.aueb.cf.ch15.bank.model;

import gr.aueb.cf.ch15.bank.exceptions.SsnNotValidException;

public class OverdraftAccount extends Account{

    public OverdraftAccount() {

    }

    public OverdraftAccount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    /**
     * Draws and set the amount of an account.
     *
     *
     * @param amount                the amount to be drawn.
     * @param ssn                   the ssn number.
     * @throws SsnNotValidException if the ssn is not valid.
     */
    @Override
    public void withdraw(double amount, String ssn) throws  SsnNotValidException {
        try {
            if (!isSsnValid(ssn)){
                throw new SsnNotValidException(ssn);
            }
            setBalance(getBalance() - amount);
        }catch (SsnNotValidException e){
            System.err.println("Error " + e.getMessage());
            throw e;
        }
    }
}
