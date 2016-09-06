package com.example;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class MyClass {

    public static void main(String[] args)
    {
        byte firstByte = 2;
        short secondShort = 32767;
        int thirdInt = 2147483647;
        long fourthLong = 999999999;
        float fifthFloat = 3.14f;
        double sixthDouble = 3.14159;
        boolean seventhBool = true;
        char eighthChar = 'A';

        System.out.println();
        System.out.println();
        System.out.println(firstByte+ ", " +secondShort+ ", "+thirdInt+ ", "+ fourthLong);
        System.out.println(fifthFloat+ ", "+sixthDouble+ ", "+seventhBool+ ", "+eighthChar);



    }

}
