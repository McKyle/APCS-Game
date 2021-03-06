/**
 * Tester class for Burglar Game.
 * 
 * @author Kyle McCoy and Joseph Rosenberry
 * @version 2/6/18
 */
//print total collected regularly, secret room?, bad room name error
import java.util.*;
public class BurglarGame
{
    public static void main (String [] args)
    {
        System.out.println("\f");
        House house = new House("House", "Mansion");
        Scanner scan = new Scanner(System.in);
        Character s1 = new Security("Bill", "Head", House.getHouse().get(4));
        Character s2 = new Security("Bob", "Security", House.getHouse().get(7));
        Character s3 = new Security("Barry", "Security", House.getHouse().get(1));
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
            "room (Enter \"pickup\")\nYou can leave and keep all the treasure you " +
            "have collected (Enter \"leave\")\n\nThere are three security guards in the " +
            "house.\nGrab as much loot as you can before you get caught!\n\nGold Crowns" +
            " are worth $200,000, Silver Chalices are worth $50,000, Jade Idols are worth " +
            "$50,000, \nBags o' Gold are worth $100,000, and Diamond Rings are worth $500,000." +
            "\nYou need at least $2,000,000 to win your family back. Good luck!\n");
        while (burglar.getNumMoves() == i &&
        s1.getLocation() != burglar.getLocation() &&
        s2.getLocation() != burglar.getLocation() &&
        s3.getLocation() != burglar.getLocation())
        {
            System.out.print("You are in the " + burglar.getLocation().getName()
                + ". What would you like to do? ");
            nextMove = scan.nextLine();
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
            else if (nextMove.equalsIgnoreCase("move"))
            {
                System.out.print("\nSelect a room to move into next." +
                    "(Enter one: front hall, bedroom, dining room, \nkitchen, " +
                    "living room, bathroom, study, bonus room, garage, laundry " +
                    "room, or basement) ");
                nextRoom = scan.nextLine();
                burglar.move(nextRoom);
                i++;
                secMove1 = (int)(Math.random()*11);
                secMove2 = (int)(Math.random()*11);
                secMove3 = (int)(Math.random()*11);

                if (secMove1 == 0 || secMove2 == 0 || secMove3 == 0)
                {
                    s1.move("front hall");
                    s2.move("bedroom");
                    s3.move("dining room");
                }
                if (secMove1 == 1 || secMove2 == 1 || secMove3 == 1)
                {
                    s1.move("bedroom");
                    s2.move("dining room");
                    s3.move("kitchen");
                }
                if (secMove1 == 2 || secMove2 == 2 || secMove3 == 2)
                {
                    s1.move("dining room");
                    s2.move("kitchen");
                    s3.move("living room");
                }
                if (secMove1 == 3 || secMove2 == 3 || secMove3 == 3)
                {
                    s1.move("kitchen");
                    s2.move("living room");
                    s3.move("bathroom");
                }
                if (secMove1 == 4 || secMove2 == 4 || secMove3 == 4)
                {
                    s1.move("living room");
                    s2.move("bathroom");
                    s3.move("study");
                }
                if (secMove1 == 5 || secMove2 == 5 || secMove3 == 5)
                {
                    s1.move("bathroom");
                    s2.move("study");
                    s3.move("bonus room");
                }
                if (secMove1 == 6 || secMove2 == 6 || secMove3 == 6)
                {
                    s1.move("study");
                    s2.move("bonus room");
                    s3.move("garage");
                }
                if (secMove1 == 7 || secMove2 == 7 || secMove3 == 7)
                {
                    s1.move("bonus room");
                    s2.move("garage");
                    s3.move("laundry room");
                }
                if (secMove1 == 8 || secMove2 == 8 || secMove3 == 8)
                {
                    s1.move("garage");
                    s2.move("laundry room");
                    s3.move("basement");
                }
                if (secMove1 == 9 || secMove2 == 9 || secMove3 == 9)
                {
                    s1.move("laundry room");
                    s2.move("basement");
                    s3.move("entry hall");
                }
                if (secMove1 == 10 || secMove2 == 10 || secMove3 == 10)
                {
                    s1.move("basement");
                    s2.move("front hall");
                    s3.move("bedroom");
                }

                if (s1.getLocation() == burglar.getLocation()||
                s2.getLocation() == burglar.getLocation()||
                s3.getLocation() == burglar.getLocation())  
                {
                    System.out.print("\nYou are about to be caught by security! " +
                        "Will you attempt to hide? Enter \"yes\" or \"no\": ");
                    String x = scan.nextLine();
                    if (x.equalsIgnoreCase("Yes") && burglar.getLocation().isObstacle())
                    {
                        s1.move("room");
                        s2.move("room");
                        s3.move("room");
                        System.out.println("\nYou successfully hid! Security has left.");
                    }
                    else if (!burglar.getLocation().isObstacle())
                        System.out.println("\nThere is nothing to hide behind!");
                }
            }
            else if (nextMove.equalsIgnoreCase("leave"))
                i++;
            else
                System.out.println("\nInvalid move. Please try again.");
        }
        if (s1.getLocation() == burglar.getLocation()||
        s2.getLocation() == burglar.getLocation()||
        s3.getLocation() == burglar.getLocation())
            System.out.println("\nYou got caught. You'll be lucky if you can escape " +
                "with your life, \nbut even if you do, you'll never see your family again.");
        if (burglar.getBag() >= 2000000 && 
        s1.getLocation() != burglar.getLocation() &&
        s2.getLocation() != burglar.getLocation() &&
        s3.getLocation() != burglar.getLocation())
        {
            System.out.print("\nCongratulations! You escaped with ");
            burglar.getTreasure();
            System.out.println("\nThat's enough to put the criminal out of business and get your " +
                "family back! You win!");
        }
        if (burglar.getBag() <= 2000000 && 
        s1.getLocation() != burglar.getLocation() &&
        s2.getLocation() != burglar.getLocation() &&
        s3.getLocation() != burglar.getLocation())
            System.out.println("\nThat was a valiant effort, but unfortunately, you " +
                "did not steal enough treasure \nto put the criminal out of business. " +
                "You will never see your family again.");
    }
}