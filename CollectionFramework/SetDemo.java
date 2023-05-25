import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class SetDemo {
    


    public static void main(String[] args) {
        

        HashSet<String>cities=new HashSet<String>();

        cities.add("Delhi");
        cities.add("Chandigarh");
        cities.add("Mumbai");
        cities.add("Jaipur");


        System.out.println(cities.contains("Chandigarh"));

        System.out.println(cities);

        for(String key:cities)
        System.out.println(key);


        HashSet<Integer> hashSet=new HashSet<Integer>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(6);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(10);
        hashSet.add(12);
        hashSet.add(20);
        hashSet.add(25);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);


        System.out.println(hashSet);


        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(30);
        linkedHashSet.add(14);
        linkedHashSet.add(65);
        linkedHashSet.add(15);
        linkedHashSet.add(17);
        linkedHashSet.add(10);
        linkedHashSet.add(12);
        linkedHashSet.add(20);
        linkedHashSet.add(25);
        System.out.println(linkedHashSet);


        TreeSet<Integer>treeSet=new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(30);
        treeSet.add(14);
        treeSet.add(65);
        treeSet.add(15);
        treeSet.add(17);
        treeSet.add(10);
        treeSet.add(12);
        treeSet.add(20);
        treeSet.add(25);

        System.out.println(treeSet);

        


        


    }
}
