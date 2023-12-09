import java.util.ArrayList;
import java.util.Scanner;
public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of sides for the dice: ");
        int playerSides = sc.nextInt();

        System.out.println("Please input the number of players: ");
        int numOfPlayers = sc.nextInt();
        
        ArrayList<Player> players = new ArrayList<>();
        String name;
        sc.nextLine();
        while (numOfPlayers > 0) {
            System.out.println("Enter your name: ");
            name = sc.nextLine();
            players.add(new Player(name, playerSides));
            Die die = players.get(i).getDie();
            players.get(i).setRoll(die.roll());
            numOfPlayers--;
        }

        for (int i = 0; i < players.size(); i++) {
            System.out.println("Player " + players.get(i).getName() + " rolled a " + players.get(i).getPlayerRoll() + " on a "
                    + playerSides + " sided die.");

        }

        System.out.println("Player " + players.get().getName() + " won the game.");

    }

    public static int decideWinner(ArrayList players) {
        //number of factors led to not finishing this in time, inlcuding a blue screen :), whoopsies
    }

}
