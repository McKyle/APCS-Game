/**
 * Class to represent furniture and other objects in rooms.
 * 
 * @author Kyle McCoy and Joseph Rosenberry
 * @version 2/6/18
 */
public class Obstacle extends Item {
    private Room location;
    public Obstacle(String n, String d, Room r){
        super (n, d);
        location = r;
    }
}