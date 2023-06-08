package SetDemo;

import java.util.TreeSet;

/**
 * TreeSet成绩排序
 * 用TreeSet集合存储多个学生的信息(姓名、数学成绩、语文成绩)，并且遍历该集合
 * 要求： 按照总分从高到低排序
 */
public class SetPractice {
    public static void main(String[] args) {
        //方法1，对象内嵌比较器
        TreeSet<Student> ts = new TreeSet<Student>();
        Student s1 = new Student("wanganshi",76,97);
        Student s2 = new Student("baijuyi",46,79);
        Student s3 = new Student("lishangying",86,69);
        Student s4 = new Student("libai",46,89);
        Student s5 = new Student("sudongpo",58,82);

        for (Student s : ts){
            System.out.println(s);
        }

    }
}

class Student implements Comparable<Student>{
    private String name;
    private Integer chineseScore;
    private Integer mathScore;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                '}'+"{"+(chineseScore+mathScore)+"}";
    }

    public Student(String name, Integer chineseScore, Integer mathScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChineseScore(Integer chineseScore) {
        this.chineseScore = chineseScore;
    }

    public void setMathScore(Integer mathScore) {
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public Integer getChineseScore() {
        return chineseScore;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    @Override
    public int compareTo(Student o) {
        int num =(this.chineseScore+this.chineseScore)-(o.getChineseScore()+o.getMathScore());
        return num;
    }
}