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
            Security s1 = new Security("Bill", "Head", House.getHouse().get(4));
            Security s2 = new Security("Bob", "Security", House.getHouse().get(7));
            Security s3 = new Security("Barry", "Security", House.getHouse().get(1));
            Burglar burglar = new Burglar("Steve","Burglar",House.getHouse().get(0));
            int i = 0;
            String nextMove = "";
            String nextRoom = "";
            int secMove1 = 4;
            int secMove2 = 7;
            int secMove3 = 1;
            System.out.println("You have arrived at 5280 Jay Street. " +
                "You find the door unlocked, thanks to \n" +
                "your friend on the phone. You walk into" +
                " the front hall...\n");
            System.out.println("You have three options: \nYou can move to a new room " +
                "(Enter \"move\")\nYou can pick up all the treasure in the current " +
                "room (Enter \"pickup\")\nYou can leave and keep all the treasure you" +
                "have collected (Enter \"leave\")\n");
            while (burglar.getNumMoves() == i && !head.getLocation().equals(burglar.getLocation()))
            {
                System.out.print("You are in the " + burglar.getLocation().getName()
                    + ". What would you like to do? ");
                nextMove = scan.next();
                if (nextMove.equalsIgnoreCase("pickup"))
                {
                    if (burglar.getLocation().beenVisited())
                        System.out.println("\nYou have already collected all the " +
                            "treasure in this room.");
                    else
                    {
                        burglar.pickUp(burglar.getLocation().getLoot());
                        System.out.print("\nYou have: ");
                        System.out.println(burglar.getTreasure());
                    }
                }
                if (nextMove.equalsIgnoreCase("move"))
                {
                    System.out.print("\nSelect a room to move into next." +
                        "(Enter one: front hall, bedroom, dining room, \nkitchen, " +
                        "living room, bathroom, study, bonus room, garage, \nlaundry " +
                        "room, or basement)");
                    nextRoom = scan.next();
                    burglar.move(nextRoom);
                    i++;
                    secMove1 = (int)(Math.random()*11);
                    secMove2 = (int)(Math.random()*11);
                    secMove3 = (int)(Math.random()*11);
                    //fix security movement
                    if (secMove1 == 0 || secMove2 == 0 || secMove3 == 0)
                        head.move("front hall");
                    if (secMove1 == 1 || secMove2 == 1 || secMove3 == 1)
                        head.move("bedroom");
                    if (secMove1 == 2 || secMove2 == 2 || secMove3 == 2)
                        head.move("dining room");
                    if (secMove1 == 3 || secMove2 == 3 || secMove3 == 3)
                        head.move("kitchen");
                    if (secMove1 == 4 || secMove2 == 4 || secMove3 == 4)
                        head.move("living room");
                    if (secMove1 == 5 || secMove2 == 5 || secMove3 == 5)
                        head.move("bathroom");
                    if (secMove1 == 6 || secMove2 == 6 || secMove3 == 6)
                        head.move("study");
                    if (secMove1 == 7 || secMove2 == 7 || secMove3 == 7)
                        head.move("bonus room");
                    if (secMove1 == 8 || secMove2 == 8 || secMove3 == 8)
                        head.move("garage");
                    if (secMove1 == 9 || secMove2 == 9 || secMove3 == 9)
                        head.move("laundry room");
                    if (secMove1 == 10 || secMove2 == 10 || secMove3 == 10)
                        head.move("basement");
                }
                if (nextMove.equalsIgnoreCase("leave"))
                    i++;
            }
            if (head.getLocation().equals(burglar.getLocation()))
                System.out.println("\nYou got caught. You'll be lucky if you can escape " +
                    "with your life. Good luck!");
            if (burglar.getBag().size() >= 8 && head.getLocation() != burglar.getLocation())
                System.out.println("\nCongratulations! You escaped with " + burglar.getTreasure()
                    + "! That's enough to put the criminal out of business and get your " +
                    "family back! You win!");
            if (burglar.getBag().size() <= 8 && head.getLocation() != burglar.getLocation())
                System.out.println("\nThat was a valiant effort, but unfortunately, you " +
                    "did not steal enough treasure to put the criminal out of business. " +
                    "Good try.");
            quit = "Q";
        }
    }
}