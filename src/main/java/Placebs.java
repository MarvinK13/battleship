import java.util.Scanner;

public class Placebs {
    public String[][] placebs(String[][] grid, String inputdriection, int inputline, int inputcollum) {
        if (inputdriection.equals("v")) {
            while (inputline > 2 || !grid[inputline + 1][inputcollum].equals("0") ||
                    !grid[inputline][inputcollum].equals("0") || !grid[inputline + 2][inputcollum].equals("0")) {
                inputline = randomnumber();
                inputcollum = randomnumber();
            }
            grid[inputline][inputcollum] = "B";
            grid[inputline + 1][inputcollum] = "B";
            grid[inputline + 2][inputcollum] = "B";

        } else if (inputdriection.equals("h")) {
            while (inputcollum > 2 || !grid[inputline][inputcollum].equals("0") ||
                    !grid[inputline][inputcollum + 1].equals("0") || !grid[inputline][inputcollum + 2].equals("0")) {
                inputline = randomnumber();
                inputcollum = randomnumber();
            }
            grid[inputline][inputcollum] = "B";
            grid[inputline][inputcollum + 1] = "B";
            grid[inputline][inputcollum + 2] = "B";
        }
        return grid;
    }

    public static int randomnumber() {
        int random = (int) (Math.random() * 5);
        return random;
    }
}
