package ClassAndInstance_Init;


public class Father01 {
    public  int getNum = getNum();
    public  int getNum(){
        System.out.println("Father01 is getNum");
        return 20;
    }
    static {
        System.out.println("Father01 is static01");
    }
    public  int getGetNum = getNum();

    private static int getAge(){
        System.out.println("Father01 is static getAge");
        return 10;
    }

    {
        System.out.println("Father01 ");
    }
    public  static int age = getAge();
    public  static void getShow(){
        System.out.println("Father01 is getShow");
    }

}
