package domain;

public class Grid {

    private int gridSize;
    private int [][] matrix;

    public Grid() {
    }

    public Grid(int gridSize) {
        this.gridSize = gridSize;
        this.matrix = new int[gridSize][gridSize];
    }

    public int getGridSize() {
        return gridSize;
    }

    public void setGridSize(int gridSize) {
        this.gridSize = gridSize;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

}
