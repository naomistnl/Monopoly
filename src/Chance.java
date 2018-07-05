import java.util.ArrayList;

public class Chance {
    public static void main(String[] args) {

    //calling the chance card method
    Chance chance = new Chance();
    chance.ChanceCard();

    }

//chance card method - uses Math.random to randomly generate a chance card when called.
public void ChanceCard() {
    ArrayList<String> chanceCard = new ArrayList<String>();
    chanceCard.add("Advance to go. Collect £200");
    chanceCard.add("Advance to Whitehall");
    chanceCard.add("Bank pays you dividend of £50");
    chanceCard.add("Get out of Jail free");
    chanceCard.add("Go to Jail. Go Directly to Jail. Do not pass Go, do not collect £200");
    chanceCard.add("Go back 3 spaces");
    chanceCard.add("Pay poor tax of £15");
    chanceCard.add("Your building loan matures - collect £150");
    chanceCard.add("You have won a crossword competition - collect £100");
    chanceCard.add("Go forward 3 spaces - if you pass go, collect £200");

    double index = Math.random() * 10;
    String chance = chanceCard.get((int) (Math.random() * 10));
    System.out.println("Chance Card: " + chance);
    }
}
