package collection;




import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet h1 = new HashSet();
        h1.add(12);
        h1.add(22);
        h1.add("ABC");
        h1.add(null);
        
        System.out.println(h1);



    System.out.println(h1.size());
    System.out.println(h1.contains(12));
    System.out.println(h1.isEmpty());
    System.out.println(h1.remove(22));

    HashSet<Integer> h2 = new HashSet<Integer>();
    h1.addAll(h2);
    System.out.println(h1.containsAll(h2));
    h1.removeAll(h2);



    
    }

}
