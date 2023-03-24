package com.company.method;

public class WaitList {
    public void pirntWaitAccount(int waiter){

        System.out.println("当前排队人数: " + waiter);
        waiter++;
        System.out.println("更新排队人数: " + waiter );
    }
}
