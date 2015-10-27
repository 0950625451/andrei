package info.teib.lab.Andrei.lab1;

import java.util.Scanner;

/**
 * Created by User on 24.09.2015.
 */
public class Kriate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;




        System.out.print("Введіть a:");
        a = Double. parseDouble(scanner.nextLine());

        System.out.print("Введіть b:");
        b = Double. parseDouble(scanner.nextLine());

        System.out.print("Введіть c:");
        c = Double. parseDouble(scanner.nextLine());

        double d = b*b - 4*a*c;
        double x1 = (-b -  Math.sqrt(d)) / (2*a);
        double x2 = (-b + Math.sqrt(d))  /  (2*a);




        System.out.println(d);
        System.out.println(x1);
        System.out.println(x2);






    }
}




