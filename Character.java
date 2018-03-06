/**
 * Class to repersent a character.
 * 
 * @author Kyle McCoy and Joseph Rosenberry
 * @version 2/6/18
 */
import java.util.*;
public abstract class Character extends Thing
{
    private Room location;
    private int numMoves;

    public Character(String n, String d, Room r)
    {
        super (n, d);
        location = r;
    }

    public void move(String s)
    {
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
        if (s.equalsIgnoreCase("bathroom"))
            location = House.getHouse().get(5);
        if (s.equalsIgnoreCase("study"))
            location = House.getHouse().get(6);
        if (s.equalsIgnoreCase("bonus room"))
            location = House.getHouse().get(7);
        if (s.equalsIgnoreCase("garage"))
            location = House.getHouse().get(8);
        if (s.equalsIgnoreCase("laundry room"))
            location = House.getHouse().get(9);
        if (s.equalsIgnoreCase("basement"))
            location = House.getHouse().get(10);
        if (s.equalsIgnoreCase("room"))
            location = House.getHouse().get(11);
        numMoves++;
    }

    public Room getLocation()
    {
        return location;
    }

    public int getNumMoves()
    {
        return numMoves;
    }

    public String locationToString()
    {
        if (location.equals(House.getHouse().get(0)))
            return "front hall";
        if (location.equals(House.getHouse().get(1)))
            return "bedroom";
        if (location.equals(House.getHouse().get(2)))
            return "dining room";
        if (location.equals(House.getHouse().get(3)))
            return "kitchen";
        if (location.equals(House.getHouse().get(4)))
            return "living room";
        if (location.equals(House.getHouse().get(5)))
            return "bathroom";
        if (location.equals(House.getHouse().get(6)))
            return "study";
        if (location.equals(House.getHouse().get(7)))
            return "bonus room";
        if (location.equals(House.getHouse().get(8)))
            return "garage";
        if (location.equals(House.getHouse().get(9)))
            return "laundry room";
        if (location.equals(House.getHouse().get(10)))
            return "basement";
        if (location.equals(House.getHouse().get(11)))
            return "room";
        return "";
    }
}