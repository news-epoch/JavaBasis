package GenericAndVariableParametersDemo.GenericDemo;

/**
 * 泛型接口：public interface 接口名<T>{}
 * 泛型类继承接口：public class 类名<T> implements 接口名<T>{}
 * 泛型方法：public void 方法名(T t){}
 */
public class Demo {
    public static void main(String[] args) {
        Generic<String> g1 = new GenericIml<String>();
        g1.show("林青霞");

        Generic<String> g2 = new GenericIml<String>();
        g2.show("30");
    }
}
