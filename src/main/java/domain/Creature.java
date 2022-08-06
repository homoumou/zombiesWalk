package domain;

public class Creature {
    private int id;
    private int positionX;
    private int positionY;

    public Creature() {
    }

    public Creature(int id, int positionX, int positiony) {
        this.id = id;
        this.positionX = positionX;
        this.positionY = positiony;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
