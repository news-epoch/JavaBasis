package SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * set集合是一个保证不会出现重复数据的集合
 * 是通过先判断hashcode码值对比后，在进行内容比对，来保证不出现重复情况
 */

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new TreeSet<Integer>();

        set2.add(2);
        set2.add(1);
        set2.add(4);
        Iterator<Integer> iterator = set2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------");
        for(int i : set2){
            System.out.println(i);
        }
        System.out.println("---------------------");
        set1.addAll(set2);
        for (int i : set1){
            System.out.println(i);
        }
    }
}
