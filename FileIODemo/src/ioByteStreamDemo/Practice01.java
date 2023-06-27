package ioByteStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
练习1：复制文件
 */
public class Practice01 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("FileIODemo/fix.txt");
        FileOutputStream out = new FileOutputStream("FileIODemo/fox.txt");
        int by = 0;
        while ((by = in.read()) != -1){
            out.write((byte)by);
        }
        if (in != null && out != null){
            in.close();
            out.close();
        }
    }
}
