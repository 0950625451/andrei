package StolovkaApp;

/**
 * Created by User on 25.10.2015.
 */
public class Strava {
    int cina;
    int kaloriji;
    String name;


    public Strava(int cina, int kaloriji, String name) {
        this.cina = cina;
        this.kaloriji = kaloriji;

        this.name = name;
    }

    public String toString() {
        return String.format(
                " %9s страва\t, Цін -: %5d,\t Калорійність %d ",

                this.name, this.cina, this.kaloriji
        );
    }

}

