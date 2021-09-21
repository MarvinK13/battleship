import java.util.Scanner;

public class secondmain {
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
        while (counter <= 4) {
            inputline = (int) (Math.random() * 4);
            inputcollum = (int) (Math.random() * 4);
            inputdirection = v_or_h();

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (inputline == i && inputcollum == j) {
                        if (counter <= 2) {
                            grid = Cruisers.placecr(grid, inputdirection, inputline, inputcollum);
                        } else {
                            grid = Battleships.placebs(grid, inputdirection, inputline, inputcollum);
                        }
                    }
                }
            }
            counter++;
            //Printarray(grid);
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

    public static String v_or_h() {
        int random = (int) (Math.random() * 2 + 1);
        String direction = "";
        switch (random) {
            case 1:
                direction = "v";
                break;
            case 2:
                direction = "h";
                break;
            default:
                System.exit(101);
        }
        return direction;
    }
}
