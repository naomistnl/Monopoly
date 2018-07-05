import java.util.HashMap;

public class Board {
    public static void main(String[] args) {
        Board boardsquares = new Board();
        boardsquares.boardSquares();
    }

    //hashmap to place all of the items on the board and fixes them to a board position
    public void boardSquares() {
        HashMap<Integer, String> boardMap = new HashMap<>();
        //the monopoly board places in a hash map
        boardMap.put(1,"Go");
        boardMap.put(2,"Old Kent Road");
        boardMap.put(3,"Community Chest");
        boardMap.put(4,"Whitechapel Road");
        boardMap.put(5,"Income Tax");
        boardMap.put(6,"King Cross Station");
        boardMap.put(7,"The Angel, Islington");
        boardMap.put(8,"Chance");
        boardMap.put(9,"Euston Road");
        boardMap.put(10,"Pentonville Road");
        boardMap.put(11,"In Jail");
        boardMap.put(12,"In Jail (Just Visiting)");
        boardMap.put(13,"Pall Mall");
        boardMap.put(14,"Electric Company");
        boardMap.put(15,"Whitehall");
        boardMap.put(16,"Northumberland Avenue");
        boardMap.put(17,"Marylebone Station");
        boardMap.put(18,"Bow Street");
        boardMap.put(19,"Community Chest");
        boardMap.put(20,"Marlborough Street");
        boardMap.put(21,"Vine Street");
        boardMap.put(22,"Free Parking");
        boardMap.put(23,"Strand");
        boardMap.put(24,"Chance");
        boardMap.put(25,"Fleet Street");
        boardMap.put(26,"Trafalgar Square");
        boardMap.put(27,"Fenchurch Station");
        boardMap.put(28,"Leicester Square");
        boardMap.put(29,"Coventry Street");
        boardMap.put(30,"Water Works");
        boardMap.put(31,"Piccadilly");
        boardMap.put(32,"Go To Jail");
        boardMap.put(33,"Regent Street");
        boardMap.put(34,"Oxford Street");
        boardMap.put(35,"Community Chest");
        boardMap.put(36,"Bond Street");
        boardMap.put(37,"Liverpool Street Station");
        boardMap.put(38,"Chance");
        boardMap.put(39,"Park Lane");
        boardMap.put(40,"Super Tax");
        boardMap.put(41,"Mayfair");


    }

}
