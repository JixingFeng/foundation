package foundation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fjx on 2016/8/15.
 */
public class Jihe {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        /**
         * ArrayList就是元素为对象引用的长度可变的数组
         *
         */
        List<String> list = new ArrayList<String>(8);
        list.add("狮子");
        list.add("老虎");
        list.add("猴子");
          System.out.print(list);

        list.remove("猴子");
        System.out.print(list);
/**
 * 调用ensureCapacity（）方法可以手动增长ArrayList容量（没什么卵用，可以在创建的时候定义个数，）
 * 如果希望减少Arraylist对象数组的大小，进而使其大小精确的等于当前容纳的元素数量，可以使用trinToSize方法
 */
/**
 * 将集合转化为数组 toArray()
 */
Object[] s=new Object[2];
        s=list.toArray();

        System.out.println();
        for (int i = 0; i < ; i++) {
            
        }


    }

}
