package com.preparation;

public class Mock {

    static int x=2;
    public final static void main(String[] s){
        int[] a=new int[x];
        a[0]=2;
        for(int i:a)
            System.out.println(i);
    }
}
