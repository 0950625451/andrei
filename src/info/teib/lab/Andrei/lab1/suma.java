package info.teib.lab.Andrei.lab1;

import java.util.Scanner;

/**
 * Created by User on 24.09.2015.
 */
public class suma {

    public static void main(String[] args) {

        int a = 9;
        int b = 19;

        int sumEven = 0;    // парне
        int sumOdd = 0;     // непарне

        for (int i = a; i <= b; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }

        System.out.println("Сума парних: " + sumEven);
        System.out.println("Сума непарних: " + sumOdd);

        int i = 20;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }


    }
}









