package domain;

public class Zombie {
    private int id;
    private int positionX;
    private int positionY;


    public Zombie() {
    }

    public Zombie(int id, int positionX, int positionY ) {
        this.id = id;
        this.positionX = positionX;
        this.positionY = positionY;
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

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void move(String move, int gridSize) {
        switch (move) {
            case "D":
                if(positionY == gridSize-1) {
                   positionY = 0;
                   break;
                }
                positionY += 1;
            break;
            case "U":
                if(positionY == 0) {
                    positionY = gridSize-1;
                    break;
                }
                positionY -= 1;
                break;
            case "L":
                if(positionX == 0) {
                    positionX = gridSize-1;
                    break;
                }
                positionX -= 1;
                break;
            case "R":
                if(positionX == gridSize-1) {
                    positionX = 0;
                    break;
                }
                positionX += 1;
                break;
        }
    }
}
