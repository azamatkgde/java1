package api.aizat;

public class City {
        private String name;
        private String country;
        private int population;
        private double area;

        public City(String name, String country, int population, double area) {
            this.name = name;
            this.country = country;
            this.population = population;
            this.area = area;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public int getPopulation() {
            return population;
        }

        public double getArea() {
            return area;
        }


    public void print() {
        System.out.println("Город: " + name);
        System.out.println("Страна: " + country);
        System.out.println("Население: " + population);
        System.out.println("Площадь: " + area  + " км²");
    }


}
