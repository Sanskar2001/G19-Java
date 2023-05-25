import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class MapDemo 
{

 public static void main(String[] args) {
    
    HashMap<String,Integer>hashmap=new HashMap<String,Integer>();

    hashmap.put("Burger",70);
    hashmap.put("Pasta",150);
    hashmap.put("Dosa",120);
    hashmap.put("Fries",100);

    System.out.println(hashmap.get("Dosa"));

    System.out.println(hashmap.containsKey("Dosa"));
    System.out.println(hashmap.containsKey("Pizza"));


    System.out.println(hashmap.containsValue(1000));
    System.out.println(hashmap.containsValue(100));
 

    System.out.println(hashmap);

    for(Map.Entry<String,Integer> entry :hashmap.entrySet())
    {
        System.out.println(entry.getKey()+" "+entry.getValue());
    }


    HashMap<Integer,String>companies=new HashMap<Integer,String>();
    
    companies.put(1,"American Express");
    companies.put(2,"Uber");
    companies.put(3,"De Shaw");
    companies.put(4,"Adobe");
    companies.put(5,"NatWest");
    companies.put(10,"Rakuten");
    companies.put(14,"Amazon");
    companies.put(20,"Goldman Sachs");
    companies.put(25,"LinkedIn");
    companies.put(30, "Deutsche Bank");


    System.out.println(companies);



    LinkedHashMap<Integer,String>companiesLinkedHashMap=new LinkedHashMap<Integer,String>();
    
    companiesLinkedHashMap.put(1,"American Express");
    companiesLinkedHashMap.put(2,"Uber");
    companiesLinkedHashMap.put(3,"De Shaw");
    companiesLinkedHashMap.put(4,"Adobe");
    companiesLinkedHashMap.put(5,"NatWest");
    companiesLinkedHashMap.put(10,"Rakuten");
    companiesLinkedHashMap.put(14,"Amazon");
    companiesLinkedHashMap.put(20,"Goldman Sachs");
    companiesLinkedHashMap.put(25,"LinkedIn");
    companiesLinkedHashMap.put(30, "Deutsche Bank");


    System.out.println(companiesLinkedHashMap);



    TreeMap<Integer,String>companiesTreeMap=new TreeMap<Integer,String>();
    
    companiesTreeMap.put(1,"American Express");
    companiesTreeMap.put(3,"Uber");
    companiesTreeMap.put(2,"De Shaw");
    companiesTreeMap.put(5,"Adobe");
    companiesTreeMap.put(4,"NatWest");
    companiesTreeMap.put(10,"Rakuten");
    companiesTreeMap.put(14,"Amazon");
    companiesTreeMap.put(12,"Goldman Sachs");
    companiesTreeMap.put(18,"LinkedIn");
    companiesTreeMap.put(30, "Deutsche Bank");


    System.out.println(companiesTreeMap);


 }

}
