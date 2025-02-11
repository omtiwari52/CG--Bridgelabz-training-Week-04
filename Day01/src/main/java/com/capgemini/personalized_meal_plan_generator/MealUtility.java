package com.capgemini.personalized_meal_plan_generator;

import java.util.ArrayList;
import java.util.List;

public class MealUtility {
    private List<Meal<? extends MealPlan>> mealPlan = new ArrayList<>();

    void add(Meal<? extends MealPlan> meal, String category) {
        if (meal.getMealType().getCategory().equals(category)) {
            this.mealPlan.add(meal);
        }
    }

    public void displayMeal() {
        for (Meal<? extends MealPlan> meal : mealPlan) {
            meal.displayMeal();
            System.out.println("---------------------------------");
        }
    }
}
