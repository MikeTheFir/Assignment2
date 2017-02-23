
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // new city and robot
        City kw = new City();
        Robot mtf = new Robot(kw, 2, 1, Direction.EAST);
        // new walls and a thing
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 7, Direction.EAST);
        new Wall(kw, 2, 8, Direction.SOUTH);
        new Wall(kw, 2, 9, Direction.SOUTH);
        new Thing(kw, 2, 9);
        //move towards finish line
        // jump over and come back down
        // stop at finish line
        while (!mtf.canPickThing()) {
            if (!mtf.frontIsClear()) {
                mtf.turnLeft();
                mtf.move();
                mtf.turnLeft();
                mtf.turnLeft();
                mtf.turnLeft();
                mtf.move();
                mtf.turnLeft();
                mtf.turnLeft();
                mtf.turnLeft();
                mtf.move();
                mtf.turnLeft();
            } else if (mtf.frontIsClear()) {
                mtf.move();
            }





        }
    }
