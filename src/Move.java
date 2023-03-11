import java.util.Scanner;

public enum Move {
    ROCK,
    PAPER,
    SCISSORS;

    private class User {
        private Scanner inputScanner;

        public User() {
            inputScanner = new Scanner(System.in);
        }

        public Move getMove() {

            return null;
        }
    }

    private class Computer {
        public Move getMove() {

            return null;
        }
    }



    public static void main(String[] args) {

    }

    public int compareMoves(Move otherMove) {
        if (this == otherMove)
            return 0;

        switch (this) {
            case ROCK:
                return (otherMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (otherMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (otherMove == PAPER ? 1 : -1);
        }



        return 0;
    }
}
