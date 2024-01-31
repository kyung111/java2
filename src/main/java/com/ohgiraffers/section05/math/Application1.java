package com.ohgiraffers.section05.math;

public class Application1 {
    public static void main(String[] args) {

        /* 수업 목표.
            - math 클래스에서 제공하는 static 메소드를 호출할 수 있다.

           API란?
           Application Progrmming Interface는 응용플로그램에서 사용할 수 있도록,
           운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻함.
           쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 JDK를 설치하면
           사용할 수 있도록 제공하는 소스코드(클래스나 인터페이스)들을 의미함.

           즉, 누가 작성해놓은 소스코드를 그대로 가져다 쓰는 방법을 본다는 말.
           모든 코드를 우리가 다 외울 수 없으니 API 문서를 별도로 제공해주고 있다.

           필기.
                java.long.Math
                Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스.
                모든 메소드는 static 메소드로 작성되어 있음.
         */

        // 1. 절대값 출력.
        //     1-1. 클래스의 full-name을 다 적은 경우.
        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));

        //     1-2. import를 해서 사용.
        System.out.println("-1.25의 절대값 : " + (Math.abs(-1.25)));

        // 2. 최대값, 최소값 출력.
        System.out.println(Math.min(10,20));    // 10,20 중에 최소값 찾는 거
        System.out.println(Math.max(20,30));    // 20,30 중에 최대값 찾는 거

        System.out.println(Math.PI);    // Math를 사용하여 원주율 확인 가능 "(PI) 사용", 값. 3.141592653589793


        // 3. 난수 출력.
        //    렌덤으로 난수가 출력됨 > 출력할때마다 숫자가 다르게 나옴.

        System.out.println(Math.random());
        //      값. 1차 출력 시 : 0.8864222659204664
        //          2차 출력 시 : 0.6187608939794225
        //          3차 출력 시 : 0.7035921045708006


    }
}
