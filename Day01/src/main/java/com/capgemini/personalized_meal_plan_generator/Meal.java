package com.capgemini.personalized_meal_plan_generator;

public class Meal <T extends MealPlan>{

    //define attributes
    private T mealPlan;

    //constructor
    public Meal(T mealPlan){
        this.mealPlan = mealPlan;
    }
    //getter method to get meal type
    public T getMealType() {
        return mealPlan;
    }

    public void displayMeal(){
        mealPlan.displayMeal();
    }
}
