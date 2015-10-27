package Lab2;

/**
 * Created by User on 15.10.2015.
 */
public class Geometry {
    public static void main(String[] args) {

        double x = 0.5;
        double sum = 0;
        double prevX = 1;
        sum = sum + 1;

        // n = 0;
        sum = sum + 1;

        //n = 1
        sum = sum + x;

        for (int n = 0; n < 10; n++);{
            prevX = prevX * x;
        }
        System.out.println(prevX);
    }


}

