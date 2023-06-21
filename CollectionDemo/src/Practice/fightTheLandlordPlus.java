package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 斗地主升级版
 * 发牌后按序展示牌组
 */
public class fightTheLandlordPlus {
    static void Licensing() {
        //用来存储牌组 key是编号，value是牌
        HashMap<Integer, String> poker = new HashMap<Integer, String>();
//        HashMap<Integer,String>  m1 = new HashMap<Integer,String>();
        //存储编号
        ArrayList<Integer> arrPoker = new ArrayList<Integer>();

        //创建两个数组用来存放花色和牌组
        String[] dector = {"♣", "◇", "♥", "♠"};
        String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //添加牌组
        Integer index = 0;
        for (String s : dector) {
            for (String i : num) {
                poker.put(index, s + i);
                arrPoker.add(index);
                index ++;
            }
        }
        poker.put(53, "大王");
        poker.put(52, "小王");
        arrPoker.add(53);
        arrPoker.add(52);
        System.out.println(poker);

        //打乱顺序
        Collections.shuffle(arrPoker);
        //发牌
        TreeSet<Integer> leftArray = new TreeSet<Integer>();
        TreeSet<Integer> rightArray = new TreeSet<Integer>();
        TreeSet<Integer> topArray = new TreeSet<Integer>();
        TreeSet<Integer> bottomArray = new TreeSet<Integer>();
        index = 0;
        for (Integer i : arrPoker) {
            // 判断是不是最后三张，是的话存放为底牌
            if (index >= poker.size() - 3) {
                bottomArray.add(i);
            } else if (index % 3 == 0) {
                leftArray.add(i);
            } else if (index % 3 == 1) {
                rightArray.add(i);
            } else if (index % 3 == 2) {
                topArray.add(i);
            }
            index++;
        }
        System.out.println("Left:" + leftArray);
        System.out.println("Right:" + rightArray);
        System.out.println("Top:" + topArray);
        System.out.println("底牌:" + bottomArray);
    }

    public static void main(String[] args) {
        Licensing();
    }
}
