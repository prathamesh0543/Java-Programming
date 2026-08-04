package collection;

import java.util.HashSet;

public class clone {
    public static void main(String[] args) {
        int a[] = {11,1,2,3,4,5,3,6,6};
        HashSet<Integer>h1 = new HashSet<Integer>();

        for(Integer a1 :a)
        {
            h1.add(a1);
        }
        System.out.println(h1);

    }
}