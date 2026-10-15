import java.util.Scanner;

public class Gambling {
    public static void main(String[] args) {
        intro();
        Scanner scanner = new Scanner(System.in);
        int money = 10; // Start with $10
        while (money > 0) {
            System.out.println("MONEY: $" + money);
            System.out.print("Enter the stake, or 0 to quit: $");
            int stake = scanner.nextInt();
            // Check if the user wants to quit
            if (stake == 0) {
                System.out.println("You ended with $" + money + ".");
                break;
            }
            // Check if the stake is valid
            if (stake < 0 || stake > money) {
                System.out.println("Invalid stake.");
                continue;
            }
            // User doubles their stake, or loses it
            boolean won = randomBoolean();
            if (won) {
                money += stake;
                System.out.println("You won! (+$" + stake + ")");
            } else {
                money -= stake;
                System.out.println("You lost! (-$" + stake + ")");
            }
        }
        if (money == 0) {
            System.out.println("You're out of money!");
        }
    }

    /** Returns true 50% of the time, false otherwise */
    public static boolean randomBoolean() {
        return Math.random() < 0.5;
    }

    public static void intro() {
        System.out.println("Welcome!");
        System.out.println("In this game, you start with $10.");
        System.out.println("Every turn, you can bet some of your money (a stake).");
        System.out.println("There is a 50% chance it is doubled, and a 50% chance you lose it.");
        System.out.println("You can quit at any time. The game also ends if you reach $0.");
        System.out.println();
    }
}
