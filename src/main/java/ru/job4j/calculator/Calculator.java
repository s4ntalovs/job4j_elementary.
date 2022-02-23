package ru.job4j.calculator;

public class MathFunc {

    public static int func1(int x) {
        int y = 50 * 49 + 1;
        return y;
    }
    public static void main(String[] args) {
        int result1 = MathFunc.func1(100);
        System.out.println(result1);
    }
}