package com.lxgzhw520.day001;

public class Demo10Array {
    public static void main(String[] args) {
        //数组
        int[] array1 = new int[300];
        double[] array2 = new double[10];
        String[] array3 = new String[10];

        //带参数的数组
        array1 = new int[]{1, 2, 3, 4};
        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array3);

        int[] array4 = {11, 22, 33};
        System.out.println(array4);
        System.out.println(array4[1]);
    }
}
