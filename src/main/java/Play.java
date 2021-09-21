import java.util.Scanner;

public class Play {
    public String[][] game(String[][] grid) {
        Scanner sc = new Scanner(System.in);
        System.out.println("It`s time to play this game| B means Battleship and C means Cruiser");
        int inputline;
        int inputcollum;

        for (int g = 0; g < 10; g++) {
            System.out.println("Insert a line you want to search(0-4)");
            inputline = sc.nextInt();
            System.out.println("Insert a collum you want to search(0-4)");
            inputcollum = sc.nextInt();
            if (!grid[inputline][inputcollum].equals("0")) {
                System.out.println("You have hit a: " + grid[inputline][inputcollum]);
                grid[inputline][inputcollum] = "0";
            } else {
                System.out.println("You have hit nothing ");
            }
        }
        return grid;
    }
}
