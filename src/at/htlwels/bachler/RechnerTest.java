package at.htlwels.bachler;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michael on 10.03.2017.
 */
public class RechnerTest {
    @Test
    public void fibonachiberechnen() throws Exception {
            Rechner r = new Rechner();
            int stelle = 7;
            System.out.println("Die Zahl an der Stelle "+stelle+" ist "+r.fibonachiberechnen(stelle));
    }

}