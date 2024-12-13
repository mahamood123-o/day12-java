import java.util.*;
class Main
{
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Mahamood");
        a.add("Students");
        System.out.println(a);
        a.remove("Mahamood");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}