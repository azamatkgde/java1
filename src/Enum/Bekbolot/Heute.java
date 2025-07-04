package Enum.Bekbolot;

public class Heute {
    public static void main(String[] args) {
        Season today = Season.SOMMER;  // Туура маанини тандайбыз

        System.out.println(Season.getDescription(today));
    }
}