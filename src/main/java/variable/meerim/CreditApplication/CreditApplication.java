package variable.meerim.CreditApplication;

import java.time.LocalDate;
import java.time.Period;

public class CreditApplication {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String job;
    private PassportData passport;
    private ContactInfo contactinfo;
    private EmploymentInfo employment;
    private CreditDetails creditDetails;

    public CreditApplication(){

    }
    public CreditApplication(String name,String surname,LocalDate birthday,String job,PassportData passport,ContactInfo contactinfo,EmploymentInfo employment,CreditDetails creditDetails) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.job = job;
        this.passport= passport;
        this.contactinfo = contactinfo;
        this.employment = employment;
        this.creditDetails = creditDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


    public PassportData getPassport() {
        return passport;
    }

    public void setPassport(PassportData passport) {
        this.passport = passport;
    }

    public ContactInfo getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(ContactInfo contactinfo) {
        this.contactinfo = contactinfo;
    }

    public EmploymentInfo getEmployment() {
        return employment;
    }

    public void setEmployment(EmploymentInfo employment) {
        this.employment = employment;
    }

    public CreditDetails getCreditDetails() {
        return creditDetails;
    }

    public void setCreditDetails(CreditDetails creditDetails) {
        this.creditDetails = creditDetails;
    }

    @Override
    public String toString() {
        return "CreditApplication:\n" +
                "name: " + name + "\n" +
                "surname: " + surname + "\n" +
                "birthday: " + birthday + "\n" +
                "job: " + job + "\n" +
                "passport: " + passport + "\n" +
                "contactinfo: " + contactinfo + "\n" +
                "employment: " + employment + "\n" +
                "creditDetails: " + creditDetails + "\n";

    }

    public boolean isEligibleForCredit() {
        LocalDate today = LocalDate.now();
        int age = Period.between(this.birthday, today).getYears();
        return age >= 18;
    }
}
