/**
 * Super class to supercede all classes in Burglar game.
 * 
 * @author Kyle McCoy and Joseph Rosenberry
 * @version 2/6/18
 */
public abstract class Thing
{
    private String name;
    private String description;
    
    public Thing(String n, String d)
    {
        name = n;
        description = d;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return name + ": " + description;
    }
}