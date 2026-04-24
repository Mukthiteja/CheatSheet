package org.example.Question3;

public class LinearSearch {
    static void linearSearch(int[] arr,int x){
        boolean flag=false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==x){
                flag=true;
                break;//optimization step
            }
        }
        if(flag){
            System.out.println("found");
        }else {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,59,20,9,2,8};
        int x=2;
        linearSearch(arr,x);
    }
}
