package Practice;

import java.util.*;

/**
 * 普通斗地主实现
 */
public class fightTheLandlord {
    static void Licensing() {
        //用来存储牌组 key是编号，value是牌
        ArrayList<String> poker = new ArrayList<String>();
//        HashMap<Integer,String>  m1 = new HashMap<Integer,String>();

        //存储编号
//        ArrayList<Integer> array = new ArrayList<Integer>();
        //创建两个数组用来存放花色和牌组
        String[] dector = {"♣", "◇", "♥", "♠"};
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //添加牌组
        for (String s : dector) {
            for (int i = 0; i < num.length; i++) {
                poker.add(s + num[i]);
            }
        }
        poker.add("大王");
        poker.add("小王");
        //打乱顺序
        Collections.shuffle((ArrayList<?>) poker);
        //发牌
        ArrayList<String> leftArray = new ArrayList<>();
        ArrayList<String> rightArray = new ArrayList<>();
        ArrayList<String> topArray = new ArrayList<>();
        ArrayList<String> bottomArray = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            // 判断是不是最后三张，是的话存放为底牌
            if (i >= poker.size() - 3) {
                bottomArray.add(s);
            } else if (i % 3 == 0) {
                leftArray.add(s);
            } else if (i % 3 == 1) {
                rightArray.add(s);
            } else if (i % 3 == 2) {
                topArray.add(s);
            }
        }
        System.out.println("Left:"+leftArray);
        System.out.println("Right:"+rightArray);
        System.out.println("Top:"+topArray);
        System.out.println("底牌:"+bottomArray);
    }

    public static void main(String[] args) {
        Licensing();
    }

}
