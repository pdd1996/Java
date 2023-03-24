package com.company;

import com.company.method.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student();

        student.study();
        student.study("张三");
        student.study(20, "李四", "男");
    }
}
