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

    public void removeRoom(Room r)
    {
        if (r.equals(house.get(0)))
        {
            house.remove(0);
        }
        if (r.equals(house.get(1)))
        {
            house.remove(1);
        }
        if (r.equals(house.get(2)))
        {
            house.remove(2);
        }
        if (r.equals(house.get(3)))
        {
            house.remove(3);
        }
        if (r.equals(house.get(4)))
        {
            house.remove(4);
        }
    }
}