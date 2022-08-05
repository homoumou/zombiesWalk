package domain;

public class Zombie {
    private int positionX;
    private int positionY;


    public Zombie() {
    }

    public Zombie(int positionX, int positionY ) {
        this.positionX = positionX;
        this.positionY = positionY;
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

    public void move(char move, int gridSize) {
        switch (move) {
            case 'U':
                if(positionY == gridSize-1) {
                   positionY = 0;
                   break;
                }
                positionY += 1;
            break;
            case 'D':
                if(positionY == 0) {
                    positionY = gridSize-1;
                    break;
                }
                positionY -= 1;
                break;
            case 'L':
                if(positionX == 0) {
                    positionX = gridSize-1;
                    break;
                }
                positionX -= 1;
                break;
            case 'R':
                if(positionX == gridSize-1) {
                    positionX = 0;
                    break;
                }
                positionX += 1;
                break;
        }
    }
}
