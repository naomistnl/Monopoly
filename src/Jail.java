public class Jail {
    public static void main(String[] args) {

    Jail gotojail = new Jail();
    gotojail.GoToJail();

    Jail missaturn = new Jail();
    missaturn.MissATurn();
    }


    public static void GoToJail() {
        System.out.println("You are in jail");

    MissATurn();
    }

    public static void MissATurn() {
        System.out.println("miss a turn");
    }
}
