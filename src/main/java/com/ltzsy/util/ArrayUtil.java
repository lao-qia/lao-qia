package com.ltzsy.util;

import java.util.Arrays;

/**
 * @description: 这里用一句话描述这个类的作用 <br>
 * @version: 1.0 <br>
 * @author: leevi.li <br>
 * @create: 2022/6/29 9:26 <br>
 * @update: 2022/6/29 9:26 <br>
 * @since jdk11.0.5_10
 */
public class ArrayUtil {

    public static void main(String[] args) {
        int[] number={5,4,3,34,1,6,8,12,10};
        System.out.println(Arrays.toString(number));
        insertionSort(number);
        System.out.println(Arrays.toString(number));
    }

    /**
     * @description: 冒泡排序demo <br>
     * @version: 1.0 <br>
     * @author: leevi.li <br>
     * @create: 2022/6/29 11:20 <br>
     * @update: 2022/6/29 11:20 <br>
     * @param:
     * @return void
     */
    private static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length -  1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * @description: 快速排序 demo<br>
     * @version: 1.0 <br>
     * @author: leevi.li <br>
     * @create: 2022/6/29 15:49 <br>
     * @update: 2022/6/29 15:49 <br>
     * @param: arr
     * @param: low
     * @param: high
     * @return void
     */
    private static void quickSort(int[] arr, int low, int high){
         if(low >= high){
             return;
         }
         int fiducialValue = arr[low];
         int left = low;
         int right = high;
         int temp = 0;
         while (left < right){
             while (left < right && fiducialValue <= arr[right]){
                 right --;
             }
             while (left < right && fiducialValue >= arr[left]){
                 left ++;
             }
             if(left < right){
                 temp = arr[left];
                 arr[left] = arr[right];
                 arr[right] = temp;
             }
         }
         arr[low] = arr[left];
         arr[left] = fiducialValue;
         quickSort(arr, low, right - 1);
         quickSort(arr, right + 1, high);
    }

    /**
     * @description: 选择排序demo <br>
     * @version: 1.0 <br>
     * @author: leevi.li <br>
     * @create: 2022/6/29 17:28 <br>
     * @update: 2022/6/29 17:28 <br>
     * @param: arr 
     * @return void
     */ 
    private static void selectionSort(int[] arr){
        int length = arr.length - 1;
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            int index = 0;
            for (int j = 1; j <= length; j++) {
                if(arr[index] < arr[j]){
                    index = j;
                }
            }
            temp = arr[length];
            arr[length] = arr[index];
            arr[index] = temp;
            length --;
        }
    }

    /**
     * @description: 插入排序demo <br>
     * @version: 1.0 <br>
     * @author: leevi.li <br>
     * @create: 2022/6/29 18:05 <br>
     * @update: 2022/6/29 18:05 <br>
     * @param: arr
     * @return void
     */
    private static void insertionSort(int[] arr){
        int temp;
        int j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp ; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
