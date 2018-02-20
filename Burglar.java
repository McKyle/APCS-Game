/**
 * Class to represent the Burglar.
 * 
 * @author Kyle McCoy and Joseph Rosenberry
 * @version 2/6/18
 */
import java.util.*;
public class Burglar extends Character
{
    private ArrayList<Treasure> bag;
    private int numMoves;

    public Burglar(String n, String d, Room r)
    {
        super (n, d, r);
        bag = new ArrayList<Treasure>();
    }

    public void pickUp(ArrayList<Treasure> t)
    {
        for (int i = 0; i < t.size(); i++)
        {
            bag.add(t.get(i));
            t.remove(i);
        }
    }

    public String getTreasure()
    {
        for (int i = 0; i < t.size(); i++)
        {
            return bag(i) + ", ";
        }
    }
}