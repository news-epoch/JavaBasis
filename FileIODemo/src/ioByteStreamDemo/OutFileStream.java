package ioByteStreamDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
1. 输出字节流的创建、写入、关闭。
2. 用来将数据写入到文件中
 */
public class OutFileStream {
    public static void main(String[] args) throws IOException {
        //1. 第一种创建字节流方式
        FileOutputStream f1 = new FileOutputStream("FileIODemo/fox.txt");
        f1.write("Hello".getBytes(StandardCharsets.UTF_8));
        f1.close();
        //2. 第二种创建字节流方式
        FileOutputStream f2 = new FileOutputStream(new File("FileIODemo/fix.txt"));
        //  2.1 可以写入byte数组类型，但是不可以写入引用类型数据Byte[]。
        byte[] b1 = {97,98,99,100,101};
        Byte[] b2 = {97,98,99,100,101};
        f2.write("World\t\n".getBytes(StandardCharsets.UTF_8));
        f2.write(b1);
//        f2.write((byte[])b2);
        f2.close();

        //3. 异常处理
        //  3.1 一般还是使用异常抛出来进行处理的，但是下面代码的健壮性还是要学会。
        FileOutputStream f3 = null;


        try {
            f3 = new FileOutputStream("FileIODemo/fox.txt");
            f3.write("35".getBytes(StandardCharsets.UTF_8));

        }catch (IOException e){
            e.printStackTrace();

        }finally {
            if (f3 != null){
                try {
                    f3.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        FileOutputStream f4 =new FileOutputStream("FileIODemo/fox.txt");
        //4. 字节流的输入方式,void write (byte[] b, int off, int len) 将len字节从指定的字节数组开始，从偏移量off 开始写入此文件输出流
        byte[] b3 = {99,100,101,102,103};
        f4.write(b3,1,3);
        f4.close();

    }
}
