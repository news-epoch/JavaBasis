package SetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> s1 = new LinkedHashSet<String>();

        s1.add("Hello");
        s1.add("World");
        s1.add("Javaee");
        Iterator<String> iterator = s1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        s1.remove("World");
    }
}
