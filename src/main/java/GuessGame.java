import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private static GuessGame instance = new GuessGame();
    private int score = 0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private GuessGame() {

    }

    public static GuessGame getInstance() {
        return instance;
    }

    protected Object readResolved() {
        return getInstance();
    }

    public void play() {
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(9);
            int guess = scanner.nextInt();

            if (number == guess)
                score++;
        }
    }

    public int getScore() {
        return score;
    }
}
