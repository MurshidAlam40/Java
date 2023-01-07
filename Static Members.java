import java.math.*;
import java.io.*;
import java.util.*;

class Player
{
    String name;
    int id;

    static int playerCount = 0;

    Player(String name)
    {
        this.name = name;
        id= ++playerCount;
    }

    void printDetails()
    {
        System.out.println(id+":"+name);
    }
}
public class Main
{ 
    public static void main(String[] args)throws IOException 
    { 
      Player p1 = new Player("xyz");
      Player p2 = new Player("abc");

      p1.printDetails();
      p2.printDetails();
    } 
} 
//2 call by class
public class Main
  
{ 
    public static void main(String[] args)throws IOException 
    { 
      Player p1 = new Player("xyz");
      Player p2 = new Player("abc");

     System.out.println(Player.playerCount);
     System.out.println(p1.playerCount);
    } 
} 
//3 Static Method
class Player
{
    String name;
    int id;

    private static int playerCount = 0;

    Player(String name)
    {
        this.name = name;
        id= ++playerCount;
    }

    static int getplayerCount()//method
    {
        return playerCount;
    }
}
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      System.out.println(Player.getplayerCount());
      
      Player p1 = new Player("abc");

     System.out.println(Player.getplayerCount());
     
    } 
} 
