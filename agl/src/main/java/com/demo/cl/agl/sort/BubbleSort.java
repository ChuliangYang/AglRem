package com.demo.cl.agl.sort;

public class BubbleSort{
    public static void main(String[] args){
        int[] test=new int[]{-1,32,2,100,-200,21,2,1123,12,3,32};
        bubbleSort(test);
        for(int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }
    }

    //双重循环. 外层循环维护有序部分[rightIndex,rigtestIndex]. 当righIndex迭代到0时,原数组排序完毕
    //内层循环在无序部分[0,rightIndex-1]进行冒泡排序,每趟排序后最大元素存到rightIndex-1
    private static void bubbleSort(int[] unsortedArrays){
        for(int rightSortedIndex=unsortedArrays.length;rightSortedIndex>0;rightSortedIndex--){
            for(int front=0;front<rightSortedIndex-1;front++){
                if(unsortedArrays[front]>unsortedArrays[front+1]){
                    int temp=unsortedArrays[front];
                    unsortedArrays[front]=unsortedArrays[front+1];
                    unsortedArrays[front+1]=temp;
                }
            }
        }
    }
}
