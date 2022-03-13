package com.company;


import java.util.Scanner;
class Main{
    public static String reversString(String input){
        char[] a = new char[input.length()];
        a= input.toCharArray();
        String str="";
        for(int i=(a.length-1);i>=0;i--){
            str += a[i];

        }
        return str;
//write the logic
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");

        String originalString = sc.next();;
        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);
    }
}



