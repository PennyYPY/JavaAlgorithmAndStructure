package demo;

/**
 * Created by Administrator on 2018/3/26.
 * 插入排序；
 * 时间复杂度O(n^2)
 * i作为外循环主要是为了移动j的位置；
 */
public class InsertSort {

    public static void sort(Comparable[] arr){

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            Comparable e = arr[i];
            int j = i;
            for (; j > 0; j--) {
                if (arr[j-1].compareTo(e)>0){
                    //交换这一步骤十分耗时,可以进行优化；
//                    swap(arr,j,j-1);
                    arr[j] = arr[j-1];
                }else {
                    break;
                }
            }
            arr[j] = e;
        }
    }

    public static void sort(int[] arr){

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int e = arr[i];
            for (int j = i; j > 0; j--) {
                if (arr[j-1] > arr[e]){
//                    swap(arr,j,j-1);
                    arr[j] = arr[j-1];
                }else {
                    break;
                }
                arr[j] = e;
            }

//            for (int j = i;j>0&&(arr[j]<arr[j-1]);j--){
//                swap(arr,j,j-1);
//            }

        }
    }

    public static void swap(int[] arr,int i,int j){

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] =  t;

    }
    public static void swap(Comparable[] arr,int i,int j){

        Comparable t = arr[i];
        arr[i] = arr[j];
        arr[j] =  t;

    }

}
