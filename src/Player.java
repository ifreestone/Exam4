public class Player {
    private String name;
    private Die die = new Die();

    private int playerRoll;

    Player(String name, int numS) {
        this.name = name;
        this.die.setNumSides(numS);
    }

    public void setSides(int numS) {
        die.setNumSides(numS);
    }

    public String getName() {
        return name;
    }
    public int getSides() {
        return die.getNumSides();
    }

    public Die getDie() {
        return die;
    }

    public void setRoll(int randomNum) {
        playerRoll = randomNum;
    }
    public int getPlayerRoll() {
        return playerRoll;
    }

}
