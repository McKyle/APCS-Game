/**
 * Class to represent different rooms in house.
 * 
 * @author Kyle McCoy and Joseph Rosenberry
 * @version 2/6/18
 */
import java.util.*;
public class Room extends Thing
{
    private ArrayList<Treasure> loot;
    private boolean obstacle;
    private boolean visited;

    public Room(String n, String d)
    {
        super (n, d);
        loot = new ArrayList<Treasure>();
        Treasure t1 = new Treasure("Crown", "Gold", 200000);
        Treasure t2 = new Treasure("Chalice", "Silver", 50000);
        Treasure t3 = new Treasure("Idol", "Jade", 50000);
        Treasure t4 = new Treasure("Bag o' Gold", "", 100000);
        Treasure t5 = new Treasure("Ring", "Diamond", 500000);

        int i = (int)(Math.random()*2);
        if (i == 0)
            obstacle = false;
        if (i == 1)
            obstacle = true;
        
        int t = (int)(Math.random()*5);
        if (t == 0)
        {
            loot.add(t1);
        }
        if (t == 1)
        {
            loot.add(t2);
        }
        if (t == 2)
        {
            loot.add(t3);
        }
        if (t == 3)
        {
            loot.add(t4); 
        }
        if (t == 4)
        {
            loot.add(t5);
        }
    }

    public void createObstacle()
    {
        int i = (int)(Math.random()*2);
        if (i == 0)
            obstacle = false;
        if (i == 1)
            obstacle = true;
        
    }

    public boolean isObstacle()
    {
        return obstacle;
    }

    public ArrayList<Treasure> getLoot()
    {
        return loot;
    }

    public boolean beenVisited()
    {
        return visited;
    }

    public void done()
    {
        visited = true;
    }
}