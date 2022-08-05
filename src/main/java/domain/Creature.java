package domain;

public class Creature {
    private int positionX;
    private int positionY;

    public Creature() {
    }

    public Creature(int positionX, int positiony) {
        this.positionX = positionX;
        this.positionY = positiony;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positiony) {
        this.positionY = positiony;
    }
}
