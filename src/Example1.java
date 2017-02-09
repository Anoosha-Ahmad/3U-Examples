
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
 * @author ahmaa1808
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating a new city called kitchener
        City kitchener = new City();
        //Creating a robot: living where, what place, directiom
        Robot karel = new Robot(kitchener, 2,1, Direction.EAST);
        //movement of the robot 
        karel.move(); 
        karel.turnLeft();
        //Adding an object to the city
        new Thing(kitchener,2,2);
        //Creation of the wall
        new Wall(kitchener,2,2,Direction.EAST);
        //Interaction with objects
        karel.pickThing();
        karel.putThing();
        
    }
}
