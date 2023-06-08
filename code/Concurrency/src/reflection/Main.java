package reflection;

import annotations.MyAnnotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        // Created an object
        Dummy dummy = new Dummy(20, "ABC");


        Field[] declaredFields = dummy.getClass().getDeclaredFields();

        for(Field declaredField: declaredFields) {
            System.out.println(declaredField.getName());
            declaredField.setAccessible(true);
            System.out.println(declaredField.get(dummy));
            if (declaredField.getName().equals("age")) {
                declaredField.set(dummy, 40);
            }
        }

        Method[] methods = dummy.getClass().getDeclaredMethods();

        for (Method method: methods) {
            System.out.println(method.getName());
            if (method.getName().equals("privatePrint")) {
                method.setAccessible(true);
                method.invoke(dummy);

                if (method.getDeclaredAnnotations().length!= 0) {
                    System.out.println(method.getName() + " method is important");
                }
            }
        }

//        dummy.getClass().getAnnotations();
//        dummy.getClass().getConstructors();



    }
}
