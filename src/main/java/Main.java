public class Main {
    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if (game == anotherGameReference) {
            System.out.println("Sigleton");
            if (score == anotherGameReference.getScore()) {
                System.out.println("Same points");
            }
        }
    }
}