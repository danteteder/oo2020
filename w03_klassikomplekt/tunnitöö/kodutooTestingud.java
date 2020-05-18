//Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
//Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
//Set has various methods to add, remove clear, size, etc to enhance the usage of this interface

// Java code for adding elements in Set
import java.util.*;
public class kodutooTestingud
{
    public static void main(String[] args)
    {
        // Set demonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Tore");
        hash_Set.add("olla");
        hash_Set.add("Tore");
        hash_Set.add("eriti");
        hash_Set.add("t2na");
        System.out.print("Set output without the duplicates");

        System.out.println(hash_Set);

        // Set demonstration with TreeSet
        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println(tree_Set);
    }
}