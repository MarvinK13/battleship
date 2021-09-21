import java.util.Scanner;

public class Placecs {
    public String[][] placecr(String[][] grid, String inputdriection, int pos1, int pos2) {
        Scanner sc = new Scanner(System.in);
        if (inputdriection.equals("v")) {

            while (pos1 >3 || grid[pos1][pos2].equals("X") || grid[pos1+1][pos2].equals("X")) {
                //System.out.println("\nPlease enter anoter line where no ship is and the grid is not expanded: ");
                pos1 = randomnumber();
                //System.out.println("Please enter anoter collum where no ship is and the grid is not expanded: ");
                pos2 = randomnumber();
            }
            grid[pos1][pos2] = "X";
            grid[pos1+1][pos2] = "X";
        } else if (inputdriection.equals("h")) {

            while (pos2 >3 || grid[pos1][pos2].equals("X") || grid[pos1][pos2 + 1].equals("X")) {
                //System.out.println("\nPlease enter anoter line where no ship is and the grid is not expanded: ");
                pos1 = randomnumber();
                //System.out.println("Please enter anoter collum where no ship is and the grid is not expanded: ");
                pos2 = randomnumber();
            }
            grid[pos1][pos2] = "X";
            grid[pos1][pos2+1] = "X";
        }
        return grid;
    }
    public static int randomnumber() {
        int random = (int) (Math.random() * 4);
        return random;
    }
}
