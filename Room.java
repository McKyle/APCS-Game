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
    private int roomNum;
    private static int nextRoomNum = 0;
    
    public Room(String n, String d)
    {
        super (n, d);
        roomNum = nextRoomNum;
        loot = new ArrayList<Treasure>();
        for (int i = 0; i < (int)(Math.random()*10); i++)
        {
            loot.add(new Treasure("Ring", "Diamond", 1000, 1));
        }
        nextRoomNum++;
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
    
    public ArrayList<Treasure> getTreasure()
    {
        return loot;
    }
}