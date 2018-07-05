import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {

      //call method
      Dice rolldice = new Dice();
      rolldice.RollDice();
    }

    public static void RollDice() {


        Scanner dice = new Scanner(System.in);

        System.out.println("Type 'throw' to roll the dice");
        dice.next();

        int dice1 = (int)(Math.random()*6+1);
        int dice2 = (int)(Math.random()*6+1);
        int sum = dice1 + dice2;

        System.out.println("Roll: " + sum);

//        if ();
    }
}
