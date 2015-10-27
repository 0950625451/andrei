package Lab2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by User on 15.10.2015.
 */
public class Zadacha {

    public static void main(String[] args) {

        Random r = new Random();

        int number = r.nextInt(100);

        System.out.println("Я загадав число між 0 до 100, спробуй відгадати його");

        int response;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            response = Integer.parseInt(scanner.nextLine());

            if (response == number) {
                System.out.println("Ви відгадали число");
                break;
            } else if (response < number) {
                System.out.println("Ваше число менше мого");
            } else {
                System.out.println("Ваше число більше мого");
            }
        }

    }

}


