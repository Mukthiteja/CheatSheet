package org.example.Question2;

public class SecondLargestElt {
    static void sLargestElt(int[] arr){
        int max=Integer.MIN_VALUE;
        int n= arr.length;
        for (int i = 0; i <n-1; i++) {
            if(max < arr[i]) max=arr[i];
        }
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(smax < arr[i] && max != arr[i]){
                smax=arr[i];
            }
        }
        if(smax == Integer.MIN_VALUE){
            //to handle the identical elements int[] arr={1,1,1};
            System.out.println("Array is identical");
        }else{
            System.out.println(smax);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,59,20,9,2,8};
        sLargestElt(arr);
    }
}
