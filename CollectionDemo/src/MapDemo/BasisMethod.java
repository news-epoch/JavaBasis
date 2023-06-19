package MapDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合的基础方法的示例
 */
public class BasisMethod {
    public static void main(String[] args) {
        Map<String,String> m1 = new HashMap<String,String>();
        //增加元素
        System.out.println("-----增加元素------");
        m1.put("郭靖","黄蓉");
        m1.put("杨过","小龙女");
        //获取元素,并且返回value字符串
        System.out.println("-----获取元素:杨过------");
        System.out.println(m1.get("杨过"));
        //判断是否包含某个key
        System.out.println("-----判断是否包含某个key:杨过------");
        System.out.println(m1.containsKey("杨过"));
        //判断map是否为空
        System.out.println("-----判断map是否为空------");
        System.out.println(m1.isEmpty());
        //获取所有键的集合
        System.out.println(m1.keySet());
        //获取所有value集合
        System.out.println("-----获取所有value集合------");
        System.out.println(m1.values());
        //返回键值对对象的集合
        System.out.println("-----返回键值对对象的集合------");
        System.out.println(m1.entrySet());
        //删除元素
        System.out.println("-----删除元素------");
        m1.remove("郭靖");
        //清空集合
        //m1.clear();

    }
}
