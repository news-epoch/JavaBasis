package Exception.RuntimeException;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("李白", 14, 94.00);
        Student s2 = new Student("王安石", 17, 91.00);
        Student s3 = new Student("白居易", 10, 90.00);
        Student ss[] = {s1, s2, s3};
        try {
            System.out.println(ss[3]);
        }catch (RuntimeException e){
            e.printStackTrace();

        }
        System.out.println("-------------------");
    }
}
