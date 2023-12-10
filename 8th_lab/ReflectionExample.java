import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void createInstanceAndInvokeMethod(String className, String methodName) {
        try {
            // Load the class
            Class<?> clazz = Class.forName(className);

            // Create an instance using the default constructor
            Constructor<?> constructor = clazz.getConstructor(); // must throw exception for SomeClass below
            Object obj = constructor.newInstance();

            // Invoke the specified method
            Method method = clazz.getDeclaredMethod(methodName);
            method.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Example: Creating an instance of SomeClass and invoking the execute method
        createInstanceAndInvokeMethod("SomeClass", "execute");
    }
}

class SomeClass {
    private int number = 5;
    private String text = "some string";

    public void execute() {
        System.out.println("number = " + number + "; text = " + text);
    }
}