// Java program to demonstrate 
// compareTo() method of String in Java
class GFG { 
    public static void main(String args[]) 
    {
        // Creating two string literals
        String s1 = "geeksforgeeks";
        String s2 = "for";
        
        int res = s1.compareTo(s2);
        
        if(res == 0)
            System.out.println("Same");
        
        if(res > 0)
            System.out.println("s1 is Greater");
            
        if(res < 0)
            System.out.println("s1 is Smaller");
    } 
} 
