public class Utility extends Item {
    //utility attributes - unique to utility as a subclass
    private String name;
    private int cost;

    //constructor - includes attributes inherited from superclass Item
    public Utility(int boardposition, String name, int cost) {
        super(boardposition);
        this.name = name;
        this.cost = cost;

    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Board Position " + super.getBoardposition() + " " + "Name: " + name + " "  + "Cost: " + cost;
    }
}
