package com.company.method;

public class MethodDemo4 {
    // 带参数带返回值
    public int Area(int a, int b){
        int area = a * b;
        return area;
    }

    public boolean isContain(int[] arr, int a){
        boolean result = false;

        for (int value : arr){
            if(value == a){
                result = true;
                break;
            }
        }
        return result;
    }
}
