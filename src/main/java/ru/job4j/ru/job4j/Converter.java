package ru.job4j.calculator;
 {
public class MathFunc {

    public static int func1(int x) {
        int y = 50 * 49 + 1;
        return y;
    }
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinTwo);
        System.out.println(fourTimeTwo);
        int result1 = MathFunc.func1(100);
        System.out.println(result1);
    }
}