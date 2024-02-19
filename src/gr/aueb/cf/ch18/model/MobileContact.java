package gr.aueb.cf.ch18.model;

import gr.aueb.cf.ch17.threads.MissionStatus;

import java.util.Objects;

public class MobileContact extends AbstractEntity{
    private UserDetails userDetails;
    private String phoneNumber;

    public MobileContact() {

    }

    public MobileContact(UserDetails userDetails, String phoneNumber) {
        this.userDetails = new UserDetails(userDetails);
        this.phoneNumber = phoneNumber;
    }

    public UserDetails getUserDetails() {
        return new UserDetails(userDetails);
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = new UserDetails(userDetails);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "MobileContact{" +
                "userDetails=" + userDetails +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MobileContact that = (MobileContact) o;

        if (!Objects.equals(userDetails, that.userDetails)) return false;
        return Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        int result = userDetails != null ? userDetails.hashCode() : 0;
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}
