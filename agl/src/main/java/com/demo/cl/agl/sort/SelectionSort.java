package com.demo.cl.agl.sort;

public class SelectionSort {
    public static void main(String[] args){
        int[] test=new int[]{-1,32,2,100,-200,21,2,1123,12,3,32};
        selectionSort(test);
        for(int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }
    }

    //双重循环, 外层循环维护[rightIndex,rigtestIndex]为有序, 迭代直到rightIndex到0时全数组排序完毕
    //内层对[0,rightIndex-1]逐个扫描,维护最大值的索引到maxIndex. 扫描完成得到[0,rightIndex-1]区间内的maxIndex后,把最大元素调到末端即rightIndex-1处
    private static void selectionSort(int[] unsortedArray){
        for(int rightIndex=unsortedArray.length;rightIndex>0;rightIndex--){
            int maxIndex=-1;
            for(int i=0;i<=rightIndex-1;i++){
                if(maxIndex==-1){
                    maxIndex=i;
                }else{
                    if(unsortedArray[i]>unsortedArray[maxIndex]){
                        maxIndex=i;
                    }
                }
            }
            if(maxIndex!=rightIndex-1){
                int temp=unsortedArray[maxIndex];
                unsortedArray[maxIndex]=unsortedArray[rightIndex-1];
                unsortedArray[rightIndex-1]=temp;
            }
        }
    }
}
