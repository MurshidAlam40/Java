import java.util.*;

class GfG {
    
    static String digitAfterDecimal(String no)
    {
        int pos = no.indexOf('.');
        
        if(pos<0)
        {
            return "";
        }
        else
        {
            return no.substring(pos+1);
        }
    }
    
    public static void main(String args[])
    {
        String no = "12.385";
    
        System.out.println(digitAfterDecimal(no));
    }
}

