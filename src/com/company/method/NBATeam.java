package com.company.method;

public class NBATeam {
    public void editTeam(String[] players){
        System.out.println("现有球员: ");
        // 无法直接访问数组，得遍历数组
        for (String player : players){
            System.out.println(player + '\t');
        }
        System.out.println();
        /**
         * 引用类型，内部操作，外部也受影响
         */
        if(players != null){
            players[0]="科比";
        }
    }
}
