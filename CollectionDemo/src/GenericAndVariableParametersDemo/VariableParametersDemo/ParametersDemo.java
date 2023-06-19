package GenericAndVariableParametersDemo.VariableParametersDemo;

import java.util.*;

/**
 * 可变行参，在Java中方法的表现形式就是数组。
 * List/Set/Map数组可以通过of方法创建固定数量元素的对象。从JDK1.8开始就不存在该方法了。
 */
public class ParametersDemo {
    public static void main(String[] args) {
        ComputerNum c1 = new ComputerNum();
        System.out.println(c1.compute(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<String> l1 = Arrays.asList("1","2","3","4");

//        l1.add("5"); //UnsupportedOperationException  不可以创建
        List<String> l2 = new ArrayList();

    }
}
