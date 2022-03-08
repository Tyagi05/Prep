package com.preparation;
import java.util.*;
public class Test {
    public static void main (String[] arg){
        Scanner sc= new Scanner(System.in);
        int  sum =0;
        int N=sc.nextInt();
        for(int i=1;i<N;i++) {
            if (N % i == 0) {
                sum = sum + i;

            }
        }

            if(N==sum){
                System.out.println("yes");

            }
            else
                System.out.println("false");



    }
}
