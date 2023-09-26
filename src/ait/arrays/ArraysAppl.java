package ait.arrays;

import ait.arrays.tools.ArrayToolls;

public class ArraysAppl {
    public static void main(String[] args) {
        int[]arr=new int[10];
        ArrayToolls.fillArray(arr,10,99);
        ArrayToolls.printArray(arr);
        int res = ArrayToolls.minArray(arr);
        System.out.println("min = "+res);
        ArrayToolls.bubbleSort(arr);
        ArrayToolls.printArray(arr);

    }

}
