import java.util.Scanner;

public class Placecs {
    public String[][] placecr(String[][] grid, String inputdriection, int pos1, int pos2) {
        Scanner sc = new Scanner(System.in);
        if (inputdriection.equals("v")) {
            while (grid[pos1][pos2].equals("X")||grid[pos1+1][pos2].equals("X")) {
                System.out.println("Please enter another line: ");
                pos1 = sc.nextInt();

                System.out.println("Please enter another line: ");
                pos2 = sc.nextInt();
            }
            if (pos1 <= 3) {
                grid[pos1 + 1][pos2] = "X";
            } else {
                grid[pos1 - 1][pos2] = "X";
            }


        } else if (inputdriection.equals("h")) {
            while (grid[pos1][pos2+1].equals("X")||grid[pos1][pos2 +1].equals("X")) {
                System.out.println("Please enter another line: ");
                pos1 = sc.nextInt();

                System.out.println("Please enter another line: ");
                pos2 = sc.nextInt();
            }
            if (pos2 <= 3) {
                grid[pos1][pos2 + 1] = "X";
            } else {
                grid[pos1][pos2 - 1] = "X";
            }

        }
        return grid;
    }
}
