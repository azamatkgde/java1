package oop.aibek;

public class Cars {
    private String model;
    private int year;


    //Getter
    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    //Setter

    public void setModel(String model) {
        this.model = model;
    }



    public void setYear(int year) {
        if (year >=2000 && year <= 2025){
            this.year =year;
        }else{
            System.out.println("Туура жылды киргиз,Туура эмес жыл! " +
                    "2000-2025 аралыгындагы жылды киргиз.");
        }
    }

}

