package FileDemo;

import java.io.File;
import java.io.IOException;
//File的三种初始化

public class ThreeInitalFile {
    public static void main(String[] args) {
        // 1. 携带绝对路径或者相对路径进行初始化
        File f1 = new File("./test");
        System.out.println(f1);
        //2. 输入两个参数，一个目录，和一个子目录或者子文件
        File f2 = new File("C:\\Users\\Administrator\\Downloads","linux-firmware_1.187.39_all.deb");
        System.out.println(f2);
        //3. 输入两个参数，一个File类，和一个子目录或者子文件
        File f3 = new File("C:\\Users\\Administrator\\Downloads");
        File f4 = new File(f3,"linux-firmware_1.187.39_all.deb");
        System.out.println(f4);


    }
}
