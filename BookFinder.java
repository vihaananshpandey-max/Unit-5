import java.util.Scanner;

public class BookFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is BookFinder, Enter your shelf number");
        int shelf = scanner.nextInt();
        find(shelf);
    }

    static void find(int shelf) {
        if (shelf == 1) {
            System.out.println("On shelf 1 you will find The Three Body Problem");
        } else if (shelf == 2) {
            System.out.println("On shelf 2 you will find The Dark Forest");
        } else if (shelf == 3) {
            System.out.println("On shelf 3 you will find Death's End");
        } else if (shelf == 4) {
            System.out.println("On shelf 4 you will find The Wandering Earth");
        } else {
            System.out.println("There is no such shelf");
        }
    }
}
