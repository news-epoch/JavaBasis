package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//循环列表的三种方式

/**
 * 增强型for循环
 * 普通for循环
 * iterator迭代器循环:其中iterator 默认里面有add的方法进行添加列表元素，可以有效防止预计修改次数和实际修
 * 改次数不相等造成的运行时异常。
 * 测试
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList();
        l1.add("hello");
        l1.add("world");
        l1.add("Java");
//        增强for循环
        for (String i : l1){
            System.out.println(i);
        }
        System.out.println("----------------------");
//        普通for循环
        for(int i = 0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println("----------------------");
//        itreator迭代器
        Iterator ite = l1.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println("----------------------");

    }
}
