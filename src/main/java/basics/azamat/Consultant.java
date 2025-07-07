package basics.azamat;

public class Consultant extends Work {
    private String consultingArea;
    private int clientsCount;
    private double hourlyRate;

    public Consultant(String position, String company, String startDate, String endDate, String description,
                      String consultingArea, int clientsCount, double hourlyRate) {
        super(position, company, startDate, endDate, description);
        this.consultingArea = consultingArea;
        this.clientsCount = clientsCount;
        this.hourlyRate = hourlyRate;
    }

    public String getConsultingArea() {
        return consultingArea;
    }

    public void setConsultingArea(String consultingArea) {
        this.consultingArea = consultingArea;
    }

    public int getClientsCount() {
        return clientsCount;
    }

    public void setClientsCount(int clientsCount) {
        this.clientsCount = clientsCount;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "consultingArea='" + consultingArea + '\'' +
                ", clientsCount=" + clientsCount +
                ", hourlyRate=" + hourlyRate +
                "} " + super.toString();
    }
}
