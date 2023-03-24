package com.company.method;

public class Student {
    // 方法的重载  方法名相同，参数的类型或参数的个数不同
    public void study(){
        System.out.println("新学期你好");
    }

    public void study(String name){
        System.out.println("你好, "  + name);
    }

    public void study(int age, String name, String gender){
        System.out.println("你好 " + name + ", 年龄 " + age + ", 性别 " + gender);
    }

    // 不是方法的重载，不允许
//    public String study(){
//        return "你好";
//    }
}
