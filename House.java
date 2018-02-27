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
        Room r5 = new Room("bathroom", "room");
        Room r6 = new Room("study", "room");
        Room r7 = new Room("bonus room", "room");
        Room r8 = new Room("garage", "room");
        Room r9 = new Room("laundry room", "room");
        Room r10 = new Room("basement", "room");
        house.add(r0);
        house.add(r1);
        house.add(r2);
        house.add(r3);
        house.add(r4);
        house.add(r5);
        house.add(r6);
        house.add(r7);
        house.add(r8);
        house.add(r9);
        house.add(r10);
    }

    public static ArrayList<Room> getHouse()
    {
        return house;
    }
}