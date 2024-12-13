import java.util.*;
class Main
{
    public static void main(String args[])
    {
        HashMap <String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("SNAME","Mahamood");
        System.out.println(a);
        // printing hash key value
        if(a.containsKey("SNO"))
        {
            String d=a.get("SNO");
            System.out.println(d);
        }
    }
}