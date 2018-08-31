package OOP.Lesson8_Generics;

public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        Box<Character> charBox = new Box<>();
        Box<Double> doubleBox = new Box<>();
        Box<Boolean> boolBox = new Box<>();

        integerBox.add(10);
        stringBox.add(new String("Hello World"));
        charBox.add('A');
        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n\n", stringBox.get());
        System.out.printf("Character Value :%s\n", charBox.get());
    }
}
