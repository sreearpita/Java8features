import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class MappingWith {
 
    public static void main(String[] args) {
        System.out.println("Sorting map using Java8 streams \n");         
        sortByValue();
    }
 
    private static void sortByValue() 
    {
        Map<String, String> unSortedMap = getUnSortedMap();        
        System.out.println("Unsorted Map : " + unSortedMap);
        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();      
        unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));        
        System.out.println("Sorted Map   : " + sortedMap);        
    }
    
    private static Map<String, String> getUnSortedMap() 
    {
        Map<String, String> unsortMap = new HashMap<>();
        unsortMap.put("A", "java");
        unsortMap.put("B", "spring");
        unsortMap.put("C", "hibernate");
        unsortMap.put("D", "jpa");
        unsortMap.put("E", "react");
        unsortMap.put("F", "node");
        unsortMap.put("G", "jdbc");
        unsortMap.put("H", "aop");       
        return unsortMap;
    }
}
 
 
