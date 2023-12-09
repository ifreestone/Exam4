import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private int numSides;
    private int value;

    Die() {
        this.numSides = 6;
        this.value = 1;
    }

    public void setNumSides(int numS) {
        numSides = numS;
    }
    public void setValue(int numV) {
        value = numV;
    }
    public int getNumSides() {
        return numSides;
    }
    public int getValue() {
        return value;
    }

    Die(int numSides) {
        this.numSides = 1;
    }

    @Override
    public String toString() {
        return "Number of sides: " + numSides + "Roll value: " + value;
    }

    public int roll() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, numSides);
        return randomNum;
    }



}
