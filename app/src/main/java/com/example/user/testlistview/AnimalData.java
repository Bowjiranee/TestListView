package com.example.user.testlistview;

import com.example.user.testlistview.model.Animal;

import java.util.ArrayList;


public class AnimalData {
    private static AnimalData sInstance;

    public ArrayList<Animal> animalList;

    public static AnimalData getInstance(){
        if(sInstance == null){
            sInstance = new AnimalData();
        }
        return  sInstance;
    }
}
