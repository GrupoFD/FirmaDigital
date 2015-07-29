
import java.util.*;

/**
 * 
 */
public class Transactions {

    /**
     * 
     */
    public Transactions() {
    }

    /**
     * 
     */
    protected User user;

    /**
     * 
     */
    protected BankAccount account;

    /**
     * 
     */
    protected calendar timestamp;

    /**
     * 
     */
    protected Certificate certificate;

    /**
     * 
     */
    protected int amount;

    /**
     * 
     */
    protected User transferToUser;





    /**
     * @param user 
     * @param account 
     * @param timeStamp 
     * @param amount 
     * @param transferToUser 
     * @param transferToAccount
     */
    protected void Transaction(User user, BankAccount account, Calendar timeStamp, int amount, ArrayList<User> transferToUser, ArrayList<BankAccount> transferToAccount) {
        // TODO implement here
    }

    /**
     * @return
     */
    protected User getUser() {
        // TODO implement here
        return null;
    }

    /**
     * @param user
     */
    protected void setUser(User user) {
        // TODO implement here
    }

    /**
     * @return
     */
    protected BankAccount getAccount() {
        // TODO implement here
        return null;
    }

    /**
     * @param account
     */
    protected void setAccount(BankAccount account) {
        // TODO implement here
    }

    /**
     * @return
     */
    protected Calendar getTimeStamp() {
        // TODO implement here
        return null;
    }

    /**
     * @param timestamp
     */
    protected void setTimeStamp(Calendar timestamp) {
        // TODO implement here
    }

    /**
     * @return
     */
    protected Certificate getCertificate() {
        // TODO implement here
        return null;
    }

    /**
     * @param certificate
     */
    protected void setCertificate(Certificate certificate) {
        // TODO implement here
    }

    /**
     * @return
     */
    protected int getAmount() {
        // TODO implement here
        return 0;
    }

    /**
     * @param amount
     */
    protected void setAmount(int amount) {
        // TODO implement here
    }

    /**
     * @return
     */
    protected User getTransferToUser() {
        // TODO implement here
        return null;
    }

    /**
     * @param transferToUser
     */
    protected void setTransferToUser(User transferToUser) {
        // TODO implement here
    }

    /**
     * @param user 
     * @return
     */
    protected ArrayList<BankAccount> getUsersBankAccount(User user) {
        // TODO implement here
        return null;
    }

    /**
     * @param id 
     * @return
     */
    protected ArrayList<User> getUsers(int id) {
        // TODO implement here
        return null;
    }

}