package FileDemo;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Administrator\\Downloads\\test");
        //如果没有文件，就创建该文件，并且返回true，如果文件存在返回false
        System.out.println(f1.createNewFile());
        //创建子文件夹,但是当父文件夹不存在或者存在同名文件，就会返回false,
        File f2 = new File("C:\\Users\\Administrator\\Downloads\\test");
        System.out.println(f2.mkdir());
        //创建多层文件夹,但是存在同名文件，就会返回false
        File f3 = new File("C:\\Users\\Administrator\\Downloads\\test\\test\\test");
        System.out.println(f3.mkdirs());
        //判断文件是否存在
        System.out.println("f1.exists() = " + f1.exists());
        //判断是不是文件
        System.out.println("f1.isFile() = " + f1.isFile());
        //判断是不是目录
        System.out.println("f1.isDirectory() = " + f1.isDirectory());
        //获取这个文件的绝对路径，包括文件名
        System.out.println("f1.getAbsoluteFile() = " + f1.getAbsoluteFile());
        //获取文件夹下面的多个文件列表或者目录，并返回字符串数组
        System.out.println("f1.getPath() = " + f1.listFiles());
        //删除文件或者文件夹
        System.out.println("f1.delete() = " + f1.delete());
    }
}
