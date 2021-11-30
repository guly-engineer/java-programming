package exercises.chapter9;

public class BirthdayCakeGuly extends CakeGuly{
    protected int candles;

    public BirthdayCakeGuly(String flavor) {
        super(flavor);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
