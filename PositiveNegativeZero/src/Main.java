import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        checkNumber(number);
    }

    public static void checkNumber(int number)
    {
        if(number > 0)
        {
            System.out.println("positive");
        }
        else if(number < 0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
    }
}
