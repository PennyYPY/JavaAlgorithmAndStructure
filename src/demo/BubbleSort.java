package demo;

/**
 * Created by Administrator on 2018/3/28.
 * 冒泡排序；
 * 时间复杂度O(n^2)
 * 这里出了一点问题，当数组长度大于1000时排序失效，也不知道原因，好郁闷；
 */
public class BubbleSort {

    public static void sort(Comparable[] arr){
//        int n = arr.length;
//        for (int i = 0; i < n -1; i++) {
//            for (int j = 0; j < n -1-i; j++) {
//                if (arr[j].compareTo(arr[j+1]) > 0){
//                    swap(arr,j,j+1);
//                }
//            }
//        }

//        int n = arr.length;
//        boolean swapped = false;
//
//        do{
//            swapped = false;
//            for( int i = 1 ; i < n ; i ++ )
//                if( arr[i-1].compareTo(arr[i]) > 0 ){
//                    swap( arr , i-1 , i );
//                    swapped = true;
//                }
//
//            // 优化, 每一趟Bubble Sort都将最大的元素放在了最后的位置
//            // 所以下一次排序, 最后的元素可以不再考虑
//            n --;
//        }while(swapped);

        int n = arr.length;
        int newn; // 使用newn进行优化

        do{
            newn = 0;
            for( int i = 1 ; i < n ; i ++ )
                if( arr[i-1].compareTo(arr[i]) > 0 ){
                    swap( arr , i-1 , i );

                    // 记录最后一次的交换位置,在此之后的元素在下一轮扫描中均不考虑
                    newn = i;
                }
            n = newn;
        }while(newn > 0);
    }

    public static void swap(Object[] arr,int i,int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}