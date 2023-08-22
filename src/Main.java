import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args)  {

        Scanner keyboard = new Scanner(in);
        System.out.println("Введите первое число:");
        double a= keyboard.nextDouble();
        System.out.println("Введите второе число:");
        double b= keyboard.nextDouble();

try {
    if (b == 0) {
        throw new ZeroException("На ноль делить нельзя!");
    }
    double result = a / b;
    System.out.printf("%4.2f", result);
} catch (ZeroException e) {
    System.out.println(e.getMessage());
}

    }
}