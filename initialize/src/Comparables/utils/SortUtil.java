package Comparables.utils;

//这是一个排序工具类
public class SortUtil {
    /**
     * 接收所有引用类型数据进行排序
     * @param obj
     */
    public  static void sort(Object[] obj){

        for(int i = 0; i<obj.length-1; i++ ){
            for(int j = 0; j<obj.length-i-1; j++ ){
                Comparable c = (Comparable)obj[j];
                Comparable c1 = (Comparable) obj[j+1];

                //当前一个数大于后一个数时
                if (c.compareTo(c1)>0){
                    Comparable temp = c;
                    c = c1;
                    c1 = temp;
                }
            }
        }


    }
}
