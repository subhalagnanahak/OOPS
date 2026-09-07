package CollectionFramework.Sets.Map_collectionframework;
import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String, String > mapping = new HashMap<>();
        //insertion
        mapping.put("in" ,"India");
       // mapping.put("in" ,"India2");
        mapping.put("en" ,"England");
        mapping.put("fr" ,"France");
        mapping.put("it" ,"Italy");

        System.out.println(mapping);
        Map<String,String> table = new HashMap<>();
        table.put("br" ,"Brazil");
        //outAll()

        System.out.println("Before = " + table);
        table.putAll(mapping);
        System.out.println("After putAll() = " + table);

        //deletion
        table.remove("en") ;
        System.out.println("After removeAll() = " + table);
        System.out.println("get = " + table.get("br"));

        System.out.println("getOrDefault() = " + table.get("br"));

        table.replace("en" ,"France");
        System.out.println("After replaceAll() = " + table);
        Set<String> keyset = table.keySet();
        System.out.println("After containsKey() = " + keyset);

        Collection<String> values = table.values();
        System.out.println("After containsValue() = " + values);

        //get all the entries from map
        Set<Map.Entry<String, String>> entrieset = table.entrySet();
        System.out.println("After containsEntry() = " + entrieset);


        //table.putIfAbsent("fr" ,"France2");
        //System.out.println("After putIfAbsent() = " + table);

       // System.out.println("size"+table.size());
      //  table.clear();
       // System.out.println("size after clear " + table.size());








    }


}
