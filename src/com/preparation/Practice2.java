package com.preparation;

public class Practice2 {


        public static void main(String[] args) {

            String str = "wersource.com";
            System.out.println("Original String : " + str);

            int ctr = str.codePointCount(1, 10);


            System.out.println("Codepoint count = " + ctr);
        }
    }

