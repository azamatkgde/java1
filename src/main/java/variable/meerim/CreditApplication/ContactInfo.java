package variable.meerim.CreditApplication;

public class ContactInfo {
    private String phoneNumber;
    private String email;
    private String registrationAddress;
    private String actualAddress;

    public ContactInfo() {
    }

    public ContactInfo(String phoneNumber,String email,String registrationAddress,String actualAddress) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.registrationAddress = registrationAddress;
        this.actualAddress = actualAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(String actualAddress) {
        this.actualAddress = actualAddress;
    }

    @Override
    public String toString() {
        return "phoneNumber='" + phoneNumber + "\n"+
                "email='" + email + "\n"+
                "registrationAddress='" + registrationAddress + "\n"+
                "actualAddress='" + actualAddress + "\n";
                }
    }

