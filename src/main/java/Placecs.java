import java.util.Scanner;

public class Placecs {
    public String[][] placecr(String[][] grid, String inputdriection, int inputline, int inputcollum) {
        if (inputdriection.equals("v")) {
            while (inputline > 3 || !grid[inputline][inputcollum].equals("0") || !grid[inputline + 1][inputcollum].equals("0")) {
                inputline = randomnumber();
                inputcollum = randomnumber();
            }
            grid[inputline][inputcollum] = "C";
            grid[inputline + 1][inputcollum] = "C";
        } else if (inputdriection.equals("h")) {
            while (inputcollum > 3 || !grid[inputline][inputcollum].equals("0") || !grid[inputline][inputcollum + 1].equals("0")) {
                inputline = randomnumber();
                inputcollum = randomnumber();
            }
            grid[inputline][inputcollum] = "C";
            grid[inputline][inputcollum + 1] = "C";
        }
        return grid;
    }

    public static int randomnumber() {
        int random = (int) (Math.random() * 5);
        return random;
    }
}
