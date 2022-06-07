public class Factorial {
    public static void main(String[] args) {
        int number = 4;
        int degree = 3;
        exponentiation(number, degree);
        factorial(number);
    }
    // Возведение в степень
    static void exponentiation(int x, int y) {
        int exp = 1;
        for (int i = 0; i < y; i++) {
            exp = exp * x;
        }
        System.out.println(exp);
    }
    // Факториал
    static void factorial(int x) {
        int j = x;
        int fact = 1;
        for (int i = 0; x > i; i++) {
            fact = (fact * j--);
        }
        System.out.println(fact);
    }
}
