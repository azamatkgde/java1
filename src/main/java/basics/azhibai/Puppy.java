package basics.azhibai;

public class Puppy extends Dog{
    private boolean vaccinated;

    public Puppy(String name, int age, String breed, double price, boolean vaccinated) {
        super(name, age, breed,  price);
        this.vaccinated = vaccinated;
    }

    public boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println((vaccinated ? "Эмдөөдөн өткөн" : "Эмдөөдөн өткөн эмес"));
    }
}
