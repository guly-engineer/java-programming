package exercises.projectGuly;

import java.util.Random;

public class CoinGuly {

    public static final String HEADS="Heads";
    public static final String TAILS="Tails";
    private String side;


    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }


    public void flip() {
        if(new Random().nextBoolean()){setSide(HEADS);}
        else setSide(TAILS);
    }
}
