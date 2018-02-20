/**
 * Class to represent treasure gained from robbing.
 * 
 * @author Kyle McCoy and Joseph Rosenberry
 * @version 2/6/18
 */
public class Treasure extends Item{

    public int value;
    public int weight;
    
    public Treasure (String n, String d, int v, int w){
        super (n, d);
        value = v;
        weight = w;
    }

    public int getValue(){
        return value;
    }
    
    public int getWeight(){
        return weight;
    }
}

    
