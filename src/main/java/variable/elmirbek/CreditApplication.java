package variable.elmirbek;
import java.util.Scanner;

public class CreditApplication {
    public static void main(String[] args) {
        Scanner userInformation = new Scanner(System.in);

        System.out.println("Атыңызды киргизиңиз: : ");
        String firstName = userInformation.nextLine();

        System.out.println("Фамилияңызды киргизиңиз : ");
        String lastName = userInformation.nextLine();

        System.out.println("Жашыңызды киргизиңиз : ");
        int ageUser = userInformation.nextInt();
        userInformation.nextLine();

        if (ageUser < 18) {
            System.out.println("Арыз четке кагылды. Насыя 18 жаштан жогорку адамдарга гана берилет.");
            return;
        }

        System.out.println("Насыянын суммасын киргизиңиз : ");
        double creditAmount = userInformation.nextDouble();
        userInformation.nextLine();

        System.out.println("Насыянын мөөнөтүн киргизиңиз : ");
        int creditTerm = userInformation.nextInt();
        userInformation.nextLine();

        System.out.println("Айлык кирешени киргизиңиз : ");
        double monthlyIncome = userInformation.nextDouble();
        userInformation.nextLine();

        System.out.println("Насыянын максатын корсотнуз : ");
        String creditPurpose = userInformation.nextLine();

        System.out.println("Башка кредиттериңиз барбы? (Ооба/жоок):");
        String hasOtherCredits = userInformation.nextLine();

        System.out.println("Байланыш номериңизди киргизиңиз : ");
        int contactNumber = userInformation.nextInt();
        userInformation.nextLine();

        System.out.println("Болжолдуу айлык төлөмүңүздү киргизиңиз : ");
        double monthlyPayment = userInformation.nextDouble();
        userInformation.nextLine();

        // Вывод анкеты
        System.out.println("\n------ Подтверждение заявки ------");
        System.out.println("Аты : " + firstName);
        System.out.println("Фамилия : " + lastName);
        System.out.println("Жашы : " + ageUser);
        System.out.println("Насыянын суммасы : " + creditAmount);
        System.out.println("Насыянын суммасы : " + creditAmount + " айга");
        System.out.println("Айлык киреше : " + monthlyPayment);
        System.out.println("Насыянын максаты : " + creditPurpose);
        System.out.println("Башка кредиттердин болушу : " + hasOtherCredits);
        System.out.println("Байланыш номериңиз : " + contactNumber);
        System.out.println("Ай сайын төлөм : " + monthlyPayment);
        System.out.println("Арыз кабыл алынды. Рахмат!");
   userInformation.close();
    }
}
