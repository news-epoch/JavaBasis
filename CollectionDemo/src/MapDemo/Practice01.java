package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 统计输入字符中相同字符出现的次数
 * 1. 键盘录入一个字符
 * 2. 创建一个map集合用来存储单个字符出现的次数
 * 3. 循环字符串
 * 4. 根据出现的字符对map集合做判断，并对次数进行++操作
 * 5. map集合通过判断来存放字符+出现次数
 * 6. 存储完后进行输出。
 *
 */
public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符");
        String line = sc.nextLine();
        Map<Character,Integer> m1 = new HashMap<Character,Integer>();

        for(int i=0;i<line.length();i++){
            Character c = line.charAt(i);
            // 获取map中的值
            Integer integer1 = m1.get(c);
            // 判断是否存在value
            if (integer1==null){
                //不存在，则录入该值
                m1.put(c,1);
            }else {
                //存在，则更新value值，加上出现次数
                integer1++;
                //更新value
                m1.put(c,integer1);
            }
        }
        //输出map
        System.out.println(m1);
        StringBuilder sb = new StringBuilder();
        for (Character key:m1.keySet()){
            Integer value = m1.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        System.out.println("---------------------");
        System.out.println(sb);
    }
}
