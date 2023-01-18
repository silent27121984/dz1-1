public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);//делить на ноль нельзя, добовляем проверку (x == 0 || y ==0) ? 0 : (x / y);
        calc.println.accept(c);
    }
}

