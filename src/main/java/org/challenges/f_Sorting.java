package org.challenges;

import java.util.Arrays;

public class f_Sorting {

    public static void main(String[] args) {
        int[] arr={55,44,1,6};
        int[] new_arr = bruteforce_sorting(arr);
        System.out.println(Arrays.toString(new_arr));
    }

    public static int[] bruteforce_sorting(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp;
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

