package battleship;

import java.util.Scanner;

public class BattleshipGame {

    Field field = new Field();

    public BattleshipGame(){}

    public void startPlaying(){
        Scanner sc = new Scanner(System.in);
        System.out.println("It`s time to play this game| B means Battleship and C means Cruiser");
        int inputline;
        int inputcollum;
        int counter = 0;

        for (int g = 1; g <= 10; g++) {
            System.out.print("(Try: "+g+" Insert a line you want to search(0-4): ");
            inputline = sc.nextInt();

            System.out.print("Insert a collum you want to search(0-4): ");
            inputcollum = sc.nextInt();

            if (field.isHit(inputline, inputcollum)) {
                System.out.println("You have hit a: " + field.getGridElement(inputline, inputcollum));
                field.destroyPartOfShip(inputline, inputcollum);
                field.printField();
                counter++;
            } else {
                System.out.println("You have hit nothing ");
            }
        }
        System.out.println("You had " + counter + " hits");
    }

    public void placeShipsRandom () {
        int inputLine;
        int inputColumn;
        String inputDirection;
        int counter = 1;

        while (counter <= 4) {
            inputLine = randomNumber();
            inputColumn = randomNumber();
            inputDirection = randomDirection();
            if (counter <= 2) {
                field.placeCruisers(inputDirection, inputLine, inputColumn);
            } else {
                field.placeBattleship(inputDirection, inputLine, inputColumn);
            }
            counter++;
        }
        field.printField();
    }


    public static String randomDirection() {
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
                System.exit(130);
        }
        return direction;
    }

    private int randomNumber() {
        int random = (int) (Math.random() * 5);
        return random;
    }
}
