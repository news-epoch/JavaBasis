package ListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 特点：可重复。按序存储
 */
public class ListTest {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();
        Student s1 = new Student("李白",12,35.00);
        Student s2 = new Student("王安石",16,38.00);
        Student s3 = new Student("杜甫",13,95.00);
        Student s4 = new Student("白居易",17,10.00);
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        Iterator<Student> iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        c.remove(s2);
        iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
