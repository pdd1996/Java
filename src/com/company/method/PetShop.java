package com.company.method;

public class PetShop {
    public void replaceFirstDog(String[] pets){
        System.out.println("目前宠物：");
        for (String pet : pets){
            System.out.println(pet);
        }
        System.out.println();

        if (pets != null){
            pets[0]="憨憨";
        }
    }
}
