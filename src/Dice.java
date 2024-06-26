import java.util.Random;

public class Dice {
    private int faceValue;
    private final Random randomEngine;

    public Dice() {
        this.randomEngine = new Random();
        roll();
    }

    public void roll() {
        faceValue = randomEngine.nextInt(1, 7) ;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
//6510451085 Aphisit Prasertvesyakorn