package ListDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Hello");
        l1.add("World");
        l1.add("Java");
//      添加到首部
        l1.addFirst("cwg");
//      添加到尾部
        l1.addLast("Spring");
        System.out.println(l1);
//      删除第一个元素
        l1.removeFirst();
//      删除最后一个元素
        l1.removeLast();
//      循环列表数据
        Iterator<String> iterator = l1.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
