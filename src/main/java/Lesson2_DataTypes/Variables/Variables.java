package Lesson2_DataTypes.Variables;

public class Variables {
    // Переменная экземпляра, в классе, но вне методов
    int instanceField;
    /*
     * Below variable is STATIC variable as it is outside any method and it is
     * using STATIC modifier with it.
     */
    static String staticField;

    //Модификаторы доступа могут быть предоставлены для переменных
    //экземпляра.
    private int count;

    public void method() {
        /*
         * Below variable is LOCAL VARIABLE as it is defined inside method in
         * class. Only modifier that can be applied on local variable is FINAL.
         * Note* : Local variable needs to initialize before they can be used.
         * Which is not true for Static or Instance variable.
         */
        final String localVariable = "Initial Value";
        System.out.println(localVariable);
    }

    public static void main(String args[]) {
        // Переменные экземпляра создаются тогда, когда объект создан с
        // помощью ключевого слова «new» и разрушаются тогда, когда объект
        // уничтожается.
        Variables obj = new Variables();
        /*
         * Переменная экземпляра может быть доступна объекту таким образом.
         */
        System.out.println(obj.instanceField);
        /*
         * Static field can be accessed in two way.
         * 1- Via Object of the class
         * 2- Via CLASS name
         */
        System.out.println(obj.staticField);
        System.out.println(Variables.staticField);
        System.out.println(new Variables().instanceField);
    }
}
