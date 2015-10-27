package info.teib.lab.Andrei.lab1;

import java.util.Scanner;

/**
 * Created by User on 01.10.2015.
 */
public class Labka {

    public static void main(String[] args) {

        int a = 20;
        int b = 40;
        int sum = 0;
        int sumEven = 0; //команад sumEven сума парних чисел.
        int sumOdd = 0;  //Команда SumOdd  сума непарних числел.

        for (int i = a; i <= b; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }
        //cntl alt l робить нармальне форматування коду.

        System.out.println("Сума парних: " + sumEven);
        System.out.println("Сума непарних " + sumOdd);


    }
}



