import java.util.ArrayList;
import java.util.Scanner;

public class Monopoly {


    public static void main(String[] args) {
        Scanner diceroll = new Scanner(System.in);




        Monopoly player = new Monopoly();
        player.playerSetup();
    }

    //the initial input/output - this will take the player name, randomly generate a token and output the name, token and initial funds
    public void playerSetup() {
    int PlayerMoney = 1500;
        String name;

        //random token generator that will be used in the output
        ArrayList<String> playertoken = new ArrayList<String>();
        playertoken.add("Boot");
        playertoken.add("Dog");
        playertoken.add("Horse and Rider");
        playertoken.add("Iron");
        playertoken.add("Battleship");
        playertoken.add("Race Car");
        playertoken.add("Thimble");
        playertoken.add("Wheelbarrow");

    double index = Math.random() * 8;
    String token = playertoken.get((int) (Math.random() * 8));

    //scanner to input player name
    Scanner playername = new Scanner(System.in);
        System.out.println("Please enter your name: ");
     name = playername.next();
        System.out.println("Hello" +" " + name + " " + "your token is " + token + " " + "and your starting funds are " + PlayerMoney + " "+ "Let's play!");

    }



    public void RollMoves(){
        //where the moves will go
    }
}
