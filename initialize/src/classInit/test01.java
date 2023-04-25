package classInit;

public class test01 {
    public static void main(String[] args) {
        // 实例初始化
        /**
         * 子类初始化步骤：
         * 1. 先调用父类static块和static方法
         * 2. 调用子类static块和static方法
         * 3. 调用父类实例变量和非static块
         * 4. 调用子类实例变量和非static块
         */
//        Son01 son01 = new Son01();

        System.out.println("-----------------");
        // 类初始化
        Son01.getShow();
    }
}
