package com.ssi.string;

public class StringTest {
    public static void main(String[] args) {
        // == and equals
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "ab" + "c";
        String str4 = "ab";
        String str5 = "c";
        String str6 = str4 + str5;


        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str6);

        //compare
        String str7 = "abc";
        String str8 = "abd";
        String str9 = "abc";
        String str10 = "abb";
        System.out.println(str7.compareTo(str8));
        System.out.println(str7.compareTo(str9));
        System.out.println(str7.compareTo(str10));
//
        //substring
        String str11 = "abcdefg";

        System.out.println(str11.substring(1,4));


    }
}
