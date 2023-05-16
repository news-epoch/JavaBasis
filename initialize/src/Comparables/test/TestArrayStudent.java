package Comparables.test;

import Comparables.utils.SortUtil;

import java.lang.reflect.Array;

public class TestArrayStudent {
    public static void main(String[] args) {
        Student s1 = new Student("李白",12,95.30);
        Student s2 = new Student("辛弃疾",12,92.30);
        Student s3 = new Student("李商隐",16,95.30);
        Student s4 = new Student("杜甫",17,91.30);
        Student s5 = new Student("白居易",19,99.30);

        Student ts[] = {s1, s2, s3, s4, s5};
        Comparable c1 = s1;
        SortUtil.sort(ts);
        for (Student t : ts){
            System.out.println(t);
        }

    }
}
