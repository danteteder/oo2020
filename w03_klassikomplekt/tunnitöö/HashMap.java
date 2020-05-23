import java.util.HashMap;

public class MyClass {
  public static void main(String[] args) {
    //basics
    //Hashmap cant contain duplicate keys, the keys r default
    //Map is a separate interface, mapping between keys n values
    //HashSet helps store unique values
    //Set - unordered collection of objects in which duplicate values cannot be stored.



    // HashMap object called peopleFears
    HashMap<String, String> peopleFears = new HashMap<String, String>();

    // Add keys and values (Peoples names and their fears)
    peopleFears.put("Stacy", "Dogs");
    peopleFears.put("Becky", "Spiders");
    peopleFears.put("Johnny", "Snakes");
    peopleFears.put("Elvis", "Unpopularity");
    System.out.println(peopleFears);


    //Hashmap access
    peopleFears.get("Elvis");
    //Getting full size of it
    peopleFears.size();

    //Printing values n keys
    for (String i : capitalCities.values()) {
        System.out.println(i);
    }
    for (String i : capitalCities.keySet()) {
        System.out.println(i);
      }




  }
}