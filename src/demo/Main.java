package demo;

import java.lang.*;

public class Main {

    public static void main(String[] args) {
        //
//        System.out.println("1、一般测试：");
        int arrLen = 5;
        Integer[] arr = (Integer[]) SortTestHelper.generateRandomArray(arrLen,0,10);
//        Integer[] arr11 = (Integer[]) SortTestHelper.generateRandomArray(arrLen,0,100);
////        Integer[] arr = SortTestHelper.generateNearlyRandomArray(arrLen,100);

//        Integer[] arr12 = Arrays.copyOf(arr11,arr11.length);
//
//        SortTestHelper.testSort("demo02.SelectionSort",arr11);
//        SortTestHelper.testSort("demo02.InsertSort",arr12);
//
//        System.out.println("2、有序性加强测试：");
//
//        Integer[] arr21 = (Integer[]) SortTestHelper.generateRandomArray(arrLen,0,3);
//        Integer[] arr22 = Arrays.copyOf(arr21,arr21.length);
//
//        SortTestHelper.testSort("demo02.SelectionSort",arr21);
//        SortTestHelper.testSort("demo02.InsertSort",arr22);
//
//        System.out.println("3、近乎有序测试：");
//
//        Integer[] arr31 = SortTestHelper.generateNearlyRandomArray(arrLen,10);
//        Integer[] arr32 = Arrays.copyOf(arr31,arr31.length);
//
//        SortTestHelper.testSort("demo02.SelectionSort",arr31);
//        SortTestHelper.testSort("demo02.InsertSort",arr32);

        SortTestHelper.printArray(arr);
//
        BubbleSort.sort(arr);
        SortTestHelper.printArray(arr);

//        String m = "AAAABBBjksdlasdal";

//        String n = SortTestHelper.StringArrayToString(Enum.arr2);
//        SortTestHelper.count(n);

    }
}
