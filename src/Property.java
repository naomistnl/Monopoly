public class Property extends Item {

    //property attributes - unique to property as a subclass
    private String name;
    private String colour;
    private int cost;

    //constructor - includes inherited attributes from superclass Item
    public Property(int boardposition, String name, String colour, int cost){
        super(boardposition);
        this.name = name;
        this.colour = colour;
        this.cost = cost;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Board Position " + super.getBoardposition() + " " + "Name: " + name + " " + "Colour: " + colour + " " + "Cost: " + cost;
    }
}
