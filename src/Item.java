public class Item {
    //item attributes
    private int boardposition;

    //constructor
    public Item(int boardposition) {
        this.boardposition = boardposition;
    }

    //getters and setters
    public int getBoardposition() {
        return boardposition;
    }

    public void setBoardposition(int boardposition) {
        this.boardposition = boardposition;
    }

    @Override
    public String toString() {
        return "Board Position: " + boardposition;
    }

    //main method - where we will store all of the objects for the item subclasses
    public static void main(String[] args) {
        //property objects
        Property OKR = new Property(2, "Old Kent Road", "Brown", 60);
        Property WR = new Property(4,"Whitechapel Road", "Brown", 60);
        Property AI = new Property(7, "The Angel, Islington", "Light Blue", 100);
        Property ER = new Property(9, "Euston Road", "Light Blue", 100);
        Property PR = new Property(10, "Pentonville Road", "Light Blue", 100);
        Property PM = new Property(13, "Pall Mall", "Pink",140);
        Property WH = new Property(15, "Whitehall", "Pink", 140);
        Property NA = new Property(16, "Northumberland Avenue", "Pink", 160);
        Property BS = new Property(18, "Bow Street", "Orange", 180);
        Property MS = new Property(20, "Marlborough Street", "Orange", 180);
        Property VS = new Property(21, "Vine Street", "Orange", 200);
        Property Str = new Property(23,"Strand", "Red", 220);
        Property FS = new Property(25, "Fleet Street", "Red", 220);
        Property TS = new Property(26, "Trafalgar Square", "Red", 240);
        Property LS = new Property(28, "Leicester Square", "Yellow", 260);
        Property CS = new Property(29, "Coventry Street", "Yellow", 260);
        Property PIC = new Property(31, "Piccadilly", "Yellow", 280);
        Property RS = new Property(33, "Regent Street", "Green", 300);
        Property OS = new Property(34, "Oxford Street", "Green", 300);
        Property BOS = new Property(36, "Bond Street", "Green", 320);
        Property PL = new Property(39, "Park Lane", "Blue", 350);
        Property MF = new Property(41, "Mayfair", "Blue", 400);

        //Station objects
        Station KC = new Station(6, "Kings Cross Station", 200);
        Station FC = new Station(27,"Fenchurch Station", 200);
        Station LPS = new Station(37, "Liverpool Street Station", 200);

        //Utility objects
        Utility EC = new Utility(14, "Electric Company", 150);
        Utility WW = new Utility(30, "Water Works", 150);

    }
}
