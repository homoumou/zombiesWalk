package services;
import domain.Creature;
import domain.Grid;
import domain.Zombie;

public class ZombieMovementRecorder {

    public void recordZombieMovement(Zombie zombie, Grid grid){
        int[][] matrix = grid.getMatrix();

        if(matrix[zombie.getPositionX()][zombie.getPositionY()] == 1){
            System.out.format("zombie %d infected creature at (%d, %d)\r\n", zombie.getId(), zombie.getPositionX(), zombie.getPositionY());
        }
    }

    public Grid recordCreature(Grid grid, Creature creature){
        int[][] matrix = grid.getMatrix();
        matrix[creature.getPositionX()][creature.getPositionY()] = 1;
        grid.setMatrix(matrix);
        return grid;
    }
}
