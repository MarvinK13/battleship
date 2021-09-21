import java.util.Scanner;

public class Play {
    public String[][] game(String[][] grid) {
        Scanner sc = new Scanner(System.in);
        System.out.println("It`s time to play this game| B means Battleship and C means Cruiser");
        int inputline;
        int inputcollum;
        int counter = 0;

        for (int g = 0; g < 10; g++) {
            System.out.print("Insert a line you want to search(0-4): ");
            inputline = sc.nextInt();
            System.out.print("Insert a collum you want to search(0-4): ");
            inputcollum = sc.nextInt();
            if (!grid[inputline][inputcollum].equals("0")) {
                System.out.println("You have hit a: " + grid[inputline][inputcollum]);
                grid[inputline][inputcollum] = "0";
                counter++;
            } else {
                System.out.println("You have hit nothing ");
            }
        }
        System.out.println("You had " + counter + " hits");
        return grid;
    }
}
