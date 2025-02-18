package com.capgemini.annotations.beginner_level.mark_important_methods;

public class ImportantMethods {

    //method to print level of game in which you are
    @ImportantMethod(level = "MEDIUM")
    public void gameLevel(){
        System.out.println("Loading your game level....");
    }

    //method to print level in which you are now
    @ImportantMethod(level = "INTERMEDIATE")
    public void studyLevel(){
        System.out.println("Loading your Study level....");
    }
}
