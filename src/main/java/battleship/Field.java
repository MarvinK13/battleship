package battleship;

public class Field {

    private String[][] grid = {{"0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0"},
            {"0", "0", "0", "0", "0"}};


    public void placeBattleship(String inputDirection, int inputLine, int inputColumn) {
        if (inputDirection.equals("v")) {
            while (inputLine > 2 || !grid[inputLine + 1][inputColumn].equals("0") ||
                    !grid[inputLine][inputColumn].equals("0") || !grid[inputLine + 2][inputColumn].equals("0")) {
                inputLine = randomNumber();
                inputColumn = randomNumber();
            }
            grid[inputLine][inputColumn] = "B";
            grid[inputLine + 1][inputColumn] = "B";
            grid[inputLine + 2][inputColumn] = "B";

        } else if (inputDirection.equals("h")) {
            while (inputColumn > 2 || !grid[inputLine][inputColumn].equals("0") ||
                    !grid[inputLine][inputColumn + 1].equals("0") || !grid[inputLine][inputColumn + 2].equals("0")) {
                inputLine = randomNumber();
                inputColumn = randomNumber();
            }
            grid[inputLine][inputColumn] = "B";
            grid[inputLine][inputColumn + 1] = "B";
            grid[inputLine][inputColumn + 2] = "B";
        }
    }

    public void placeCruisers(String inputDirection, int inputLine, int inputColumn) {
        if (inputDirection.equals("v")) {
            while (inputLine > 3 || !grid[inputLine][inputColumn].equals("0") || !grid[inputLine + 1][inputColumn].equals("0")) {
                inputLine = randomNumber();
                inputColumn = randomNumber();
            }
            grid[inputLine][inputColumn] = "C";
            grid[inputLine + 1][inputColumn] = "C";
        } else if (inputDirection.equals("h")) {
            while (inputColumn > 3 || !grid[inputLine][inputColumn].equals("0") || !grid[inputLine][inputColumn + 1].equals("0")) {
                inputLine = randomNumber();
                inputColumn = randomNumber();
            }
            grid[inputLine][inputColumn] = "C";
            grid[inputLine][inputColumn + 1] = "C";
        }
    }

    public void printField() {
        for (int i = 0; i < grid.length; i++) {
            if (i == 0) {
                System.out.println("\nG|" + 0 + "--" + 1 + "--" + 2 + "--" + 3 + "--" + 4 + "|G");
            }
            System.out.println(i + "|" + grid[i][0] + "  " + grid[i][1] + "  " + grid[i][2] + "  " + grid[i][3] + "  " + grid[i][4] + "|" + i);
        }
    }

    public boolean isHit(int inputLine, int inputColumn) {
        return !grid[inputLine][inputColumn].equals("0");
    }


    public String getGridElement(int inputLine, int inputColumn) {
        return grid[inputLine][inputColumn];
    }

    public void destroyPartOfShip(int inputLine, int inputColumn) {
        grid[inputLine][inputColumn] = "0";
    }

    private int randomNumber() {
        int random = (int) (Math.random() * 5);
        return random;
    }
}
