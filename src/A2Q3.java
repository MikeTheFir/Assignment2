
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city and robot
        City kw = new City();
        Robot mtf = new Robot(kw, 100, 69, Direction.NORTH);
        // robot moves west to avenue 0
        while (mtf.getStreet() > 0) {
            while (mtf.getAvenue() > 0) {
                if (mtf.getDirection() != Direction.WEST) {
                    mtf.turnLeft();
                } else if (mtf.getDirection() == Direction.WEST);
                {
                    mtf.move();
                }
            }
            //whilst at avenue 0 mtf moves north to street 0
            while (mtf.getAvenue() == 0) {
                if (mtf.getDirection() != Direction.NORTH) {
                    mtf.turnLeft();
                }
                if (mtf.getDirection() == Direction.NORTH && mtf.getStreet() > 0) {
                    mtf.move();
                }
            }
        }
    }
}
}