package info.teib.lab.Andrei.lab1;

import java.util.Scanner;

/**
 * Created by User on 26.10.2015.
 */
public class Kvadrat {

    public static class KvadratRiv {
        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            System.out.println("������ ����� a");
            int a = scr.nextInt();
            System.out.println("������ ����� b");
            int b = scr.nextInt();
            System.out.println("������ ����� c");
            int c = scr.nextInt();

            int d = (b * b) - (4 * a * c);

            if (d < 0){
                System.out.println("г������ �������� �� ��");
            }else if (d > 0){
                double sqrtD = Math.sqrt(d);
                double x1 = (-b - sqrtD) / 2 / a;
                double x2 = (-b + sqrtD) / 2 / a;

                System.out.println("x1 =" +  x1);
                System.out.println("x2 =" +  x2);
            }else if (d == 0){
                double x = -d / (2 * a);
                System.out.println("x =" + x);
            }





        }
    }
}
