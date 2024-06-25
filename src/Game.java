import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int random2 = random.nextInt(30);

        int a = 0;

        while (true){
            if (a == 10){
                break;
            }

            int number = scanner.nextInt();
            if (number < random2){
                System.out.println("Введене число менше ніж загадане");
            }
            if (number > random2){
                System.out.println("Введене число більше ніж загадане");
            }
            if (number ==  random2){
                System.out.println("Число вгадане");

            break;
            }

            a++;
        }
    }
}