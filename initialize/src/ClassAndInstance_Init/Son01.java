package ClassAndInstance_Init;

public class Son01 extends Father01{
    @Override
    public int getNum() {
        System.out.println("Son is getNum");
        return 10;
    }
    private static Integer getAge(){
        System.out.println("son is static getAge");
        return 15;
    }
    public static Integer getage = getAge();
    static{
        System.out.println("son is static01");
    }

    public static void getShow(){
        System.out.println("son is getShow");
    }
}
