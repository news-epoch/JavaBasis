package ioByteStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
练习二：复制图片
 */
public class Practice02 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("FileIODemp/1.jpg");
        FileOutputStream out = new FileOutputStream("FileIODemp/2.jpg");
        //每次读取一个字节数组
        byte[] by = new byte[1024];
        int iby = 0;
        while ( (iby = in.read(by)) != -1){
            out.write(by,0, iby);
        }
        in.close();
        out.close();

    }
}
