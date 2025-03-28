package oop.urmat;

public class Apartment {
    private String town;
    private String partOfTown;
    private int rooms;

    // Getter
    public String getTown(){
        return town;
    }
    public String getPartOfTown(){
        return partOfTown;
    }
    public int getRooms(){
        return rooms;
    }

    // Setter
    public void setTown(String town){
        this.town = town;
    }
    public void setPartOfTown(String partOfTown){
        this.partOfTown = partOfTown;
    }
    public void setRooms(int rooms){
        if (rooms >= 1 && rooms <= 4){
            this.rooms = rooms;
        } else {
            System.out.println("Талапка ылайык эч нерсе жок");
        }

    }


    public void searchRooms(){
        System.out.println("Салам баарына. " + town + " шаарынан " + rooms + " болмолуу кватира издейм, " + partOfTown + " райондон.");
    }

}
