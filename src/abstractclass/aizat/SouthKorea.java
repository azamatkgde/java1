package abstractclass.aizat;

public class SouthKorea extends Country{
    public SouthKorea (String name, String continent) {
        super(name, continent);
    }

    @Override
    void showCulture() {
        System.out.println("Корейская культура: кимчи, K-pop, ханбок, дорама, чайные церемонии.");
    }
}
