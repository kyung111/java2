package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {

        /* 수업 목표.
            - 비교연산자에 대해 이해하고 활용할 수 있다.

           필기.
            - 비교연산자.
             비교연산자는 피연산자 사이에서 크기를 판단하여
             참(True) 혹은 거짓(False)을 반환하는 연산자.

             연산자 중 참 혹은 거짓을 반환하는 연산자는
             삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다. (충분한 연습 필요)

           필기.
            - 비교연산자의 종류
             == : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환.
             != : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환.
             > : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 다르면 false를 반환.
             >= : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true 다르면 false를 반환.
             < : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 다르면 false를 반환.
             <= : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true 다르면 false를 반환.

         */

        // 1. 숫자값 비교.
        //    1. 정수 비교
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("=== 정수값 비교 ===");
        System.out.println(inum1 == inum2);
        System.out.println(inum1 != inum2);
        System.out.println(inum1 > inum2);
        System.out.println(inum1 >= inum2);
        System.out.println(inum1 < inum2);
        System.out.println(inum1 <= inum2);

        //  1-2. 실수 비교
        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println("==== 실수값 비교 ====");
        System.out.println(dnum1 == dnum2);
        System.out.println(dnum1 != dnum2);
        System.out.println(dnum1 > dnum2);
        System.out.println(dnum1 >= dnum2);
        System.out.println(dnum1 < dnum2);
        System.out.println(dnum1 <= dnum2);


        // 2. 문자값 비교
        char ch1 = 'a';
        char ch2 = 'b';

        System.out.println("==== 문자값 비교 ===");
        System.out.println(ch1 == ch2);
        System.out.println(ch1 != ch2);
        System.out.println(ch1 > ch2);
        System.out.println(ch1 >= ch2);
        System.out.println(ch1 < ch2);
        System.out.println(ch1 <= ch2);


        // 3. 논리값 비교
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("====== 논리값 비교 ======");
        System.out.println(bool1 == bool2);
        System.out.println(bool1 != bool2);


        // 4. 문자열 비교.
        String str1 = "java";
        String str2 = "java";

        System.out.println("======= 문자값 비교 ======");
        System.out.println(str1 == str2);
        System.out.println(str1 != str2);

    }
}
