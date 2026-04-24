package org.example.Question1;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num=31;
        if(isprime(num)){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not a prime");
        }
    }

    public static boolean isprime(int num){
        int count=0;
        for (int i = 1; i * i <=num ; i++) {
            if(num%i==0){
                count++;
                if(num/i!=i){
                    count++;
                }
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}
