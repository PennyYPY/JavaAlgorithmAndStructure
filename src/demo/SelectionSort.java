package demo;

/**
 * Created by Administrator on 2018/3/23.
 * 简单选择排序算法。
 * 时间复杂度O(n^2)
 */
public class SelectionSort {

    public static void sort(int[] arr){
        int n = arr.length;
        //O(n^2)
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr , i , minIndex);
        }
    }


    public static void sort(Comparable[] arr){
        int n = arr.length;
        //O(n^2)
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex])<0)
                    minIndex = j;
            }
            swap(arr , i , minIndex);

        }
    }
    public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void swap(Object[] arr, int i, int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}