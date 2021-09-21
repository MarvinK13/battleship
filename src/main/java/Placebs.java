public class Placebs {
    public String[][] placebs(String[][] grid, String inputdriection, int pos1, int pos2) {
        if (inputdriection.equals("v")) {
            if (pos1 <= 2) {
                grid[pos1 + 1][pos2] = "X";
                grid[pos1 + 2][pos2] = "X";
            } else {
                grid[pos1 - 1][pos2] = "X";
                grid[pos1 - 2][pos2] = "X";
            }

        } else if (inputdriection.equals("h")) {
            if (pos2 <= 2) {
                grid[pos1][pos2 + 1] = "X";
                grid[pos1][pos2 + 2] = "X";
            } else {
                grid[pos1][pos2 - 1] = "X";
                grid[pos1][pos2 - 2] = "X";
            }

        }
        return grid;
    }
}
