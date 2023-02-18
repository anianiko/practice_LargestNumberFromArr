package org.example;

public class Main {
    public static void main(String[] args) {

        int[] arr = {-1,-2,-6,-12,-99,-4,-3,-76};
        System.out.println(maxNum(arr));
    }

    public static int maxNum(int[] arr) {
        int holder = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>holder) {
                holder = arr[i];
            }
        }
        return holder;
    }

}