package FileDemo;

import java.io.File;

/**
 * 1. 遍历和文件练习
 * 2. 给定一个本地目录，要求获取到本地所有的数组
 */
public class practiceErgodicDirectory {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Administrator\\OneDrive\\文档\\第二大脑\\200-知识库");
        File[] listDircetory = f1.listFiles();
        //当目录不为空时，输出子目录的绝对路径。
        if (listDircetory != null){
            for (int i =0; i<listDircetory.length; i++){
                if (listDircetory[i].isDirectory()){
                    System.out.println(listDircetory[i].getAbsoluteFile());
                }

            }
        }
    }
}
