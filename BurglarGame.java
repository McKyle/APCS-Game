/**
 * Tester class for Burglar Game.
 * 
 * @author Kyle McCoy and Joseph Rosenberry
 * @version 2/6/18
 */
import java.util.*;
public class BurglarGame
{
    public static void main (String [] args)
    {
        System.out.println("\f");
        String quit = "A";
        while (!quit.equalsIgnoreCase("Q"))
        {
            House house = new House("House", "Mansion");
            Scanner scan = new Scanner(System.in);
            Security head = new Security("Bill", "Head", House.getHouse().get(4));
            Burglar burglar = new Burglar("Steve","Burglar",House.getHouse().get(0));
            int i = 0;
            String nextMove = "";
            String nextRoom = "";
            int secMove = 0;
            while (head.getLocation() != burglar.getLocation())
            {
                System.out.println("You have arrived at 5280 Jay Street. " +
                    "You find the door unlocked, thanks to " +
                    "your friend on the phone. You walk into" +
                    " the front hall...");
                while (burglar.getNumMoves() == i && head.getLocation() != burglar.getLocation())
                {
                    System.out.println("You are in the " + 
                        burglar.getLocation().getName() +
                        ". What would you like to do? \n" +
                        "(Enter \"move\" to move to a new room)"
                        + "\n(Enter \"pickup\" to collect all " +
                        "treasure in this room.)\n(Enter " +
                        "\"leave\"to escape with your loot)\n");
                    nextMove = scan.next();
                    if (nextMove.equalsIgnoreCase("pickup"))
                    {
                        burglar.pickUp(burglar.getLocation().getLoot());
                        System.out.println("You have: " + burglar.getTreasure());
                    }
                    if (nextMove.equalsIgnoreCase("move"))
                    {
                        System.out.println("Select a room to move into next." +
                            "(Enter one: bedroom, dining room, kitchen, or " +
                            "living room)");
                        nextRoom = scan.next();
                        burglar.move(nextRoom);
                        house.removeRoom(burglar.getLocation());
                        i++;
                        secMove = (int)(Math.random()*5);
                        if (secMove == 0)
                            head.move("front hall");
                        if (secMove == 0)
                            head.move("bedroom");
                        if (secMove == 0)
                            head.move("dining room");
                        if (secMove == 0)
                            head.move("kitchen");
                        if (secMove == 0)
                            head.move("living room");
                    }
                }
            }
        }
    }
}