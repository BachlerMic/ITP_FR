package at.htlwels.bachler;

/**
 * Created by Michael on 03.03.2017.
 */
public class Rechner {

    public Rechner() {
    }

    static int fibonachiberechnen (int stelle)
    {
        if(stelle<=0){
            return 0;
        } else if(stelle==1){
            return 1;
        } else{
            return fibonachiberechnen(stelle-2)+fibonachiberechnen(stelle-1);
        }

    }
}
