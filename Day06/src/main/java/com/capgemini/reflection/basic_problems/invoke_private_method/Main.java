    package com.capgemini.reflection.basic_problems.invoke_private_method;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.lang.reflect.InvocationTargetException;
    import java.lang.reflect.Method;

    public class Main {
        public static void main(String[] args) throws ClassNotFoundException{
            try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

                //create an instance of person
                Calculator calculator = new Calculator();

                //Get class object
                Class<?> calculatorClass = calculator.getClass();

                //Access private method
                Method method = calculatorClass.getDeclaredMethod("multiply", int.class, int.class);

                //allow modification to private method
                method.setAccessible(true);

                //get value from user
                System.out.print("Enter value of a: ");
                int a = Integer.parseInt(br.readLine());

                System.out.print("Enter value of b: ");
                int b = Integer.parseInt(br.readLine());

                //invoke method dynamically
                int result = (int) method.invoke(calculator,a,b);

                System.out.println("Multiplication Result: "+ result);


            } catch (IllegalAccessException | IOException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
