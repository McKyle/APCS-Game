/**
 * Class to represent the house.
 * 
 * @author Kyle McCoy and Joseph Rosenberry
 * @version 2/6/18
 */
import java.util.*;
public class House extends Thing
{
    private static ArrayList<Room> house;

    public House(String n, String d)
    {
        super (n, d);
        house = new ArrayList<Room>();
        house.add(new Room("front hall", "room"));
        house.add(new Room("bedroom", "room"));
        house.add(new Room("dining room", "room"));
        house.add(new Room("kitchen", "room"));
        house.add(new Room("living room", "room"));
        house.add(new Room("bathroom", "room"));
        house.add(new Room("study", "room"));
        house.add(new Room("bonus room", "room"));
        house.add(new Room("garage", "room"));
        house.add(new Room("laundry room", "room"));
        house.add(new Room("basement", "room"));
        house.add(new Room("room", "room"));
    }

    public static ArrayList<Room> getHouse()
    {
        return house;
    }
}