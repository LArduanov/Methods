public class QuadraticEquation {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 3;
        int d = discriminant(a, b, c);
        roots(d, a, b);
    }
    // Вычисляем дискриминант
    static int discriminant(int a, int b, int c) {
        System.out.println("Решаем квадратное уравнение:");
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        int d = b * b - 4 * a * c;
        System.out.println("Дискриминант равен - " + d);
        return d;
    }
    // Находим корни
    static void roots(int d, int a, int b) {
        if (d > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Первый корень х1 = " + x1);
            System.out.println("Второй корень х2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет 1 корень х = " + x);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
