package ioStringStreamDemo;

import java.io.*;

/*
1. 背景
现在想直接把数据读取出来之后，默认输入输出是字符类型，自动根据 编码格式 进行转换。
2. 方法讲解
2.1 普通字符类
现在一共有两个 接口 可以实现该方法，分别是 Reader 和 Write 接口
而这两个 接口 的实现类分别是OutputStringReader和InputStringReader。并且需要通过 字节流 读取文件。

这两个接口是存在 缓冲区的，不像字节流，需要额外的实现类（BufferedInputStream和BufferedOutputStream）进行实现 缓冲区 功能。
下面代码开始讲解如何实现字符流的创建，写入，关闭等操作的
2.2 基于字符类简化子类
FileWrite 和 FileReader 是由于OutputStringReader和InputStringReader 创建太过麻烦，而实现的子类，编码和解码都是基于默认来形成的，
也 不需要 自己创建 字节流对象 读取/写入 数据，从而简化了代码量。

2.3 缓冲流字符
BufferedReader 和 BufferedWrite 自身就携带了一个缓存流(其实就是一个数组)，用来提高效率，但是从根本来看提升的效率并不高，并没有缓存字节流那么明显。
但是缓存字符流提供了一个很好的方法 newLine()方法，用来换行和读取行数据。
 */
public class IOStringDemo {
    public static void main(String[] args) throws IOException {
//        IOStream();
//        FileIO();
        BufferedFileIO();

    }
    // 讲解 InputStreamReader 和 OutStreanWrite 类
    static void IOStream() throws IOException{
        // 创建字符输出流，并且可以在创建时指定对应的字符编码。
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("FileIODemo/test.txt"),"GBK");
        // 写入单个字符
        osw.write(105);
        // 写入多个字符
        char[] ch = {'a','b','c','d'}; //创建字符数组
        osw.write(ch);
        // 将缓冲区的数据写入到文件中
        osw.flush();
        // 关闭字符流
        osw.close();
        System.out.println("---------------------------------");
        //字符输入流,并且可以在创建时，指定对应的字符 解码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("FileIODemo/test.txt"),"GBK");
        // 读取第一个字符,read 会返回对应的二进制数据
        System.out.println("isr.read() = " + isr.read());
        // 读取一个字符串,并且将数据返回给字符数组，然后返回一个读取的 数据个数
        char[] ch2 = new char[1024]; //创建一个1024字节的字符数组
        int index;
        while((index=isr.read(ch2,0,ch2.length)) != -1){
            System.out.println("index = " + index);
            System.out.println("new String(ch2,0,index) = " + new String(ch2, 0, index));
        }
        isr.close();
    }
    // 讲解 基于 IOStream 的子类 FileReader 和 FileWrite
    static void FileIO() throws IOException{
        // 创建字符类，无需指定 解码 ，默认文件编码格式。
        FileReader fr = new FileReader("FileIODemo/test.txt");
        //读取单个字符
        System.out.println("fr.read() = " + fr.read());
        //读取多个字符
        char[] ch1 = new char[1024];
        int frIndex;
        while ((frIndex=fr.read(ch1)) != -1){
            System.out.println("new String(ch1,0,frIndex) = " + new String(ch1, 0, frIndex));
        }
        fr.close();
        FileWriter fw = new FileWriter("FileIODemo/test.txt");
        // 写入单个字符
        fw.write(33);
        // 写入多个字符
        char[] ch2 = {'a','b','c','d','e'};
        fw.write(ch2,1,ch2.length-1);
        fw.flush();
        fw.close();

    }
    // 讲解 缓冲字符类
    static void BufferedFileIO() throws IOException{
        // 创建缓冲字符流，需要通过FileReader 读取数据
        BufferedReader br = new BufferedReader(new FileReader("FileIODemo/test.txt"));
        //读取一行数据，并且不会读取空格和换行
        System.out.println("br.readLine() = " + br.readLine());
        System.out.println("br.readLine() = " + br.readLine());
        br.close();
        System.out.println("---------------------------------------");
        BufferedWriter bw = new BufferedWriter(new FileWriter("FileIODemo/test.txt"));
        bw.write("asdfghj");
        // 换一行,就不需要在后面新增\r\n
        bw.newLine();
        bw.write("qwertyui");
        bw.flush();
        bw.close();
    }
}
