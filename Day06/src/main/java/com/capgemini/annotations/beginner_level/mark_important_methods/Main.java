package com.capgemini.annotations.beginner_level.mark_important_methods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        try{
            //get class
            Class<?> cls = ImportantMethods.class;

            //get method of class
            for(Method method : cls.getDeclaredMethods()){
                if(method.isAnnotationPresent(ImportantMethod.class)){
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);

                    System.out.println("Important methods found: ");
                    System.out.println("- Method :"+ method.getName());
                    System.out.println("- Importance Level: "+ annotation.level());
                    System.out.println("-------------------------------");
                }
            }

            ImportantMethods importantMethods = new ImportantMethods();
            importantMethods.gameLevel();
            importantMethods.studyLevel();


        } catch (SecurityException e) {
            throw new RuntimeException(e);
        }
    }
}
