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
    private int crowns = 0, chalices = 0, idols = 0, bags = 0, rings = 0;

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
        int[] nums = new int [5];
        ArrayList<Treasure> names = new ArrayList<Treasure>();
        String crowns = "", chalices = "", idols = "", bags = "", rings = "";
        for (int r = 0; r < bag.size(); r++)
        {
            if (bag.get(r).getName().equals("Crown"))
                nums[0] += 1;
            if (bag.get(r).getName().equals("Chalice"))
                nums[1] += 1;
            if (bag.get(r).getName().equals("Idol"))
                nums[2] += 1;
            if (bag.get(r).getName().equals("Bag o' Gold"))
                nums[3] += 1;
            if (bag.get(r).getName().equals("Ring"))
                nums[4] += 1;
        }
        names.add(new Treasure("Crown", "Gold", 200000));
        names.add(new Treasure("Chalice", "Silver", 50000));
        names.add(new Treasure("Idol", "Jade", 50000));
        names.add(new Treasure("Bag o' Gold", "", 100000));
        names.add(new Treasure("Ring", "Diamond", 500000));
        if (nums[0] == 1)
            crowns = nums[0] + " " + names.get(0) + ", ";
        else 
            crowns = nums[0] + " " + names.get(0) + "s, ";
        if (nums[1] == 1)
            chalices = nums[1] + " " + names.get(1) + ", ";
        else 
            chalices = nums[1] + " " + names.get(1) + "s, ";
        if (nums[2] == 1)
            idols = nums[2] + " " + names.get(2) + ", ";
        else 
            idols = nums[2] + " " + names.get(2) + "s, ";
        if (nums[3] == 1)
            bags = nums[3] + " " + names.get(3) + ", ";
        else 
            bags = nums[3] + " " + names.get(3) + "s, ";
        if (nums[4] == 1)
            rings = nums[4] + " " + names.get(4);
        else 
            rings = nums[4] + " " + names.get(4) + "s";
        System.out.println(crowns + chalices + idols + bags + " and " + rings + "!");
        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 0;
        nums[3] = 0;
        nums[4] = 0;
        return "";
    }
    
    public int getBag()
    {
        int total = 0;
        for (int i = 0; i < bag.size(); i++)
            total += bag.get(i).getValue();
        return total;
    }
}