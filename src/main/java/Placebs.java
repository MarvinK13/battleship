import java.util.Scanner;

public class Placebs {
    public String[][] placebs(String[][] grid, String inputdriection, int pos1, int pos2) {
        Scanner sc = new Scanner(System.in);
        if (inputdriection.equals("v")) {
            while (pos1 >2 || !grid[pos1 + 1][pos2].equals("0") || !grid[pos1][pos2].equals("0") || !grid[pos1 + 2][pos2].equals("0")) {
                //System.out.println("\nPlease enter anoter line where no ship is and the grid is not expanded: ");
                pos1 = randomnumber();
                //System.out.println("Please enter anoter collum where no ship is and the grid is not expanded: ");
                pos2 = randomnumber();
            }
            grid[pos1 + 2][pos2] = "B";
            grid[pos1 + 1][pos2] = "B";
            grid[pos1][pos2] = "B";

        } else if (inputdriection.equals("h")) {
            while (pos2 >2 || !grid[pos1][pos2].equals("0") || !grid[pos1][pos2 + 1].equals("0") || !grid[pos1][pos2 + 2].equals("0")) {
                //System.out.println("\nPlease enter anoter line where no ship is and the grid is not expanded: ");
                pos1 = randomnumber();
                //System.out.println("Please enter anoter collum where no ship is and the grid is not expanded: ");
                pos2 = randomnumber();
            }
            grid[pos1][pos2] = "B";
            grid[pos1][pos2 + 1] = "B";
            grid[pos1][pos2 + 2] = "B";
        }
        return grid;
    }
    public static int randomnumber() {
        int random = (int) (Math.random() * 5);
        return random;
    }
}
