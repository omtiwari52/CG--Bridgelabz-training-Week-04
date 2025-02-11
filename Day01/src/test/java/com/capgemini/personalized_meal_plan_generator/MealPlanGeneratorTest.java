package com.capgemini.personalized_meal_plan_generator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MealPlanGeneratorTest {

    HighProteinMeal highProteinMeal = new HighProteinMeal("Peanut Butter", "High protein meal", 1200);
    Meal<HighProteinMeal> peanutButter = new Meal<>(highProteinMeal);
    MealUtility proteinMealUtility = new MealUtility();

    @Test
    void testMethod() {
        // add value to the meals
        proteinMealUtility.add(peanutButter, "High protein meal");
        assertEquals("Peanut Butter", peanutButter.getMealType().getName());
        assertEquals(1200, peanutButter.getMealType().getPrice());
        assertEquals("High protein meal", peanutButter.getMealType().getCategory());
    }

}