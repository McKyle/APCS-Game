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
}