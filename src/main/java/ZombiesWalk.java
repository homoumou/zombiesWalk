import domain.Creature;
import domain.Grid;
import domain.Zombie;
import services.ZombieMovementRecorder;

public class ZombiesWalk {
    public static void main(String[] args) {
        ZombieMovementRecorder zombieMovementRecorder = new ZombieMovementRecorder();
        Zombie zombie1 = new Zombie(0,0);
        Creature creature1 = new Creature(0,1);
        Creature creature2 = new Creature(0,1);
        System.out.format("x: %d, y:%d",zombie1.getPositionX(), zombie1.getPositionY());
        Grid grid = new Grid(10);
        System.out.println("Grid" + grid.getMatrix());

        zombieMovementRecorder.recordCreature(grid,creature1);
        zombieMovementRecorder.recordZombieMovement(zombie1, grid);

        Zombie zombie2= new Zombie(0,4);
        zombie2.move('L', 10);
        System.out.format("x: %d, y:%d ",zombie2.getPositionX(), zombie2.getPositionY());

        Creature[] creatures = {creature1, creature2};

    }
}
