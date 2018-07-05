import java.util.ArrayList;

public class CommChest {

    public static void main(String[] args) {
    //calling the community chest method
    CommChest cc = new CommChest();
    cc.CommunityChest();
    }
//community chest method - uses Math.random to randomly generate a community chest outcome when called.
public void CommunityChest(){
    ArrayList<String> commchest = new ArrayList<String>();
    commchest.add("Advance to go. Collect £200");
    commchest.add("Bank Error in your favour - collect £75");
    commchest.add("Doctor's fees - pay £50");
    commchest.add("Get out of Jail free");
    commchest.add("Go to Jail. Go Directly to Jail. Do not pass Go, do not collect £200");
    commchest.add("It is your birthday - collect £10 from each player");
    commchest.add("Income Tax refund - collect £20");
    commchest.add("Pay Hospital fees - £100");
    commchest.add("Receive £25 consultancy fee");
    commchest.add("You inherit £100");

    double index = Math.random() * 10;
    String chest = commchest.get((int) (Math.random()) * 10);
    System.out.println("Community Chest: " + chest);
    }
}
