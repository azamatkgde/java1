package enums.aizat.color;

public enum Color {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String colour;

    Color(String colour){
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }
}
