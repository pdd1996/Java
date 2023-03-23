package com.company;

import com.company.method.MethodDemo4;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MethodDemo4 demo4 = new MethodDemo4();
        int[] arr = {1, 2, 3, 5};
        boolean result = demo4.isContain(arr, 4);
        System.out.println("结果: " + result);
    }
}
