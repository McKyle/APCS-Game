/**
 * Class to represent treasure gained from robbing.
 * 
 * @author Kyle McCoy and Joseph Rosenberry
 * @version 2/6/18
 */
public class Treasure extends Item{

    private int value;
    
    public Treasure (String n, String d, int v){
        super (n, d);
        value = v;
    }

    public int getValue(){
        return value;
    }
}

    
