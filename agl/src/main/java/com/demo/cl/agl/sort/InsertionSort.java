package com.demo.cl.agl.sort;

import java.util.ArrayList;

public class InsertionSort {

    public static void main(String[] args){
        int[] numbers={3,2,1,3,54,23,12,33,23,65,34,-12,-10,-3213,-1};
        insertionSort(numbers);
        for (int current:
                numbers) {
            System.out.print(current+",");
        }
    }


    //三重循环:
    // ,1. 开始时[0,i)是有序部分,[i,end]是无序部分,i为待排序元素,循环结束时[0,i]有序.i迭代直到numbers.length-1 完成整个数组排序
    // 2. 查找i元素在[0,i]中要放的位置. 开始时[0,j)为小于i元素的非解区间,[j,i]为解区间.一轮迭代结束[0,j]就为较小区间.当j迭代到i-1时若还无解,则放入位置为i.
    // 3. 根据找到的insertPosition, 从insertPosition开始往右shift一位, 空出的insertPosition放入i值.
    //    开始时[insertPostion,k)已调整为正确位置,结束时[insertPostion,k]调整为正确位置,k迭代到

    public static void insertionSort(int[] numbers){
        for (int i = 1; i < numbers.length ; i++) {
             int current=numbers[i];
             Integer insertPosition=null;
             for(int j=0;j<i;j++){
                 int value=numbers[j];
                 if(value>current){
                     insertPosition=j;
                     break;
                 }
             }
             if(insertPosition==null) insertPosition=i;
             int move=numbers[insertPosition];
             for(int k=insertPosition;k<i;k++){
                 int temp=numbers[k+1];
                 numbers[k+1]=move;
                 move=temp;
             }
             numbers[insertPosition]=current;
        }
    }
}
