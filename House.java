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
        Room r0 = new Room("front hall", "room");
        Room r1 = new Room("bedroom", "room");
        Room r2 = new Room("dining room", "room");
        Room r3 = new Room("kitchen", "room");
        Room r4 = new Room("living room", "room");
        house.add(r0);
        house.add(r1);
        house.add(r2);
        house.add(r3);
        house.add(r4);
    }
    
    public static ArrayList<Room> getHouse()
    {
        return house;
    }
    
    public ArrayList<Room> removeRoom(Room r)
    {
        //
        if (s.equalsIgnoreCase("front hall"))
            location = House.getHouse().get(0);
        if (s.equalsIgnoreCase("bedroom"))
            location = House.getHouse().get(1);
        if (s.equalsIgnoreCase("dining room"))
            location = House.getHouse().get(2);
        if (s.equalsIgnoreCase("kitchen"))
            location = House.getHouse().get(3);
        if (s.equalsIgnoreCase("living room"))
            location = House.getHouse().get(4);
    }
}