package StolovkaApp;

/**
 * Created by User on 25.10.2015.
 */
public class StolovkaApp {

    public static void main(String[] args) {

        Strava[] strava = new Strava[6];
        strava[0] = new Strava(120, 20, "Олів’є");
        strava[1] = new Strava(100, 56, "Котлета");
        strava[2] = new Strava(110, 8, "Суп з фрекадельками ");
        strava[3] = new Strava(115, 12, "Картопля");
        strava[4] = new Strava(95, 10, "Кукурудз’яна каша");
        strava[5] = new Strava(95, 10, "Салат");


        for (int i = 0; i < strava.length; i++) {
            System.out.println(strava[i]);
        }
    }

}

