package com.ohgiraffers.section06.scaner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* 수업 목표.
            - Scanner의 nextLine()과 next()에 대해 구분하여 사용할 수있다.

          필기.
            nextLine() : 공백을 포함한 한줄을 입력을 위한 개행 문자 전까지 읽어서 문자열로 반환(공백 문자까지 포함)
            next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환. (공백문자 포함하지 않음)
         */

        Scanner sc = new Scanner(System.in);    // !!!외우기!!!

        // nextLine()
        System.out.print("인사말을 입력해 주세요 :");
        String greeting1 = sc.nextLine();
        System.out.println("greeting1 = " + greeting1);

        // next()
        System.out.print("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();
        System.out.println("greeting2 = " + greeting2);

        greeting2 = sc.next();
        System.out.println("greeting2 = " + greeting2);



    }
}
