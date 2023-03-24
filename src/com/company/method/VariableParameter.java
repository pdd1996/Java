package com.company.method;

public class VariableParameter {
    // 可变参数
    public void search(int element, int... elements){
        boolean existed = false;
        for (int i : elements){
            if (i == element){
                existed = true;
                break;
            }
        }
        if (existed){
            System.out.println("查找成功");
        } else {
          System.out.println("查找失败: " + element);
        }
    }
}
