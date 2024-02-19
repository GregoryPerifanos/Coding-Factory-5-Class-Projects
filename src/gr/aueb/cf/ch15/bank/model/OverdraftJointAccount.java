package gr.aueb.cf.ch15.bank.model;

public class OverdraftJointAccount extends OverdraftAccount{
    private User secondHolder;

    public OverdraftJointAccount(User secondHolder){
        this.secondHolder = secondHolder;
    }

    public OverdraftJointAccount(String iban, User holder, double balance, User secondHolder) {
        super(iban, holder, balance);
        this.secondHolder = secondHolder;
    }
}
