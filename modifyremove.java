import java.util.*;
class Main{
    public static void main(String args[])
    {
        HashMap<String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("name","yuva");
        a.put("city","chennai");
        System.out.println(a);
        a.put("SNO","90");
        System.out.println(a);
        a.remove("SNAME");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}