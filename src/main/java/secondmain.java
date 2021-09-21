import java.util.Scanner;

public class secondmain {
    public static void main(String[] args) {
        String[][] grid = {{"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"}};
        Scanner sc = new Scanner(System.in);
        int inputline;
        int inputcollum;
        String inputdirection;
        String inputship;
        int counter = 1;
        System.out.println("This is your 5x5 playing grid: ");
        Printarray(grid);

        //System.out.println("c for Carrier or b for Battleship");
        //inputship = sc.nextLine().toLowerCase();

        while (counter <= 4) {
            System.out.println("In wich line do you want to set your ship?: ");
            inputline = sc.nextInt();

            System.out.println("In wich collum do you want to set your ship?: ");
            inputcollum = sc.nextInt();

            System.out.println("v for vertically or h for horizontally");
            inputdirection = sc.nextLine().toLowerCase();
            inputdirection = sc.nextLine().toLowerCase();

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (inputline == i && inputcollum == j) {
                        if (counter < 2) {
                            grid = placecr(grid, inputdirection, i, j);
                        } else {
                            grid = placebs(grid, inputdirection, i, j);
                        }
                        grid[i][j] = "X";
                    }
                }
            }
            counter++;
            Printarray(grid);
        }

        Printarray(grid);
    }

    public static void Printarray(String[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (i == 0) {
                System.out.println("\nG|" + 0 + "--" + 1 + "--" + 2 + "--" + 3 + "--" + 4 + "|");

            }
            System.out.println(i + "|" + grid[i][0] + "--" + grid[i][1] + "--" + grid[i][2] + "--" + grid[i][3] + "--" + grid[i][4] + "|");

        }
    }

    public static String[][] placebs(String[][] grid, String inputdriection, int pos1, int pos2) {
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

    public static String[][] placecr(String[][] grid, String inputdriection, int pos1, int pos2) {
        if (inputdriection.equals("v")) {
            if (pos1 <= 3) {
                grid[pos1 + 1][pos2] = "X";
            } else {
                grid[pos1 - 1][pos2] = "X";
            }

        } else if (inputdriection.equals("h")) {
            if (pos2 <= 3) {
                grid[pos1][pos2 + 1] = "X";
            } else {
                grid[pos1][pos2 - 1] = "X";
            }

        }
        return grid;
    }
}
