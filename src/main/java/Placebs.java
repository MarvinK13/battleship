import java.util.Scanner;

public class Placebs {
    public String[][] placebs(String[][] grid, String inputdriection, int pos1, int pos2) {
        Scanner sc = new Scanner(System.in);
        if (inputdriection.equals("v")) {
            while (pos1 >2 || grid[pos1 + 1][pos2].equals("X") || grid[pos1][pos2].equals("X") || grid[pos1 + 2][pos2].equals("X")) {
                System.out.println("\nPlease enter anoter line where no ship is and the grid is not expanded: ");
                pos1 = sc.nextInt();
                System.out.println("Please enter anoter collum: ");
                pos2 = sc.nextInt();
            }
            grid[pos1 + 2][pos2] = "X";
            grid[pos1 + 1][pos2] = "X";
            grid[pos1][pos2] = "X";

        } else if (inputdriection.equals("h")) {
            while (pos2 >2 || grid[pos1][pos2].equals("X") || grid[pos1][pos2 + 1].equals("X") || grid[pos1][pos2 + 2].equals("X")) {
                System.out.println("\nPlease enter anoter line where no ship is and the grid is not expanded: ");
                pos1 = sc.nextInt();
                System.out.println("Please enter anoter collum: ");
                pos2 = sc.nextInt();
            }
            grid[pos1][pos2] = "X";
            grid[pos1][pos2 + 1] = "X";
            grid[pos1][pos2 + 2] = "X";
        }
        return grid;
    }
}
