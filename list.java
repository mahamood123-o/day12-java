import java.util.*;
class Main
{
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("I am");
        a.add("Mahamood");
        a.add("Students");
        Iterator itr = a.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}