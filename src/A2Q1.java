
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // city and robot created
        City kw = new City();
        Robot mtf = new Robot(kw, 1, 1, Direction.EAST);
        //new things put in
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);
        // put robot into place
        mtf.move();
        // count the things in its backpakc and pick up things  and move if its less than 7
        while (mtf.countThingsInBackpack() < 7) {
            mtf.pickThing();
            mtf.move();
        }
        // mmove while there is a thing underneath him
        while (mtf.canPickThing()) {
            mtf.move();
        }
    }
}
