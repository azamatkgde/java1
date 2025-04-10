package basics.azamat.omka;

class SaleOfCars {
    private String marka;
    private String model;
    private int pricePerDay;
    private boolean isAvailable;

    public SaleOfCars(String marka, String model, int pricePerDay) {
        this.marka = marka;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    public void rent() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(marka + " " + model + " арендага берилди!");
        } else {
            System.out.println(marka + " " + model + " азыр жеткиликтүү эмес!");
        }
    }

    public void returnCars() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(marka + " " + model + " кайтарылды!");
        } else {
            System.out.println(marka + " " + model + " Арендада эмес");
        }
    }

    //(isAvailable ? "Ооба" : "Жок") -->> Тернардык оператор if else нин ордуна кыскартылган код
    public void displayInfo() {
        System.out.println(marka + " " + model + " - Баасы: " + pricePerDay + "$/күн, Жеткиликтүү: " + (isAvailable ? "Ооба" : "Жок"));
    }
}

