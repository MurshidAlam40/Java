import java.io.*;
import java.util.*;


class GFG {
    public static void main (String[] args) {
       
      int numItems;
      int[] items;
      Scanner in = new Scanner(System.in);


      System.out.println("Enter the number of items :");
      numItems = in.nextInt();

      items = new int[numItems];

      if(numItems>0)
        {
            System.out.println("Enter the value of all items (separated by spaces):");

            for(int i=0; i<numItems; i++)
            {
                items[i] = in.nextInt();
            }
        }

        System.out.print("The values are [");

        for(int i=0; i<numItems; i++)
        {
            if(i==0)
            {
                System.out.print(items[0]);
            }
            else
            {
                System.out.print(", " + items[i]);
            }
        }

        System.out.println("]");
        in.close();
    }
}
