package ioByteStreamDemo;

import java.io.FileInputStream;
import java.io.IOException;
/*
1. 字节流的读取
 */
public class InFileStream {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("FileIODemo/fix.txt");
        //1. 读取第一个字符，并返回汉字，可以通过char转换成字符
        int read = f1.read( );
        System.out.println(read);
        System.out.println((char)read);
        //2. 读取第二个字符
        read = f1.read();
        System.out.println(read);
        System.out.println((char) read);
        System.out.println("=============");
        //3. 当读取不到字符时，会返回"-1" 。
        while ((read = f1.read()) != -1){
            System.out.println((char)read);
        }
        if (f1 != null){
            f1.close();
        }
    }
}
