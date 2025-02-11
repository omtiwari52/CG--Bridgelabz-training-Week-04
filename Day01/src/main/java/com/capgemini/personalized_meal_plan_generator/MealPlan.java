package com.capgemini.personalized_meal_plan_generator;

public interface MealPlan {

    //define attributes
    String getName();
    String getCategory();
    double getPrice();


    //method to display meal details
    void displayMeal();
}
