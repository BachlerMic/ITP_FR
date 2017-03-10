package at.htlwels.bachler;

/**
 * Created by Michael on 03.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Rechner r = new Rechner();
        int stelle = 7;
        System.out.println("Die Zahl an der Stelle "+stelle+" ist "+r.fibonachiberechnen(stelle));
    }

}
