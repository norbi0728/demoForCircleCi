public class Operations {
    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mult(int a, int b){
        return a * b;
    }

    public static double div(int a, int b){
        if(b != 0)
            return a / b;
        else
            throw new ArithmeticException();
    }
}
