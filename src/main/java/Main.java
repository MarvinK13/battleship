import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] grid = {{"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"}};
        Scanner sc = new Scanner(System.in);
        Placecs Cruisers = new Placecs();
        Placebs Battleships = new Placebs();
        int inputline;
        int inputcollum;
        String inputdirection;
        String inputship;
        int counter = 1;

        System.out.println("This is your 5x5 playing grid: ");
        Printarray(grid);

        System.out.println("First you place your 2 Crusiers and then your 2 Battleships");
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
                        if (counter <= 2) {
                            grid = Cruisers.placecr(grid, inputdirection, inputline, inputcollum);
                            Printmessage("Cruiser", inputline, inputcollum);
                        } else {
                            grid = Battleships.placebs(grid, inputdirection, inputline, inputcollum);
                            Printmessage("Battleship", inputline, inputcollum);
                        }
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

    public static void Printmessage(String ship, int inputline, int inputcollum) {
        System.out.println("Your " + ship + " was Placed in Line: " + inputline + " and collum: " + inputcollum);
    }
}
