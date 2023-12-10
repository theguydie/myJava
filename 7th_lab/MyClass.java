public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void swapValues(MyClass obj1, MyClass obj2) {
        int temp = obj1.getValue();
        obj1.setValue(obj2.getValue());
        obj2.setValue(temp);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(5);
        MyClass obj2 = new MyClass(10);
        
        System.out.println("Before swapping - obj1 value: " + obj1.getValue() + ", obj2 value: " + obj2.getValue());
        
        swapValues(obj1, obj2);
        
        System.out.println("After swapping - obj1 value: " + obj1.getValue() + ", obj2 value: " + obj2.getValue());
    }
}
