package com.capgemini.personalized_meal_plan_generator;

public class Main {
    public static void main(String[] args) {

        HighProteinMeal highProteinMeal = new HighProteinMeal("Peanut Butter","High protein meal", 1200);
        HighProteinMeal highProteinMeal2 = new HighProteinMeal("Peanut Buttergchgcg","High protein meal", 200);
        VeganMeal vegan = new VeganMeal("Nuts","vegan meal", 1200);
        KetoMeal keto = new KetoMeal("Chia Seeds","keto meal", 1200);
        Meal<HighProteinMeal> peanutButter = new Meal<>(highProteinMeal);
        Meal<HighProteinMeal> peanutButter2 = new Meal<>(highProteinMeal2);
        Meal<VeganMeal> veganmeal1 = new Meal<>(vegan);
        Meal<KetoMeal> keto1 = new Meal<>(keto);
        MealUtility proteinMealUtility = new MealUtility();
        MealUtility ketoMealUtility = new MealUtility();
        MealUtility veganMealUtility = new MealUtility();

        proteinMealUtility.add(peanutButter,"High protein meal");
        proteinMealUtility.add(peanutButter2,"High protein meal");
        veganMealUtility.add(veganmeal1,"vegan meal");
        ketoMealUtility.add(keto1,"keto meal");

        System.out.println("------This is Protein Meal--------");
        proteinMealUtility.displayMeal();
        System.out.println("------This is Vegan Meal--------");
        veganMealUtility.displayMeal();
        System.out.println("------This is Keto Meal--------");
        ketoMealUtility.displayMeal();
    }
}
