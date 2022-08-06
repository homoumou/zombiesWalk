import domain.Creature;
import domain.Grid;
import domain.Zombie;
import services.ReadJSON;
import services.ZombieMovementRecorder;

import java.util.ArrayList;

public class ZombiesWalk {

    public static void main(String[] args) {
        ZombieMovementRecorder zombieMovementRecorder = new ZombieMovementRecorder();
        Grid grid = new Grid(10);
        ReadJSON readJSON = new ReadJSON();
        ArrayList<Zombie> zombies = readJSON.getZombies();
        ArrayList<Creature> creatures = readJSON.getCreatures();
        Zombie zombie = zombies.get(0);
        String move = readJSON.getMove();
        String[] directions = move.split("");
        for (Creature creature : creatures){
            grid = zombieMovementRecorder.recordCreature(grid,creature);
        }
        zombieMovementRecorder.recordZombieMovement(zombie, grid);

        for (String direction : directions){
            zombie.move(direction, grid.getGridSize());
            System.out.format("zombie position (%d, %d)\r\n", zombie.getPositionX(), zombie.getPositionY());
            zombieMovementRecorder.recordZombieMovement(zombie, grid);
        }
    }
}
