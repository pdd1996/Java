package com.company.method;

public class Car {
    public void speedUp(int speed) {
        // 基本类型
        /*   值传递
         *  调用值的复制，互不影响
         *  内部任何变化，都不影响到外部
         */
        System.out.println("加速前: " + speed);
        speed++;
        System.out.println("加速后: " + speed);
    }
}
