package Lesson19_Generics;

public class TwoGenerics {

    public static void main(String[] args) {

        Acc<String, Double> acc1 = new Acc<String, Double>("354", 5000.87);
        Acc<String, String> acc2 = new Acc<String, String>("354", "hello");
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.printf("Id: %s  Sum: %f \n", id, sum);
    }
}

class Acc<T, S>{

    private T id;
    private S sum;

    Acc(T id, S sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public S getSum() { return sum; }
    public void setSum(S sum) { this.sum = sum; }
}