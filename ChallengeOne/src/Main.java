import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter score: ");
        int score = scanner.nextInt();
        DisplayHighScorePosition(name, CalculateHighscorePosition(score));
    }

    public static void DisplayHighScorePosition(String name, int position)
    {
        System.out.println(name + " managed to get into position " + position);
    }

    public static int CalculateHighscorePosition(int score)
    {
        int highscorePosition = 0;

        if(score >= 1000)
        {
            highscorePosition = 1;
        }
        else if(score >= 500  && score < 1000)
        {
            highscorePosition = 2;
        }
        else if(score >= 100 && score < 500)
        {
            highscorePosition = 3;
        }
        else
        {
            highscorePosition = 4;
        }

        return highscorePosition;
    }
}
