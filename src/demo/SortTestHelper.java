package demo;

/**
 * Created by Administrator on 2018/3/28.
 * 这是一个排序算法的辅助类，包括：
 * 1、生成随机数组；
 * 2、生成近似有序的数组；
 * 3、输出数组；
 * 4、判断数组是否有序；
 * 5、测试排序算法的时间；
 * 6、统计一个字符串中的字符个数；
 * 7、将一个字符串数组转化为字符串；
 */
import java.lang.reflect.Method;


/**
 * Created by Administrator on 2018/3/23.
 */
public class SortTestHelper {

    //生成有n个元素的随机数组，每个元素的随机范围为rangeL，rangeR
    public static Comparable[] generateRandomArray(int n,int rangeL,int rangeR){
        assert rangeL<=rangeR;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Integer((int) (Math.random()*(rangeR-rangeL)+rangeL));
//            arr[i] = (int)Math.random()*(rangeR - rangeL)+rangeL;
        }
        return arr;
    }

    /**
     * 生成一个几乎有序的数组。
     * 1、首先生成一个完全有序的数组；
     * 2、随机挑选几对数字进行交换；
     * */
    public static Integer[] generateNearlyRandomArray(int n,int swapTimes){
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Integer(i);
        }
        //(int) (Math.random() * n) = m
        //(int) Math.random() * n = 0
        for (int i = 0; i < swapTimes; i++) {
            int a = (int) (Math.random() * n);
            int b = (int) (Math.random() * n);
            //Math.random()范围是[0,1)Math.random() * n是为了使得到的随机数的范围在0 < a < n之间；
            int t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
        }
        return arr;
    }

//    public static void swap(int[] arr,int i,int j){
//        int t = arr[i];
//        arr[i] = arr[j];
//        arr[j] = t;
//    }

    public static void printArray(Comparable arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }

        System.out.println();

    }

    //测试算法的排序正确性
    public static boolean isSorted(Comparable[] arr){

        for (int i = 0; i < arr.length; i++)

            if (arr[i].compareTo(arr[i+1])>0)
                return false;
        return true;

    }

    //测试算法的运行时间
    public static void testSort(String sortName,Comparable[] arr){
        try {
            //使用java的反射机制通过类名获得具体的类
            Class sortClass = Class.forName(sortName);
            //使用类中的排序方法
            Method sortMethod = sortClass.getMethod("sort",new Class[]{Comparable[].class});
            Object[] params = new Object[]{arr};
            long startTime = System.currentTimeMillis();
            sortMethod.invoke(null,params);
            long endTime = System.currentTimeMillis();
            /**
             * 断言方法，在调试测试程序时使用，一般使用if方法；
             if (isSorted(arr)){
             System.out.println(sortClass.getSimpleName()+":"+(endTime-startTime)+"ms");
             }
             */
            assert isSorted(arr);
            System.out.println(sortClass.getSimpleName()+":"+(float)(endTime-startTime)/1000+"s");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //统计一个字符串中有哪些元素并打印出元素的个数；
    public static void count(String value){
        int n = value.length();
        char[] arrChar = value.toCharArray();
        int[] arrASCII = new int[n];
        for (int i = 0; i < n; i++) {
            arrASCII[i] = arrChar[i];
        }

        for (int i = 65;i < 123;i++){
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arrASCII[j] == i){
                    count++;
                }
            }
            if (count!=0)
                System.out.println("字母"+ ((char) i)+"有："+count+"个");
        }

    }

    //将一个字符串数组变为字符串；
    public static String StringArrayToString(String[] arr){

        String result = "";

        for (int i = 0;i < arr.length;i++){
            result = result+arr[i];
        }
        return result;
    }

}

