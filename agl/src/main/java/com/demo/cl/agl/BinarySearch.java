package com.demo.cl.agl;


public  class BinarySearch {
    public static void main(String[] args) {
        System.out.print(binarySearch(new int[]{0,1,2,3,4,5,6,7},7,6));
    }

    private static int binarySearch(int[] intArray, int endIndex, int target){
        //在[leftIndex,rightIndex]中搜索target, 此区间外的所有值都不是target
        //middleIndex是[leftIndex,rightIndex]的中点index
        int leftIndex=0;
//        if(endIndex==-1) endIndex=intArray.length-1;
        int rightIndex=endIndex;
        int middleIndex=(leftIndex+rightIndex)/2;
        //while循环判断区间合法性,如果leftIndex>rightIndex就不合法,即使缩到最小都无法迭代到一个解,即无解
        while(leftIndex<=rightIndex){
            if(intArray[middleIndex]==target){
                return middleIndex;
            }else if(target>intArray[middleIndex]){
                leftIndex=middleIndex+1;
            }else{
                rightIndex=middleIndex-1;
            }
            middleIndex=(leftIndex+rightIndex)/2;
        }
        return -1;
    }
}
