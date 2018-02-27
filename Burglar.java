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
    private int numTreasure;

    public Burglar(String n, String d, Room r)
    {
        super (n, d, r);
        bag = new ArrayList<Treasure>();
        numTreasure = 0;
    }

    public void pickUp(ArrayList<Treasure> t)
    {
        for (int i = numTreasure; i < (numTreasure + t.size()); i++)
        {
            int i2 = 0;
            bag.add(t.get(i2));
            i2++;
        }
        numTreasure += t.size() - 1;
        this.getLocation().done();
    }

    public String getTreasure()
    {
        for (int i = 0; i < bag.size(); i++)
        {
            if (i == 0)
                System.out.print(bag.get(i));
            if (i != 0)
                System.out.print(", " + bag.get(i));
        }
        return "";
    }
    
    public ArrayList<Treasure> getBag()
    {
        return bag;
    }
}