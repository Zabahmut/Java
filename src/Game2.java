
import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву дня тижня на українській:");
        String day = scanner.nextLine();

        switch (day) {
            case "понеділок":
                System.out.println("Monday");
                break;
            case "вівторок":
                System.out.println("Tuesday");
                break;
            case "середа":
                System.out.println("Wednesday");
                break;
            case "четвер":
                System.out.println("Thursday");
                break;
            case "п'ятниця":
                System.out.println("Friday");
                break;
            case "субота":
                System.out.println("Saturday");
                break;
            case "неділя":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Невідомий день тижня");
                break;
        }
    }
}
