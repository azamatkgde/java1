package variable.meerim.CreditApplication;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PassportData passport = new PassportData("1234", "567890", "Italy",LocalDate.of(2024,5,27), "0000");
        ContactInfo contact = new ContactInfo("00393236142", "bony8383@mail.ru","Italy,Milano, via Alto Adige 5","Italy,Milano, via Alto Adige 5");
        EmploymentInfo work = new EmploymentInfo("Abacons srl", "Software Engineer",36,2500,true);
        CreditDetails credit = new CreditDetails(50000, 60, " New Car", false, 0);


        CreditApplication application = new CreditApplication();
        application.setName("Meerim");
        application.setSurname("Talipova");
        application.setBirthday( LocalDate.of(1983,5,27));
        application.setJob("Software Engineer");
        application.setPassport(passport);
        application.setContactinfo(contact);
        application.setEmployment(work);
        application.setCreditDetails(credit);
        System.out.println(application);
        System.out.println("Application has been created with success for : " + application.getName() +  " " + application.getSurname());
    }

}
